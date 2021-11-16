package cuentas;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta(100);
		cuenta.depositar(10);
		System.out.println(cuenta.obtenerSaldo());
		System.out.println(cuenta.extraerOtra(11));		
		System.out.println(cuenta.obtenerSaldo());
		
		
	}

}
