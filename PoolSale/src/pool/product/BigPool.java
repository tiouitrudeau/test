package pool.product;

import java.awt.Color;


public class BigPool extends AboveGroundPool 
{
	public static final int basePrice = 5000;
	private static final int size = 28;
	
	public BigPool(Color color)
	{
		super(color);
	}
	public double calculatePrice()
	{
		return basePrice;
	}
	public int getSize()
	{
		return size;
	}
}
