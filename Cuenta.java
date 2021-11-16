package cuentas;

import java.util.Scanner;

public class Cuenta {
	private double saldo;
	/**
	 * @pre: el saldo inicial de la cuenta no debe ser menor a 1
	 * @post: se crea la cuenta con el saldo inicial
	 * @param saldo
	 */
	public Cuenta(double saldo) {
		if (saldo < 1) {
			throw new Error("saldo inicial no valido");
		}
		this.saldo = saldo;
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * @pre: el monto a extraer no puede ser negativo, el saldo debe ser suficiente
	 * @param aExtraer
	 */
	public void extraer(double aExtraer) {
		if (aExtraer < 0) {
			throw new Error("No se puede extraer un monto negativo");
		}
		if (this.saldo < aExtraer) {
			throw new Error("No tiene saldo suficiente");
		}
		this.saldo -= aExtraer;

	}

	public double extraerOtra(double aExtraer) {
		double monto = 0;
		if (aExtraer > 0 && this.saldo >= aExtraer) {
			this.saldo -= aExtraer;
			monto = aExtraer;
		}
		return monto;
	}

	/**
	 * @pre: monto a depositar debe ser mayor a 0
	 * @param aDepositar
	 */
	public void depositar(double aDepositar) {
		if (aDepositar <= 0) {
			throw new Error("No puede depositar un numero menor o igual a 0");
		}
		this.saldo += aDepositar;
	}
	// aca comence //
		/**
		 * @pre: el monto a transferir no puede ser negativo, el saldo debe ser suficiente
		 * @param aTransferir
		 */
		public void transferir(double atransferir,  Cuenta) {
			if (aTransferir < 0) {
				throw new Error("No se puede transferir un monto negativo");
			}
			if (this.saldo < aExtraer) {
				throw new Error("No tiene saldo suficiente");
			}
			this.saldo -= aTransferir;

		}
		}


}
