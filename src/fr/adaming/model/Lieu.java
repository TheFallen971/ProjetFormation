package fr.adaming.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	
	@Id
	@GeneratedValue
	private int idLieu;
	private String addresse;
	private String ville;
	
	
	@Override
	public String toString() {
		return "Lieu [idLieu=" + idLieu + ", addresse=" + addresse + ", ville=" + ville + "]";
	}

	public int getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(int idLieu) {
		this.idLieu = idLieu;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Lieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lieu(String addresse, String ville) {
		super();
		this.addresse = addresse;
		this.ville = ville;
	}

}
