package creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * VersionUID is required for Serialization, piping the objects.
	 */
	private static final long serialVersionUID = 6120950011419385146L;

	private static SerializedSingleton INSTANCE = null; //Lazy Initialization

	// Marking default constructor private to avoid direct instantiation. 
	private SerializedSingleton() {
		
	}
	// Method to Get instance for class SimpleSingletonLI
	public static SerializedSingleton getInstance() {
		if (null == INSTANCE) {
			synchronized (SerializedSingleton.class) {
				if (null == INSTANCE) {
					INSTANCE = new SerializedSingleton();
				}
			}
		}
		return INSTANCE;
	}
	
	// This method is called immediately after an object of this class is deserialized.		
	// This method returns the singleton instance.
	protected Object readResolve() {
		return getInstance();		
	}
	
	
}
