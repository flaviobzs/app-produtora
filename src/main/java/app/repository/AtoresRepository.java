package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.resources.domain.Ator;

@Repository
public interface AtoresRepository extends JpaRepository<Ator, Long>{

}
