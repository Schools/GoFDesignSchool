package creational.singleton;

import java.io.Serializable;

public class ParentSerializedSingleton implements Serializable {

	/**
	 * VersionUID is required for Serialization, piping the objects.
	 */
	private static final long serialVersionUID = 6120950011419385146L;

	private ParentSerializedSingleton INSTANCE = null; //Lazy Initialization

	// Marking default constructor protected 
	protected ParentSerializedSingleton() {
		
	}
	// Method to Get instance for class SimpleSingletonLI
	public ParentSerializedSingleton getInstance() {
		if (null == INSTANCE) {
			synchronized (ParentSerializedSingleton.class) {
				if (null == INSTANCE) {
					INSTANCE = new ParentSerializedSingleton();
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
