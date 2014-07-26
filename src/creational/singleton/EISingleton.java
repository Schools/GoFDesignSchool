package creational.singleton;

public class EISingleton {

	private static EISingleton INSTANCE = new EISingleton(); //Early Initialization

	// Marking default constructor private
	// to avoid direct instantiation. 
	private EISingleton() 
	{ 
		
	} 
	// Method to Get instance for class SimpleSingletonEI
	// Also Known as Static Factory Pattern.
	public static EISingleton getInstance() {
		return INSTANCE;
	}

	// During Serialization & DeSerialization this singleton.
}
