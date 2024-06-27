package com.alura.foro.api.dominio.topico;

import com.alura.foro.api.dominio.curso.DatosRespuestaCurso;
import com.alura.foro.api.dominio.usuario.DatosRespuestaUsuario;

/**
 * Record que representa los datos de respuesta detallados de un tema (topico) en el foro.
 * Contiene información como el identificador, título, mensaje, fecha de creación, estado, detalles del autor y curso asociado.
 */
public record DatosRespuestaTopicoId(
        Long id, // Identificador único del tema
        String titulo, // Título del tema
        String mensaje, // Mensaje o contenido del tema
        String fechaCreacion, // Fecha de creación del tema en formato de cadena
        String estado, // Estado actual del tema (puede ser NO_RESPONDIDO, NO_SOLUCIONADO, SOLUCIONADO, CERRADO)
        DatosRespuestaUsuario autor, // Datos resumidos del autor del tema
        DatosRespuestaCurso curso // Datos resumidos del curso asociado al tema
) {

    /**
     * Constructor que convierte un objeto Topico en un objeto DatosRespuestaTopicoId para su respuesta detallada.
     *
     * @param topico El objeto Topico del cual se extraerán los datos.
     */
    public DatosRespuestaTopicoId(Topico topico) {
        this(
                topico.getId(), // Asigna el ID del tema
                topico.getTitulo(), // Asigna el título del tema
                topico.getMensaje(), // Asigna el mensaje del tema
                topico.getFechaCreacion().toString(), // Convierte la fecha de creación a cadena
                topico.getEstado().toString(), // Convierte el estado del tema a cadena
                new DatosRespuestaUsuario(topico.getAutor()), // Crea un objeto DatosRespuestaUsuario con los datos del autor
                new DatosRespuestaCurso(topico.getCurso()) // Crea un objeto DatosRespuestaCurso con los datos del curso asociado
        );
    }
}
