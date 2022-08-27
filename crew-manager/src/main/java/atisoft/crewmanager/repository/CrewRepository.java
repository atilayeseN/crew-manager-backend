package atisoft.crewmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import atisoft.crewmanager.models.Crew;

@Repository
public interface CrewRepository extends MongoRepository<Crew, String>{

}
