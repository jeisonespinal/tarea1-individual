package hn.uth.tarea_individual_primerparcial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	@BeforeClass
	public static void inicializacion() {
		System.out.println("Ejecutando prueba unitaria");
	}
	
	// AREA DE UN CIRCULO
	@Test
	public void areaCirculoRadioEnteroNegativo() {
		assertEquals(App.circulo(3.1416,-8), 201.062, .01);
	}
	
	@Test
	public void areaCirculoRadioDecimal() {
		assertEquals(App.circulo(3.1416,6.33), 125.880, .01);
	}
	
	@Test
	public void areaCirculoRadioCero() {
		assertFalse(App.circulo(3.1416,0) == 3.1416);
	}
	
	// AREA DE UN CUADRADO
	@Test
	public void areaCuadradoLadosDecimales() {
		assertTrue(App.cuadrado(5.5,5.5) == 30.25);
	}
	
	@Test
	public void areaCuadradoLadosEnterosPositivos() {
		assertTrue(App.cuadrado(9,9) == 81);
	}
	
	@Test
	public void areaCuadradoLadosEnterosNegativos() {
		assertFalse(App.cuadrado(-6,-6) == -36);
	}
	
	// AREA DE UN RECTANGULO
	@Test
	public void areaRectanguloBaseYAlturaEnterosPositivos() {
		assertTrue(App.rectangulo(12,8) == 96);
	}
	
	@Test
	public void areaRectanguloBaseYAlturaDecimales() {
		assertEquals(App.rectangulo(15.35,10.33), 158.565, .01);
	}
	
	@Test
	public void areaRectanguloBaseCeroYAlturaEnteroPositivo() {
		assertFalse(App.rectangulo(0,12) == 12);
	}
	
	// AREA DE UN TRIANGULO
	@Test
	public void areaTrianguloBaseYAlturaCero() {
		assertFalse(App.triangulo(0,2) == 2);
	}
	
	@Test
	public void areaTrianguloBaseYAlturaEnterosPositivos() {
		assertFalse(App.triangulo(10,8) == 80);
	}
	
	@Test
	public void areaTrianguloBaseYAlturaDecimales() {
		assertEquals(App.triangulo(10.65,8.10), 43.132, .01);
	}
	
	// FIN DE LA PRUEBA
	@AfterClass
	public static void finalizacion() {
		System.out.println("Prueba unitaria finalizada");
	}
}
