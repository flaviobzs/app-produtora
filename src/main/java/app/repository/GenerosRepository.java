package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.resources.domain.Genero;

public interface GenerosRepository extends JpaRepository<Genero, Long> {

}
