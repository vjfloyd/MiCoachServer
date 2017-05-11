package micoach.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="level")
public class Level implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2077242793834780003L;
	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idlevel;
	private String name;
	
	public Level(){}

	public int getIdlevel() {
		return idlevel;
	}

	public void setIdlevel(int idlevel) {
		this.idlevel = idlevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
