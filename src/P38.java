public class P38
{
	public static void main(String[] args)
	{
		Vehical[]vc=new Vehical[2];
		vc[0]=new Car(1234,20.5);
	
		vc[1]=new Plane(123);


		for(int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}
}

interface Vehicle
{
	int weight=100;
	void show();

}
class Car implements Vehicle
{
	private int num;
	private double gas;

	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車子");
	}	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}


class Plane implements Vehicle
{
	private int flight;

	public Plane(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}	
	public void show()
	{
		System.out.println("飛機班次是"+flight);
	}
}