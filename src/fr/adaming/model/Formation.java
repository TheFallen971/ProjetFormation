package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Formation {
@Id
@GeneratedValue
private int idFormation;
private String theme;
@JoinColumn(name = "idLieu")
@ManyToOne
private Lieu lieu;

public int getIdFormation() {
	return idFormation;
}
public void setIdFormation(int idFormation) {
	this.idFormation = idFormation;
}
public Lieu getLieu() {
	return lieu;
}
public void setLieu(Lieu lieu) {
	this.lieu = lieu;
}

public Formation() {
	super();
	// TODO Auto-generated constructor stub
}
public Formation(String theme) {
	super();
	this.theme = theme;
}
public int getId() {
	return idFormation;
}
public void setId(int id) {
	this.idFormation = id;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
@Override
public String toString() {
	return "Formation [id=" + idFormation + ", theme=" + theme + "]";
}
}