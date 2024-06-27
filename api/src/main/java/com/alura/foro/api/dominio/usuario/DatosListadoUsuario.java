package com.alura.foro.api.dominio.usuario;

/**
 * Record `DatosListadoUsuario` que representa la información básica de un usuario para listados.
 * Utiliza la funcionalidad de `record` de Java para definir un DTO inmutable.
 */
public record DatosListadoUsuario(
        Long id,         // El ID único del usuario.
        String nombre,   // El nombre del usuario.
        String email,    // El correo electrónico del usuario.
        String perfil) { // El perfil del usuario convertido a String.

    /**
     * Constructor que acepta un objeto `Usuario` y extrae sus campos para inicializar el record.
     *
     * @param usuario El objeto `Usuario` del cual se extraen los datos.
     */
    public DatosListadoUsuario(Usuario usuario) {
        this(
                usuario.getId(),               // Inicializa el campo `id` con el ID del usuario.
                usuario.getNombre(),           // Inicializa el campo `nombre` con el nombre del usuario.
                usuario.getEmail(),            // Inicializa el campo `email` con el email del usuario.
                usuario.getPerfil().toString() // Convierte el perfil del usuario a String para inicializar el campo `perfil`.
        );
    }
}
