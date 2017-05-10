package micoach.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity(name="coursecost")
public class CourseCost implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 77095990651617733L;
	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iduser;
	private String idcourse;
	private String costoHora;
	
	public CourseCost(){}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getIdcurso() {
		return idcourse;
	}

	public void setIdcurso(String idcurso) {
		this.idcourse = idcurso;
	}

	public String getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(String costoHora) {
		this.costoHora = costoHora;
	}


	

}
