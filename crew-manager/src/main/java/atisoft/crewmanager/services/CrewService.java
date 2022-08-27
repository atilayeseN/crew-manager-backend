package atisoft.crewmanager.services;

import java.util.List;
import java.util.Optional;

import atisoft.crewmanager.models.Crew;

public interface CrewService {
	
	List<Crew> getCrews();
	
	Optional<Crew> getCrewByID(String id);
	
	Crew addCrew(Crew crew);
	
	void deleteCrew(Crew crew);

}
