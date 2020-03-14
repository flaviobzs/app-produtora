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

import app.repository.GenerosRepository;
import app.resources.domain.Genero;

@RestController
@RequestMapping("/genero")
public class GenerosResources {
	
	@Autowired
	private GenerosRepository generosRepository;
	
	@GetMapping
	public List<Genero> listarTodas() {
		return generosRepository.findAll();
	}
	
	@PostMapping
	public void gravar(Genero genero) {
		generosRepository.save(genero);
	}
	
	@PutMapping
	public void atualizar(@RequestBody Genero genero) {
		generosRepository.save(genero);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Genero genero) {
		generosRepository.delete(genero);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Genero> buscarPorId(@PathVariable("id") Long idGenero) {
		return generosRepository.findById(idGenero);
	}

}
