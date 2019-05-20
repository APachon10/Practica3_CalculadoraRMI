package Calculadora;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor implements RMICalcInterface{
	
	//Metodo Main 
	public static void main(String[] args) {
		Registry reg = null;
		Servidor v = new Servidor();
		System.setProperty("java.rmi.server.hostname","192.168.0.12");
		try {
			reg = LocateRegistry.createRegistry(1234);
			reg.rebind("Calculadora",
			(RMICalcInterface) UnicastRemoteObject.exportObject(v, 0));
			System.out.println("Hola");
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
	@Override
	public int porcentaje(int num1,int porcentaje) throws RemoteException{
		int res =0;
		res = (num1*porcentaje)/100;
		return res;
	}
}
