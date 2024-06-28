package com.alura.foro.api.dominio.curso;

// Registro que representa los datos de respuesta de un curso
public record DatosRespuestaCurso(String nombre, String categoria) {

    /**
     * Constructor que acepta un objeto Curso y extrae los datos necesarios.
     *
     * @param curso Objeto Curso del cual se extraen los datos de nombre y categoría.
     */
    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }


}
