package pstoriz.desacore.graphics;

public class AnimatedSprite extends Sprite {
	
	private int frame = 0;
	private Sprite sprite;
	private int rate = 5;
	private int time;
	private int length = -1;
	
	public AnimatedSprite(SpriteSheet sheet, int width, int height, int length) {
		super(sheet, width, height);
		this.length = length;
		sprite = sheet.getSprites()[0];
		if (length > sheet.getSprites().length) System.err.println("Error! Length of animation is too long!");
	}
	
	public void update() {
		time++;
		if (time % rate == 0) {
			if (frame >= length - 1) frame = 0;
			else frame++;
			sprite = sheet.getSprites()[frame];
		}
	}
	
	public Sprite getSprite() {
		return sprite;
	}
	
	//rate at which we control the speed of animation
	public void setFrameRate(int frames) {
		rate = frames;
	}

}
