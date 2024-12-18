
public class p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carp31 car1;
		car1 = new Carp31();
		
		try {
			car1.setCarp31(1234,-10.0);
		}
		
		catch(CarException e) {
			System.out.println("拋出"+e+"了");
		}
		car1.show();
	}
}
class CarException extends Exception
{
}
class Carp31
{
	private int num;
	private double gas;
	
	public Carp31()
	{
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	
	public void setCarp31(int n,double g) throws CarException
	{
		if(g < 0)
		{
			CarException e = new CarException();
			throw e;
		}
		else
		{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
		}
	}
	
	public void show()
	{
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
	}
}

