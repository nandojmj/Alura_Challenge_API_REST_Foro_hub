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

    // Listar tópicos por curso
    @Query("SELECT t FROM Topico t WHERE t.curso.id = :cursoId AND t.activo = true")
    List<Topico> findByCursoId(@Param("cursoId") Long cursoId);

    // Listar tópicos por usuario (autor)
    @Query("SELECT t FROM Topico t WHERE t.autor.id = :usuarioId AND t.activo = true")
    List<Topico> findByUsuarioId(@Param("usuarioId") Long usuarioId);

    // Listar tópicos por estado
    @Query("SELECT t FROM Topico t WHERE t.estado = :estado AND t.activo = true")
    List<Topico> findByEstado(@Param("estado") Estado estado);
}



