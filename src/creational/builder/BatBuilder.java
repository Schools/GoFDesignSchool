package creational.builder;

import creational.businessobjects.Bat;

public abstract class BatBuilder {

	public abstract void clean();
	public abstract void applyLogo();
	public abstract void applyGrip();
	public abstract void applyCover();
	public abstract void pack();
	public Bat buildBat(Bat bat) {
		// TODO Auto-generated method stub
		clean();
		applyLogo();
		applyGrip();
		applyCover();
		pack();
		return bat;
	}
	
}
