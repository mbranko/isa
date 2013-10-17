package mbs2.pr01;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Server extends UnicastRemoteObject implements ServerI {

  public Server() throws RemoteException {
  }

  public int count() {
    return ++count;
  }

  private int count = 0;
  
}