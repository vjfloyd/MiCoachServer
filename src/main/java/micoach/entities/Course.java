package micoach.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity(name="course")
@NamedQuery(name = "course.findByIdUser", query = "select c from course c, coursecost cc,  user u where u.iduser = cc.iduser and  cc.idcourse = c.idcourse  and u.iduser = ?1")    
public class Course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 77095990651617733L;
	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcourse;
	private String description;
	private Area idArea;
	private Level idLevel;
	
	public Course(){}

	public int getIdcourse() {
		return idcourse;
	}

	public void setIdcourse(int idcourse) {
		this.idcourse = idcourse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Area getIdArea() {
		return idArea;
	}

	public void setIdArea(Area idArea) {
		this.idArea = idArea;
	}

	public Level getIdLevel() {
		return idLevel;
	}

	public void setIdLevel(Level idLevel) {
		this.idLevel = idLevel;
	}

	
	
	
}
