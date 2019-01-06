/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.rmi.*;

public interface calcInterface extends Remote{
    public int add(int n1, int n2, int clientNo) throws RemoteException;
    public int subt(int n1, int n2, int clientNo) throws RemoteException;
    public int mult(int n1, int n2, int clientNo) throws RemoteException;
    public int div(int n1, int n2, int clientNo) throws RemoteException;
}