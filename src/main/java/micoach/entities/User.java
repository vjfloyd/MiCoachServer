package micoach.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2033111042122603981L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer iduser;
	private String username;
	private String password;
	private String foto;
	private String names;
	private String lastname;
	private String dni;
	private String cellnumber;
	private String mail;
	
	
	public User(){}


	public int getIdUser() {
		return iduser;
	}


	public void setIdUser(int idUser) {
		this.iduser = idUser;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	public String getLastName() {
		return lastname;
	}


	public void setLastName(String lastName) {
		this.lastname = lastName;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getCellNumber() {
		return cellnumber;
	}


	public void setCellNumber(String cellNumber) {
		this.cellnumber = cellNumber;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}

	
	

	
	
	
}
