package com.alura.foro.api.dominio.usuario;

/**
 * Record `DatosRespuestaUsuarioId` que representa la respuesta de un usuario con su ID.
 * Esta clase utiliza la funcionalidad de `record` de Java para definir un DTO inmutable.
 */
public record DatosRespuestaUsuarioId(
        String nombre,
        String email,
        String contrasena,
        String perfil) {

    /**
     * Constructor que acepta un objeto `Usuario` y extrae sus campos para inicializar el record.
     *
     * @param usuario El objeto `Usuario` del cual se extraen los datos.
     */
    public DatosRespuestaUsuarioId(Usuario usuario) {
        this(
                usuario.getNombre(),       // Inicializa el campo `nombre` con el nombre del usuario.
                usuario.getEmail(),        // Inicializa el campo `email` con el email del usuario.
                usuario.getContrasena(),   // Inicializa el campo `contrasena` con la contraseña del usuario.
                usuario.getPerfil().toString() // Convierte el perfil del usuario a String para inicializar el campo `perfil`.
        );
    }
}
