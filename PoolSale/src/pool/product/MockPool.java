package pool.product;

public class MockPool extends Pool 
{

	public MockPool() {}

	@Override
	public double calculatePrice() 
	{
		return 1;
	}
}
