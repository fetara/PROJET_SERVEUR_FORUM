package com.service;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface InterfaceSujetDiscussion extends Remote , InterfaceAffichageClient{

	public String conversation(String text) throws RemoteException; 
	public void inscription(InterfaceAffichageClient c) throws RemoteException;
	public void desInscription(InterfaceAffichageClient c) throws RemoteException;
	public void diffuse(String message) throws RemoteException;

}
