package com.juanjomc.cursos.repository;

import com.juanjomc.cursos.model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JuegoRepository extends JpaRepository<Juego, Long> {
    // Método para buscar juegos por nombre (contiene)
    List<Juego> findByNombreContaining(String nombre);
}
