package pool.services;
import pool.product.Pool;


public class ServiceRemplissage extends Services {

	public ServiceRemplissage(Pool p) 
	{
		super(p);
		this.servicePrice = 300;
	}
	public double calculatePrice()
	{
		return this.servicePrice + this.pool.calculatePrice();
	}
}
