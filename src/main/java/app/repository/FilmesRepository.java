package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.resources.domain.Filme;

public interface FilmesRepository extends JpaRepository<Filme, Long>{

}
