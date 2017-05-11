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
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
	private Integer coursecost;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="iduser")
	private User iduser;
	private String idcourse;
	private String costoHora;
	
	 //@OneToMany(fetch = FetchType.EAGER
	
	public CourseCost(){}

	@JsonProperty
	public Integer getCoursecost() {
		return coursecost;
	}

	public void setCoursecost(Integer coursecost) {
		this.coursecost = coursecost;
	}
	
	@JsonProperty
	public User getIduser() {
		return iduser;
	}

	public void setIdUser(User iduser) {
		this.iduser = iduser;
	}

	@JsonProperty
	public String getIdcourse() {
		return idcourse;
	}

	public void setIdcourse(String idcourse) {
		this.idcourse = idcourse;
	}

	@JsonProperty
	public String getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(String costoHora) {
		this.costoHora = costoHora;
	}

	

	

}
