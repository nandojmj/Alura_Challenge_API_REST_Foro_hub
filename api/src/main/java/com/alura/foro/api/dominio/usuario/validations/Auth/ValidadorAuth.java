package com.alura.foro.api.dominio.usuario.validations.Auth;

import com.alura.foro.api.dominio.usuario.DatosAutenticacionUsuario;

public interface ValidadorAuth {

    public void validar(DatosAutenticacionUsuario datosAutenticacion);
}
