package com.metier;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import com.service.InterfaceAffichageClient;

public class MetierClientImpl {

	private List<Client> clients = new ArrayList<>();
	private List<InterfaceAffichageClient> afficheurs = new ArrayList<>();
	private List<SujetDiscussion> sujetDiscussions = new ArrayList<>();

	public MetierClientImpl() {
		sujetDiscussions.add(new SujetDiscussion(1L, "musique", "hello musique"));
		sujetDiscussions.add(new SujetDiscussion(2L, "cine", "hello cine"));
		sujetDiscussions.add(new SujetDiscussion(3L, "sport", "hello sport"));
		for (Client c : clients) {
			afficheurs = c.getAfficheur();
		}
		clients.add(new Client(1L, afficheurs, sujetDiscussions));
	}

	public List<SujetDiscussion> listSujetDiscussion() {
		return sujetDiscussions;

	}

	public List<Client> listClient() {
		return clients;

	}

	public void inscriptionClientSujet(InterfaceAffichageClient afficheur) {


			afficheurs.add(afficheur);
			System.out.println("client inscrit");

	}

	public void desinscriptionClientSujet(InterfaceAffichageClient afficheur) {

			afficheurs.remove(afficheur);
			System.out.println(" client desinscrit");

	}

	public void diffuseMessage(String message) throws RemoteException {
		int i = 0;
		while(i<afficheurs.size()){
			
			afficheurs.get(i++).affiche(message);
		}
		
	}

	public Client getClient(Long idS) {
		for (Client p : clients) {

			if (p.getIdClient() == idS) {

				return p;
			}

		}
		return null;

	}

	public SujetDiscussion getSujetDiscussionDuClient(Long idC, Long idS) {
		for (Client c : clients) {
			if (c.getIdClient() == idC) {
				for (SujetDiscussion p : c.getListSujet()) {

					if (p.getIdSujet() == idS) {

						return p;
					}

				}
			}
		}
		return null;

	}

	public void afficheMessage(String message) throws RemoteException {
		System.out.println("je suis dans methode Affichemessage");

		for (Client c : clients) {
			for (InterfaceAffichageClient a : c.getAfficheur()) {
				a.affiche(message);
			}

		}
	}

	public SujetDiscussion getSujetDiscussionsParMC(String mc) {
		SujetDiscussion sujet = new SujetDiscussion();
		for (SujetDiscussion p : sujetDiscussions) {
			// si la chaine existe si non il return -1
			if (p.getNom().indexOf(mc) >= 0)
				sujet = p;
		}
		return sujet;
	}

}
