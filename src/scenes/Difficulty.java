package scenes;

public class Difficulty {
	
	public static int difficultyINT;
	public static String difficultyString;
	
	public Difficulty() {
		super();
		this.difficultyINT = 1;
		this.difficultyString = "Easy";
	/*	if (difficultyINT == 1) {
			this.difficultyString = "Easy";
		}
		else if (difficultyINT == 2) {
			this.difficultyString = "Medium";
		}
		else if (difficultyINT == 3) {
			this.difficultyString = "Hard";
		}
		*/
	}
	
	public void setObjectDifficulty(int DifficultyINT, String DifficultyString) {
		setDifficultyINT(DifficultyINT);
		setDifficultyString(DifficultyString);
	}

	public static int getDifficultyINT() {
		return difficultyINT;
	}

	public void setDifficultyINT(int difficultyINT) {
		this.difficultyINT = difficultyINT;
	}

	public String getDifficultyString() {
		return difficultyString;
	}

	public void setDifficultyString(String difficultyString) {
		this.difficultyString = difficultyString;
	}

	@Override
	public String toString() {
		return difficultyString + "\n";
	}
	
	
}
