package scenes;

import java.awt.image.BufferedImage;

import main.Game;
import scenes.Difficulty;

public class GameScene{

	protected Game game;
	public Difficulty difficulty;
	protected int animationIndex;
	protected int ANIMATION_SPEED = 25;
	protected int tick;

	public GameScene(Game game) {
		this.game = game;
		difficulty = new Difficulty();
	}

	public Game getGame() {
		return game;
	}

	protected boolean isAnimation(int spriteID) {
		return game.getTileManager().isSpriteAnimation(spriteID);
	}

	protected void updateTick() {
		tick++;
		if (tick >= ANIMATION_SPEED) {
			tick = 0;
			animationIndex++;
			if (animationIndex >= 4)
				animationIndex = 0;
		}
	}

	
	protected BufferedImage getSprite(int spriteID) {
		return game.getTileManager().getSprite(spriteID);
	}

	protected BufferedImage getSprite(int spriteID, int animationIndex) {
		return game.getTileManager().getAniSprite(spriteID, animationIndex);
	}

}
