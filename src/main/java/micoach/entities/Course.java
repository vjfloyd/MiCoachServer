package micoach.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
	private Integer idcourse;
	private String description;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idarea")
	private Area idarea;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idlevel")
	private Level idlevel;
	
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
		return idarea;
	}

	public void setIdArea(Area idArea) {
		this.idarea = idArea;
	}

	public Level getIdLevel() {
		return idlevel;
	}

	public void setIdLevel(Level idLevel) {
		this.idlevel = idLevel;
	}

	
	
	
}
