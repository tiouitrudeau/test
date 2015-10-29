package pool.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pool.product.*;
import pool.services.*;

public class testDecorators 
{
	private static final double COMPARAISON = 0.0;
	private static final double PRICE_INSTALLATION = 1500.00;
	private static final double PRICE_FILLING = 300;
	private static final double PRICE_PUMP = 600;
	private static final double PRICE_FILTER = 300;
	private static final double PRICE_CARTRIGE = 800;
	private static final double PRICE_THERMOPUMP = 1000;
	private static final double PRICE_MOCK = 1;
	@Test
	public void test() 
	{
		//Arrange
		Pool pool = new MockPool();
		//Act
		Services service1 = new ServiceInstallation(pool);
		Services service2 = new ServiceRemplissage(service1);
		Services service3 = new PiscineFiltre(service2);
		Services service4 = new PiscinePompe(service3);
		Services service5 = new PiscineCartouche(service4);
		Services service6 = new PiscineThermopompe(service5);
		//Assert
		assertEquals(PRICE_MOCK + PRICE_INSTALLATION + PRICE_FILLING + PRICE_PUMP + PRICE_FILTER + PRICE_CARTRIGE + PRICE_THERMOPUMP, service6.calculatePrice(),COMPARAISON);
	}
}
