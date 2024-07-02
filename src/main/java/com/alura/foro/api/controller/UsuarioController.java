package com.alura.foro.api.controller;


import com.alura.foro.api.dominio.usuario.*;
import com.alura.foro.api.dominio.usuario.Usuario;
import com.alura.foro.api.dominio.usuario.UsuarioRepository;
import com.alura.foro.api.dominio.usuario.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
@SecurityRequirement(name = "bearer-key")  // Requerimiento de seguridad para todas las operaciones
@Tag(name = "Usuarios", description = "Crear y Consultar Usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;  // Servicio para operaciones de usuario

    @Autowired
    private UsuarioRepository usuarioRepository;  // Repositorio de usuarios

    /**
     * Endpoint para registrar un nuevo usuario.
     *
     * @param datosRegistro Datos del usuario a registrar.
     * @param uri           Builder para construir la URI de respuesta.
     * @return Respuesta con los datos del usuario registrado y la URL de ubicación.
     */
    @PostMapping("/register")
    @Transactional
    @Operation(summary = "Registra un usuario en la base de datos (USER)")
    public ResponseEntity<DatosRespuestaUsuario> registrar(
            @RequestBody @Valid DatosRegistroUsuario datosRegistro,
            UriComponentsBuilder uri) {

        // Llama al servicio para crear un usuario y obtener los datos de respuesta
        DatosRespuestaUsuario datosRespuesta = usuarioService.crearUsuarioUser(datosRegistro);

        // Construye la URL de la ubicación del nuevo usuario registrado
        URI url = uri.path("{id}").buildAndExpand(datosRespuesta.id()).toUri();

        // Devuelve una respuesta con código 201 Created y los datos del usuario registrado
        return ResponseEntity.created(url).body(datosRespuesta);
    }

    /**
     * Endpoint para listar todos los usuarios activos.
     *
     * @param paginacion Paginación de resultados.
     * @return Lista paginada de usuarios activos.
     */
    @GetMapping
    @Operation(
            summary = "Consulta todos los usuarios en la base de datos")
    public ResponseEntity<Page<DatosListadoUsuario>> listar(
            @PageableDefault(size = 10) Pageable paginacion) {

        // Obtiene una página de usuarios activos usando el repositorio
        Page<DatosListadoUsuario> paginaUsuarios = usuarioRepository.findByActivoTrue(paginacion)
                .map(DatosListadoUsuario::new);

        // Devuelve una respuesta con la página de usuarios activos
        return ResponseEntity.ok(paginaUsuarios);
    }

    /**
     * Endpoint para consultar los datos de un usuario por su ID.
     *
     * @param id ID del usuario a consultar.
     * @return Respuesta con los datos del usuario consultado.
     */
    @GetMapping("/{id}")
    @Operation(summary = "Consulta un usuario por ID en la base de datos")
    public ResponseEntity<DatosRespuestaUsuarioId> retornaDatos(
            @PathVariable Long id) {

        // Busca un usuario por su ID usando el repositorio
        Usuario usuario = usuarioRepository.getReferenceById(id);

        // Devuelve una respuesta con los datos detallados del usuario consultado
        return ResponseEntity.ok(new DatosRespuestaUsuarioId(usuario));
    }

//    @PutMapping
//    @Transactional
//    @Operation(
//            summary = "Actualiza el usuario en la base de datos",
//            description = "Solo el ROLE_ADMIN puede actualizar el tipo ")
//    public ResponseEntity<DatosRespuestaUsuario> actualizar(
//            @RequestBody
//            @Valid
//            DatosActualizarUsuario datosActualizar) {
//        DatosRespuestaUsuario datosRespuesta = usuarioService.actualizarUsuario(datosActualizar);
//        return ResponseEntity.ok(datosRespuesta);
//    }


}
