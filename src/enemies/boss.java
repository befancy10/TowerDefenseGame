package enemies;
import static helpz.Constants.Enemies.BOSS;
import managers.MobManager;

public class boss extends Enemy {

	public boss(float x, float y, int ID, MobManager em) {
		super(x, y, ID, BOSS, em);
	}

}