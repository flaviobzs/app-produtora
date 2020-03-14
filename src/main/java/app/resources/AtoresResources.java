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

import app.repository.AtoresRepository;
import app.resources.domain.Ator;

@RestController
@RequestMapping("/atores")
public class AtoresResources {
	
	@Autowired
	private AtoresRepository atoresRepository;

	@GetMapping
	public List<Ator> listarTodas() {
		return atoresRepository.findAll();
	}

	@PostMapping
	public void gravar(Ator ator) {
		atoresRepository.save(ator);
	}
	
	@PutMapping
	public void atualizar(@RequestBody Ator ator) {
		atoresRepository.save(ator);
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Ator ator) {
		atoresRepository.delete(ator);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Ator> buscarPorId(@PathVariable("id") Long idAtor) {
		return atoresRepository.findById(idAtor);
	}

}
