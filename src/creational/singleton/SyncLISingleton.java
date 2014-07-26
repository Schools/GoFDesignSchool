package creational.singleton;

public class SyncLISingleton {

	private static SyncLISingleton INSTANCE = null; // Lazy Initialization

	// Marking default constructor private to avoid direct instantiation.
	private SyncLISingleton() {

	}

	// Method to Get instance for class SimpleSingletonLI
	public static SyncLISingleton getInstance() {

		synchronized (SyncLISingleton.class) {
			if (null == INSTANCE) {
				INSTANCE = new SyncLISingleton();
			}
		}
		return INSTANCE;

	}

}
