package scenes;

public class Difficulty {
	
	int difficultyINT = 1;
	String difficultyString;
	
	public Difficulty(int difficultyINT) {
		super();
		this.difficultyINT = difficultyINT;
		if (difficultyINT == 1) {
			this.difficultyString = "Easy";
		}
		else if (difficultyINT == 2) {
			this.difficultyString = "Medium";
		}
		else if (difficultyINT == 3) {
			this.difficultyString = "Hard";
		}
		
	}

	public int getDifficultyINT() {
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
