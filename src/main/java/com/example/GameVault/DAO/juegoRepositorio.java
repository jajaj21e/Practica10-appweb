package com.example.GameVault.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.GameVault.model.Juego;
import java.util.List;

@Repository
public interface juegoRepositorio extends JpaRepository<Juego, Integer> {

    // SELECT * FROM juegos WHERE titulo LIKE titulo
    List<Juego> findByTituloContainingIgnoreCase(String titulo);

    List<Juego> findByDescripcionContainingIgnoreCase(String descripcion);

    // List<Juego>
    // findByTituloContainingIgnoreCaseOrDescripcionContainingIgnoreCase(String
    // titulo, String descripcion);
    //@Query("SELECT j FROM Juego j WHERE LOWER(j.titulo) LIKE LOWER(CONCAT('%', :filtro, '%')) OR LOWER(j.descripcion) LIKE LOWER(CONCAT('%', :filtro, '%'))")
    //List<Juego> searchByTituloOrDescripcion(@Param("filtro") String filtro);
}
