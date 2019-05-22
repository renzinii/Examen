package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.xml.internal.fastinfoset.Notation;

import Suma.Suma;

class AsignaturaTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void sumaEnteros() {
		System.out.println("Suma de ...");
		Notation n= new Nota(2, 3);
		assertTrue(n.sumar()== 5);
	}
	@Test
	public void sumaNegativos() {
		System.out.println("Suma nagativos...");
		Suma s= new Suma(-2, -3)
		assertTrue(s.sumar()== -5);

	}
	@Test
	public void sumaMixto() {
		System.out.println("Suma mixto...");
		Suma s= new Suma(2, -3);
		assertTrue(s.sumar()== -1);
}

}
