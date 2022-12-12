package scenes;

import java.awt.Color;
import java.awt.Graphics;

import main.Game;
import ui.MyButton;

import static main.GameStates.*;

public class Settings extends GameScene implements SceneMethods {

	private MyButton bMenu, bEasy, bMedium, bHard;
	private String difficultiesText;
	private boolean mouseover;

	public Settings(Game game) {
		super(game);
		this.difficultiesText = "Difficulty : " + difficulty.getDifficultyString() + difficulty.difficultyINT;
		initButtons();
		
	}

	private void initButtons() {
		
		int w = 150;
		int h = w / 3;
		int x = 640 / 2 - w / 2;
		int y = 150;
		int yOffset = 100;
		
		bEasy = new MyButton("Easy", x, y + yOffset, w, h, 97);
		bMedium = new MyButton("Medium", x, y + yOffset * 2, w, h, 98);
		bHard = new MyButton("Hard", x, y + yOffset * 3, w, h, 99);
		
		bMenu = new MyButton("Menu", 2, 2, 100, 30);
	
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 640, 800);

		drawButtons(g);
		
		g.drawString(this.difficultiesText,  245, 700);
		
	}

	private void drawButtons(Graphics g) {
		bMenu.draw(g);
		bEasy.draw(g);
		bMedium.draw(g);
		bHard.draw(g);
	}
	

	@Override
	public void mouseClicked(int x, int y) {
		if (bMenu.getBounds().contains(x, y))
			SetGameState(MENU);
		else if (bEasy.getBounds().contains(x, y))
			difficulty.setObjectDifficulty(1, "Easy");
		else if (bMedium.getBounds().contains(x, y))
			difficulty.setObjectDifficulty(2, "Medium");
		else if (bHard.getBounds().contains(x, y))
			difficulty.setObjectDifficulty(3, "Hard");

	}

	@Override
	public void mouseMoved(int x, int y) {
		bMenu.setMouseOver(false);
		bEasy.setMouseOver(false);
		bMedium.setMouseOver(false);
		bHard.setMouseOver(false);
		
		if (bMenu.getBounds().contains(x, y))
			bMenu.setMouseOver(true);
		else if (bEasy.getBounds().contains(x, y))
			bEasy.setMouseOver(true);
		else if (bMedium.getBounds().contains(x, y))
			bMedium.setMouseOver(true);
		else if (bHard.getBounds().contains(x, y))
			bHard.setMouseOver(true);

	}

	@Override
	public void mousePressed(int x, int y) {
		if (bMenu.getBounds().contains(x, y))
			bMenu.setMousePressed(true);
		else if (bEasy.getBounds().contains(x, y))
			bEasy.setMousePressed(true);
		else if (bMedium.getBounds().contains(x, y))
			bMedium.setMousePressed(true);
		else if (bHard.getBounds().contains(x, y))
			bHard.setMousePressed(true);
	}

	@Override
	public void mouseReleased(int x, int y) {
		resetButtons();
	}

	private void resetButtons() {
		bMenu.resetBooleans();
		bEasy.resetBooleans();
		bMedium.resetBooleans();
		bHard.resetBooleans();

	}

	@Override
	public void mouseDragged(int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
