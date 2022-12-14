package helpz;

public class Constants {

	public static class Projectiles {
		public static final int ARROW = 0;
		public static final int ICEBALL = 3;
		public static final int BOMB = 1;
		public static final int FIREBALL = 2;

		public static float GetSpeed(int type) {
			switch (type) {
			case ARROW:
				return 8f;
			case BOMB:
				return 4f;
			case ICEBALL:
				return 6f;
			case FIREBALL:
				return 6f;
			}
			return 0f;
		}
	}

	public static class Towers {
		public static final int CANNON = 1;
		public static final int ARCHER = 0;
		public static final int FIREFIZARD = 2;
		public static final int ICEWIZ = 3;

		public static int GetTowerCost(int towerType) {
			switch (towerType) {
			case CANNON:
				return 65;
			case ARCHER:
				return 35;
			case FIREFIZARD:
				return 50;
			case ICEWIZ:
				return 50;
			}
			return 0;
		}

		public static String GetName(int towerType) {
			switch (towerType) {
			case CANNON:
				return "Cannon";
			case ARCHER:
				return "Archer";
			case FIREFIZARD:
				return "Fire Wizard";
			case ICEWIZ:
				return "Ice Wizard";
			}
			return "";
		}

		public static int GetStartDmg(int towerType) {
			switch (towerType) {
			case CANNON:
				return 15;
			case ARCHER:
				return 5;
			case FIREFIZARD:
				return 3;
			case ICEWIZ:
				return 4;
			}

			return 0;
		}

		public static float GetDefaultRange(int towerType) {
			switch (towerType) {
			case CANNON:
				return 75;
			case ARCHER:
				return 120;
			case FIREFIZARD:
				return 100;
			case ICEWIZ:
				return 100;
			}

			return 0;
		}

		public static float GetDefaultCooldown(int towerType) {
			switch (towerType) {
			case CANNON:
				return 120;
			case ARCHER:
				return 35;
			case FIREFIZARD:
				return 50;
			case ICEWIZ:
				return 50;
			}

			return 0;
		}
	}

	public static class Direction {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class Enemies {

		public static final int BATBAT = 0;
		public static final int JELLYFISH = 1;
		public static final int GHOST = 2;
		public static final int GENGAR = 3;
		public static final int BOSS = 4;

		public static int GetReward(int enemyType) {
			switch (enemyType) {
			case BATBAT:
				return 5;
			case JELLYFISH:
				return 10;
			case GHOST:
				return 15;
			case GENGAR:
				return 25;
			case BOSS:
				return 30;
			}
			return 0;
		}

		public static float GetSpeed(int enemyType) {
			switch (enemyType) {
			case BATBAT:
				return 0.5f;
			case JELLYFISH:
				return 0.7f;
			case GHOST:
				return 0.45f;
			case GENGAR:
				return 0.85f;
			case BOSS:
				return 1f;
			}
			return 0;
		}

		public static int GetStartHealth(int enemyType) {
			switch (enemyType) {
			case BATBAT:
				return 85;
			case JELLYFISH:
				return 100;
			case GHOST:
				return 125;
			case GENGAR:
				return 400;
			case BOSS:
				return 700;
			}
			return 0;
		}
	}

	public static class Tiles {
		public static final int WATER_TILE = 0;
		public static final int GRASS_TILE = 1;
		public static final int ROAD_TILE = 2;
	}

}