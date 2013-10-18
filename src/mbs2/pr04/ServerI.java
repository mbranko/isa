package mbs2.pr04;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerI extends Remote {
  int count() throws RemoteException;
}
