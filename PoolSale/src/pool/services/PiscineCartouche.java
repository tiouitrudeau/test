package pool.services;
import pool.product.Pool;


public class PiscineCartouche extends Services 
{
	public PiscineCartouche(Pool p) 
	{
		super(p);
		this.servicePrice = 800;
	}
	public double calculatePrice()
	{
		return this.servicePrice + this.pool.calculatePrice();
	}
}
