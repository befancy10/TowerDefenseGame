package enemies;

import static helpz.Constants.Enemies.GENGAR;

import managers.MobManager;

public class gengar extends Enemy {

	public gengar(float x, float y, int ID, MobManager em) {
		super(x, y, ID, GENGAR, em);
	}

}