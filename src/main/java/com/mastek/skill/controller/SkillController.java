package com.mastek.skill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.skill.model.Skill;
import com.mastek.skill.service.SkillService;

@RestController
public class SkillController {
	
	@Autowired(required=true)
	SkillService service;
	
	@GetMapping("/skills")
	public Iterable<Skill> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/skill/{skill_id}")
	public Skill findById(@PathVariable int skill_id) {
		return service.findById(skill_id);
	}
	
	@PostMapping("/skill/save")
	public String save(@RequestBody Skill skill) {
		return service.save(skill);
	}
	
	@PostMapping("/skill/update/{skill_id}/{priority}")
	public String update(@PathVariable int skill_id, @PathVariable int priority){
		return service.update(skill_id,priority);
	}
	
	@DeleteMapping("/skill/delete/{skill_id}")
	public String deleteById(@PathVariable int skill_id) {
		return service.deleteById(skill_id);
	}

}
