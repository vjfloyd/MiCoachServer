package micoach.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="area")
public class Area implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8084661469972807979L;
	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idarea;
	private String description;
	
	
	public Area(){}


	public int getIdarea() {
		return idarea;
	}


	public void setIdarea(int idarea) {
		this.idarea = idarea;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}
