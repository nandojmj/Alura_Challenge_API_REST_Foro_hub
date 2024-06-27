package com.alura.foro.api.controller;

import com.alura.foro.api.dominio.topico.*;
import com.alura.foro.api.dominio.curso.Curso;
import com.alura.foro.api.dominio.topico.Topico;
import com.alura.foro.api.dominio.usuario.Usuario;
import com.alura.foro.api.dominio.curso.CursoRepository;
import com.alura.foro.api.dominio.topico.TopicoRepository;
import com.alura.foro.api.dominio.usuario.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.transaction.annotation.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Controlador REST para gestionar operaciones relacionadas con los tópicos del foro.
 */
@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
@Tag(name = "Topicos", description = "Crear, Consultar, Actualizar y Eliminar Topicos")
@Validated
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    /**
     * Registra un nuevo tópico en la base de datos.
     *
     * @param datosRegistro Los datos de registro del tópico.
     * @param uri           Builder para la URI de respuesta.
     * @return ResponseEntity con los datos del tópico registrado y la URI de la respuesta creada.
     */
    @PostMapping
    @Transactional
    @Operation(summary = "Registra un tópico en la base de datos")
    public ResponseEntity<DatosRespuestaTopico> registrar(
            @RequestBody @Valid DatosRegistroTopico datosRegistro,
            UriComponentsBuilder uri) {
        Usuario autor = usuarioRepository.getReferenceById(datosRegistro.autorId());
        Curso curso = cursoRepository.getReferenceById(datosRegistro.cursoId());
        Topico topico = topicoRepository.save(new Topico(datosRegistro, autor, curso));
        DatosRespuestaTopico datosRespuesta = new DatosRespuestaTopico(topico);
        URI url = uri.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(datosRespuesta);
    }

    /**
     * Obtiene todos los tópicos activos en la base de datos paginados.
     *
     * @param paginacion La configuración de paginación para la consulta.
     * @return ResponseEntity con una página de tópicos listados.
     */
    @GetMapping
    @Operation(summary = "Consulta todos los tópicos en la base de datos")
    public ResponseEntity<Page<DatosListadoTopico>> listar(
            @PageableDefault(size = 10) Pageable paginacion) {
        Page<Topico> paginaTopicos = topicoRepository.findAll(paginacion);
        Page<DatosListadoTopico> paginaDTO = paginaTopicos.map(DatosListadoTopico::new);
        return ResponseEntity.ok(paginaDTO);
    }

    /**
     * Consulta un tópico por su ID en la base de datos.
     *
     * @param id El ID del tópico a consultar.
     * @return ResponseEntity con los datos del tópico consultado.
     */
    @GetMapping("/{id}")
    @Operation(summary = "Consulta un tópico por ID en la base de datos")
    public ResponseEntity<DatosRespuestaTopicoId> retornaDatos(
            @PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        DatosRespuestaTopicoId datosRespuesta = new DatosRespuestaTopicoId(topico);
        return ResponseEntity.ok(datosRespuesta);
    }

    /**
     * Actualiza un tópico en la base de datos.
     *
     * @param datosActualizar Los datos actualizados del tópico.
     * @return ResponseEntity con los datos del tópico actualizado.
     */
    @PutMapping
    @Transactional
    @Operation(summary = "Actualiza un tópico en la base de datos")
    public ResponseEntity<DatosRespuestaTopico> actualizar(
            @RequestBody @Valid DatosActualizarTopico datosActualizar) {
        Usuario autor = usuarioRepository.getReferenceById(datosActualizar.autorId());
        Curso curso = cursoRepository.getReferenceById(datosActualizar.cursoId());
        Topico topico = topicoRepository.getReferenceById(datosActualizar.id());
        topico.actualizarDatos(datosActualizar, autor, curso);
        DatosRespuestaTopico datosRespuesta = new DatosRespuestaTopico(topico);
        return ResponseEntity.ok(datosRespuesta);
    }

    /**
     * Elimina un tópico por su ID en la base de datos.
     *
     * @param id El ID del tópico a eliminar.
     * @return ResponseEntity indicando el éxito de la operación.
     */
    @DeleteMapping("/{id}")
    @Transactional
    @Operation(summary = "Cierra un tópico por ID en la base de datos (Elimina lógicamente). Solo perfil ADMIN",
            description = "Para esta solicitud el usuario debe tener derechos de administrador (PERFIL ADMIN)")
    public ResponseEntity<Void> eliminar(
            @PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        topico.cerrarTopico(); // Cambia el estado del tópico a cerrado
        return ResponseEntity.noContent().build();
    }
}