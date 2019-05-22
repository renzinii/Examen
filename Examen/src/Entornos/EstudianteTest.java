package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.xml.internal.fastinfoset.Notation;

class EstudianteTest {

	public void codigo() {
		System.out.println("Suma de ...");
		Estudiante n= new Estudiante(2, 3);
		assertTrue(n.getCodigo()== "GBA");
				
	}
	@Test
	public void nombre() {
		
		Nombre s= new Nombre(-2, -3)
		assertTrue(s.getNombre()== "Carlos");

	}
	@Test
	public void sumaMixto() {
		System.out.println("Suma mixto...");
		Suma s= new Suma(2, -3);
		assertTrue(s.sumar()== -1);
}

}
