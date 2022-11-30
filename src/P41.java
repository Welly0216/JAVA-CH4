public class P41
{
	public static void main(String[] args)
	{
		Car car1=new Car(123,20.5);
		car1.vShow();
		car1.mShow();
	}
}

interface Vehicle
{
	void vShow();

}

interface meterial
{
	void mShow();

}

class Car implements Vehicle
{
	private int num;
	private double gas;

	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas);
	}	
	public void vShow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	
	}
	public void mShow()
	{
		System.out.println("車子材料是鐵");
	
	}
}

