package Calculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		RMICalcInterface calc = null;
		try {
			Registry reg = LocateRegistry.getRegistry("localhost",5555);
			calc = (RMICalcInterface) reg.lookup("Calculadora");
			
			if (calc==null) {
				
			}else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int leerEnteros() {
		Scanner scan = new Scanner(System.in);
		int numero= scan.nextInt();
		return numero;
	}
}
