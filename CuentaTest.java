package test;

import static org.junit.Assert.*;

import org.junit.Test;

import cuentas.Cuenta;

public class CuentaTest {

	@Test(expected = Error.class)
	public void fallaAlCrearCuentaConSaldoCero() {
		Cuenta cuenta = new Cuenta(0);
	}

	@Test
	public void exTraigo100DeMiCuenta() {
		Cuenta cuenta = new Cuenta(100);
		assertEquals(100, cuenta.obtenerSaldo(), 0);
		cuenta.extraer(100);
		assertEquals(0, cuenta.obtenerSaldo(), 0);
	}

	@Test(expected = Error.class)
	public void falalAlExtraerUnNumeroNegativo() {
		Cuenta cuenta = new Cuenta(100);
		cuenta.extraer(-100);
	}

	@Test(expected = Error.class)
	public void falalAlExtraerYNoTenersaldo() {
		Cuenta cuenta = new Cuenta(100);
		cuenta.extraer(200);
	}

	@Test(expected = Error.class)
	public void falalAlDepositarunMontoNegativo() {
		Cuenta cuenta = new Cuenta(100);
		cuenta.depositar(-1);
	}
	
	@Test(expected = Error.class)
	public void falalAlDepositar0() {
		Cuenta cuenta = new Cuenta(100);
		cuenta.depositar(0);
	}
	
	@Test
	public void deposito100EnMiCuenta() {
		Cuenta cuenta = new Cuenta(100);
		assertEquals(100, cuenta.obtenerSaldo(), 0);
		cuenta.depositar(100);
		assertEquals(200, cuenta.obtenerSaldo(), 0);
	}

}
