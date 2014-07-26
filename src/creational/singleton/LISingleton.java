package creational.singleton;

public class LISingleton {

	private LISingleton INSTANCE = null; //Lazy Initialization

	// Marking default constructor private to avoid direct instantiation. 
	private LISingleton() {
		
	}
	// Method to Get instance for class SimpleSingletonLI
	public LISingleton getInstance() {
		if (null == INSTANCE)
		{
			INSTANCE = new LISingleton();
		}
		return INSTANCE;
	}
	
	
}
