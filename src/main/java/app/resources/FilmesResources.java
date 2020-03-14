package app.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.repository.FilmesRepository;
import app.resources.domain.Filme;

@RestController
@RequestMapping("/filmes")
public class FilmesResources {

	@Autowired
	private FilmesRepository filmesRepository;

	@GetMapping
	public List<Filme> listarTodas() {
		return filmesRepository.findAll();
	}

	@PostMapping
	public void gravar(Filme filme) {
		filmesRepository.save(filme);
	}
	
	@PutMapping
	public void atualizar(@RequestBody Filme filme) {
		filmesRepository.save(filme);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Filme filme) {
		filmesRepository.delete(filme);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Filme> buscarPorId(@PathVariable("id") Long idFilme) {
		return filmesRepository.findById(idFilme);
	}
}
