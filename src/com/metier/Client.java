package com.metier;

import java.io.Serializable;
import java.util.List;

import com.service.InterfaceAffichageClient;

public class Client implements Serializable{

	private Long idClient;
	private List<SujetDiscussion> listSujet ;
	private List<InterfaceAffichageClient> ListAfficheur;
	
	public List<InterfaceAffichageClient> getAfficheur() {
		return ListAfficheur;
	}

	public void setAfficheur(List<InterfaceAffichageClient> afficheur) {
		this.ListAfficheur = afficheur;
	}

	public Client(Long idClient,List<InterfaceAffichageClient> afficheur, List<SujetDiscussion> listSujet) {
		super();
		this.idClient = idClient;
		this.listSujet = listSujet;
		this.ListAfficheur = afficheur;
	}
	
	public Client() {
		super();
	}

	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public List<SujetDiscussion> getListSujet() {
		return listSujet;
	}
	public void setListSujet(List<SujetDiscussion> listSujet) {
		this.listSujet = listSujet;
	}
	
}
