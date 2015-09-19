package daybreak;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Daybreak extends StateBasedGame
{
	//Width of the game
	public static final int WIDTH = 640;
	//Height of the game
	public static final int HEIGHT = 640;
	
	//Target frame rate
	public static final int FPS = 60;
	
	//Size of each tile in the map
	public static final int TILE_SIZE = 64;
	
	public static void main(String[] args)
	{
		try
		{
			//Load the game
			AppGameContainer container = new AppGameContainer(new Daybreak());
			container.setDisplayMode(500, 500, false);
			container.setTargetFrameRate(FPS);
			container.setShowFPS(false);
			container.start();
		}
		catch(SlickException e)
		{
			e.printStackTrace();
		}
	}
	
	public Daybreak()
	{
		super("Daybreak");
	}
	
	@Override
	public void initStatesList(GameContainer arg0) throws SlickException
	{
		//Initialize all of the states for the game
	}
}