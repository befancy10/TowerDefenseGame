package enemies;

import static helpz.Constants.Enemies.BATBAT;

import managers.MobManager;

public class bat extends Enemy {

	public bat(float x, float y, int ID, MobManager em) {
		super(x, y, ID, BATBAT,em);
	}

}