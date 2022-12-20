package enemies;

import static helpz.Constants.Enemies.GHOST;

import managers.MobManager;

public class ghost extends Enemy {

	public ghost(float x, float y, int ID,MobManager em) {
		super(x, y, ID, GHOST,em);
		
	}

}