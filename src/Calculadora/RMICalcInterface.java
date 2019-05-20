package Calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICalcInterface extends Remote{
	//Funcion para calcular la SUma 
		public int suma (int num1,int num2) throws RemoteException; 
		//Funcion para calcular la Resta 
		public int resta (int num1,int num2) throws RemoteException;
		//Funcion para calcular el Producto 
		public int producto (int num1,int num2) throws RemoteException;
		//Funcion para calcular la Division  
		public int div (int num1,int num2) throws RemoteException;
		//Funcion para calcular el Porcentaje
		public int porcentaje(int num1,int porcentaje) throws RemoteException;
		
}
