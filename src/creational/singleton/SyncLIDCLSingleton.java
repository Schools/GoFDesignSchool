package creational.singleton;

public class SyncLIDCLSingleton {

	private volatile SyncLIDCLSingleton INSTANCE = null; // Lazy Initialization

	// Marking default constructor private to avoid direct instantiation.
	private SyncLIDCLSingleton() {

	}

	// Method to Get instance for class SimpleSingletonLI
	public SyncLIDCLSingleton getInstance() {

		if (null == INSTANCE) {
			synchronized (SyncLIDCLSingleton.class) {
				if (null == INSTANCE) {
					INSTANCE = new SyncLIDCLSingleton();
				}
			}
		}
		return INSTANCE;

	}

}
