package enemies;
import static helpz.Constants.Enemies.BOSS;
import managers.EnemyManager;

public class boss extends Enemy {

	public boss(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, BOSS, em);
	}

}