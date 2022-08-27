package atisoft.crewmanager.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atisoft.crewmanager.models.Crew;
import atisoft.crewmanager.services.CrewService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/crews")
public class Controller {
	@Autowired
	CrewService crewService;
	
	@GetMapping("") 
	public List<Crew> crewList() {
		return crewService.getCrews();
	}
	
	@GetMapping("/{id}")
	public Optional<Crew> getCrewByID(@PathVariable String id) {
		return crewService.getCrewByID(id);
	}
	
	@PostMapping("")
	public Crew addCrew(@RequestBody Crew crew) {
		return crewService.addCrew(crew);
	}
	
	@DeleteMapping("")
	public void deleteCrew(@RequestBody Crew crew) {
		crewService.deleteCrew(crew);
	}
	
}
