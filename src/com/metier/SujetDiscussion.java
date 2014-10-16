package com.metier;

import java.io.Serializable;

import com.service.InterfaceSujetDiscussion;

/**
 * la serialization ce fait pour garder l'etat du bean pour dire que c'est un
 * objet distiner pour stocker des objets et aussi pour dire qu'on a besoin de
 * l'echanger avec d'autre application
 * 
 * @author arafet
 * 
 */
public class SujetDiscussion implements Serializable {

	private Long idSujet;
	private String nom;
	private String contenu;
	private boolean inscrit ,desinscrit;
	
	public SujetDiscussion() {
		super();
	}

	public SujetDiscussion(Long idSujet, String nom , String contenu) {
		super();
		this.idSujet = idSujet;
		this.nom = nom;
		this.contenu = contenu;
	}

	public boolean isInscrit() {
		return inscrit;
	}

	public void setInscrit(boolean inscrit) {
		this.inscrit = inscrit;
	}

	public boolean isDesinscrit() {
		return desinscrit;
	}

	public void setDesinscrit(boolean desinscrit) {
		this.desinscrit = desinscrit;
	}
	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Long getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(Long idSujet) {
		this.idSujet = idSujet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
