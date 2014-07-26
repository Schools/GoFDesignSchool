package creational.objectpoolclient;

import creational.businessobjects.Bat;
import creational.objectpool.BatPool;
import creational.objectpool.PoolManager.EmptyPoolException;

public class BatClient {

	/**
	 * @param args
	 * @throws EmptyPoolException 
	 */
	public static void main(String[] args) throws EmptyPoolException {
		// TODO Auto-generated method stub
		
		BatPool.addBat(5);
		
		Bat bat = BatPool.getBat();
		BatPool.getBat();
		BatPool.getBat();
		BatPool.getBat();
		BatPool.getBat();
		BatPool.releaseBat(bat);
		BatPool.getBat();
		BatPool.getBat();
		
	}

}
