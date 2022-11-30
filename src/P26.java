
public class P26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars;
		cars = new Car[2];
		cars[0] = new Car();
		cars[1] = new RacingCar();

		for (int i = 0; i < cars.length; i++) {
			Class cl=cars[i].getClass();
			System.out.println("第"+i+"個物件的類別是:"+cl);
		}
	}

}
