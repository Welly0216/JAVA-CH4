public class P32
{
	public static void main(String[] args)
	{
		Vehical[]vc=new Vehical[2];
		vc[0]=new Car(1234,20.5);
;
	
		vc[1]=new Plane(123);


		for(int i=0;i<vc.length;i++)
		{
			if(vc[i]instanceof Car)
				System.out.println("��"+(i+1)+"�Ӫ���Ocar���O");
			else
				System.out.println("��"+(i+1)+"�Ӫ��󤣬Ocar���O");
		}
	}
}

abstract class Vehicle
{
	protected int speed;
	protected void setSpeed(int s)
	{
		speed=s;
		System.out.println("�N�ƫ׳]��"+speed+"�F");
	}
	abstract void show();

}
class Car extends Vehicle
{
	private int num;
	private double gas;

	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�Ͳ��F���l");
	}	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}


class Plane extends Vehicle
{
	private int flight;

	public Plane(int f)
	{
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}	
	public void show()
	{
		System.out.println("�����Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}