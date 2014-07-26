package creational.singleton;

public enum EasyEnumSingleton {

	INSTANCE;
	//You can access it by EasyEnumSingleton.INSTANCE, 
	//much easier than calling getInstance() method on Singleton
	//Parent of enum is again seems to be an Object.class
	// ONLY WORKS IN JAVA 5 & ABOVE
}
