package com.mastek.skill.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="skill")
public class Skill {
	
	@Id
	private int skill_id;
	private String skill_name;
	private int priority;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(int skill_id, String skill_name, int priority) {
		super();
		this.skill_id = skill_id;
		this.skill_name = skill_name;
		this.priority = priority;
	}
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Skill [skill_id=" + skill_id + ", skill_name=" + skill_name + ", priority=" + priority + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + skill_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		if (skill_id != other.skill_id)
			return false;
		return true;
	}
	
	
	

	

}
