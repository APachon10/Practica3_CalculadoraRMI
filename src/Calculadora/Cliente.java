package Calculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		RMICalcInterface calc = null;
		try {
			Registry reg = LocateRegistry.getRegistry("localhost",1234);
			System.out.println("Reg : "+reg);
			calc = (RMICalcInterface) reg.lookup("Calculadora");
			System.out.println("calc : "+calc);
			
			if (calc==null) {
				System.out.println("Registro Nulo ");
			}else {
				int numero1=0,numero2=0;
				System.out.print("Introduce el Primer Numero: ");
				numero1=leerEnteros();
				System.out.print("Introduce el Segundo Numero: ");
				numero2 = leerEnteros();
				System.out.println("============================");
				System.out.println("Suma : "+calc.suma(numero1, numero2));
				System.out.println("============================");
				System.out.println("Resta : " +calc.resta(numero1, numero2));
				System.out.println("============================");
				System.out.println("Producto: "+calc.producto(numero1, numero2));
				System.out.println("============================");
				System.out.println("Division: "+calc.div(numero1, numero2));
			}
		} catch (Exception e) {
			System.out.println("Error!! : "+e);
			e.printStackTrace();
		}
	}
	public static int leerEnteros() {
		Scanner scan = new Scanner(System.in);
		int numero= scan.nextInt();
		return numero;
	}
}
