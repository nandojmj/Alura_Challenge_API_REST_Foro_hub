package com.alura.foro.api.dominio.usuario;

/**
 * Clase para representar los datos de respuesta de un usuario.
 */

public record DatosRespuestaUsuario(
        Long id,
        String nombre,
        String email,
        String perfil) {

    /**
     * Constructor para convertir un objeto Usuario en DatosRespuestaUsuario.
     *
     * @param usuario El usuario del cual se obtendrán los datos.
     */

    public DatosRespuestaUsuario(Usuario usuario) {
        this(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getPerfil().toString());
    }
}