package com.mastek.skill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.skill.model.Skill;
import com.mastek.skill.repository.ISkillRepository;

@Service
public class SkillService {
	
	@Autowired(required = true)
	private ISkillRepository repository;
	
	public Iterable<Skill> findAll(){
		return repository.findAll();
	}

	public Skill findById(int id) {
		return repository.findById(id).get();
	}
	
	public String save(Skill entity) {
		Skill newSkill=repository.save(entity);
		return "saved "+newSkill;
	}
	
	public String update(int id, int priority){
		Skill skill=findById(id);
		skill.setPriority(priority);
		repository.save(skill);
		return "updated "+skill;
	}
	
	public String deleteById(int id) {
		repository.deleteById(id);
		return "deleted";
	}
	
}
