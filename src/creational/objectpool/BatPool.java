package creational.objectpool;

import creational.businessobjects.Bat;
import creational.businessobjects.HardBallBat;

public class BatPool {  // A singleton

	private static PoolManager pool = new PoolManager();

	public static void addBat(int number) {

		for (int i = 0; i < number; i++)
		{
			pool.add(new HardBallBat());
			System.out.println("Adding Bat");
		}
	}

	public static Bat getBat()

	throws PoolManager.EmptyPoolException {

		System.out.println("Getting Bat");
		return (Bat) pool.get();
		

	}

	public static void releaseBat(Bat bat) {
		System.out.println("Releasing Bat");
		pool.release(bat);

	}

}
