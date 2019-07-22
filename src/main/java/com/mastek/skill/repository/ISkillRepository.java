package com.mastek.skill.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.skill.model.Skill;
@Repository
public interface ISkillRepository extends CrudRepository<Skill, Integer>{

}
