package com.alura.foro.api.dominio.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// Interfaz que gestiona la interacción con la base de datos para la entidad Topico
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByActivoTrue(Pageable paginacion);

    // 1. Listar tópicos por curso
    @Query("SELECT t FROM Topico t WHERE t.curso.id = :cursoId")
    List<Topico> findByCursoId(@Param("cursoId") Long cursoId);

}
