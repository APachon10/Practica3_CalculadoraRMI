package Calculadora;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor implements RMICalcInterface{
	
	//Metodo Main 
	public static void main(String[] args) {
		Registry reg = null;
		System.setProperty("java.rmi.server.hostname","192.168.0.12");
		try {
			reg = LocateRegistry.createRegistry(5555);
		} catch (Exception e) {
			System.out.println("Error : "+e);
			e.printStackTrace();
		}
		Servidor v = new Servidor();
		try {
			reg.rebind("Calculadora",
			(RMICalcInterface) UnicastRemoteObject.exportObject(v, 0));
		} catch (Exception e) {
			System.out.println("Error : "+e);
			e.printStackTrace();
		}
		
	}

	@Override
	public int suma(int num1, int num2) throws RemoteException{
		int res =0;
		res = num1+num2;
		return res;
	}

	@Override
	public int resta(int num1, int num2) throws RemoteException{
		int res =0;
		res = num1-num2;
		return res;
	}

	@Override
	public int producto(int num1, int num2) throws RemoteException{
		int res =0;
		res = num1*num2;
		return res;
	}

	@Override
	public int div(int num1, int num2) throws RemoteException{
		int res =0;
		res = num1/num2;
		return res;
	}
}
