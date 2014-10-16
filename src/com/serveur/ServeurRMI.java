package com.serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.service.ServeurForumImpl;
import com.service.SujetDiscussionImpl;

public class ServeurRMI {

	public static void main(String[] args) {
		// forum : objet distant
		try {
			// demarer l'annuaire au depart l'annuaire sur le port 1099
			LocateRegistry.createRegistry(1099);
			// cree l'objet distant
			SujetDiscussionImpl forum = new SujetDiscussionImpl();
			//ServeurForumImpl forum = new ServeurForumImpl();
			System.out.println(forum.toString());
			// pulier la referance
			Naming.rebind("rmi://localhost:1099/FORUM", forum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
