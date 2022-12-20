package enemies;

import static helpz.Constants.Enemies.JELLYFISH;

import managers.MobManager;

public class jelly extends Enemy {

	public jelly(float x, float y, int ID, MobManager em) {
		super(x, y, ID, JELLYFISH,em);
		
	}

}