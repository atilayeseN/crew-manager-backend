package atisoft.crewmanager.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atisoft.crewmanager.models.Crew;
import atisoft.crewmanager.repository.CrewRepository;
import atisoft.crewmanager.services.CrewService;


@Service
public class CrewServiceImplementation implements CrewService{
	
	@Autowired
	CrewRepository crewRepository;
	

	@Override
	public List<Crew> getCrews() {
		return crewRepository.findAll();
	}

	@Override
	public Optional<Crew> getCrewByID(String id) {
		return crewRepository.findById(id);
	}

	@Override
	public Crew addCrew(Crew crew) {
		
		return crewRepository.save(crew);
		
	}

	@Override
	public void deleteCrew(Crew crew) {
		
		crewRepository.delete(crew);
		
	}

}
