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
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas);
	}	
	public void vShow()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	
	}
	public void mShow()
	{
		System.out.println("���l���ƬO�K");
	
	}
}

