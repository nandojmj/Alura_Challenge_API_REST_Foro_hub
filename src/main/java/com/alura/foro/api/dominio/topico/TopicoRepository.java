package com.alura.foro.api.dominio.topico;

import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que gestiona la interacción con la base de datos para la entidad Topico
public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
