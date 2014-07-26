package creational.singleton;

import java.io.Serializable;

public class ChildSerializedSingleton extends ParentSerializedSingleton implements  Serializable {

	/**
	 * VersionUID is required for Serialization, piping the objects.
	 */
	private static final long serialVersionUID = 6120950011419385146L;

	private ChildSerializedSingleton INSTANCE = null; //Lazy Initialization

	// Marking default constructor private to avoid direct instantiation. 
	private ChildSerializedSingleton() {
		super();
	}
	// Method to Get instance for class SimpleSingletonLI
	public ChildSerializedSingleton getInstance() {
		if (null == INSTANCE) {
			synchronized (ChildSerializedSingleton.class) {
				if (null == INSTANCE) {
					INSTANCE = new ChildSerializedSingleton();
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
