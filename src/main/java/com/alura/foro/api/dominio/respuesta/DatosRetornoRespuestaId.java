package com.alura.foro.api.dominio.respuesta;

import com.alura.foro.api.dominio.topico.DatosRespuestaTopico;
import com.alura.foro.api.dominio.usuario.DatosRespuestaUsuario;

// Record que representa los datos de retorno de una respuesta por su ID
public record DatosRetornoRespuestaId(
        String mensaje, // Mensaje de la respuesta
        DatosRespuestaTopico topico, // Datos de respuesta del tópico asociado
        String fechaCreacion, // Fecha de creación de la respuesta en formato string
        DatosRespuestaUsuario autor, // Datos de respuesta del autor de la respuesta
        String solucion) { // Indica si la respuesta es marcada como solución o no

    /**
     * Constructor que acepta un objeto Respuesta y extrae los datos necesarios.
     *
     * @param respuesta Objeto Respuesta del cual se extraen los datos.
     */
    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), // Asigna el mensaje de la respuesta
                new DatosRespuestaTopico(respuesta.getTopico()), // Crea datos de respuesta del tópico asociado
                respuesta.getFechaCreacion().toString(), // Convierte la fecha de creación a string
                new DatosRespuestaUsuario(respuesta.getAutor()), // Crea datos de respuesta del autor
                respuesta.getSolucion().toString()); // Convierte el estado de solución a string
    }
}