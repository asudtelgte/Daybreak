package daybreak;

import org.newdawn.slick.Image;

/**
 * Represents an entity in the game.
 */
public abstract class Entity
{
	//The image to draw for the entity
	protected Image img;
	
	//Location of the entity. These correspond to coordinates in a 2D array for the map
	protected int posX;
	protected int posY;
	
	//Reference to the map. Used for pathfinding and moving the player
	protected Tile[][] map;
	
	//This entity's health
	protected int health;
	
	/**
	 * Creates a new entity.
	 * @param map Reference to the map.
	 */
	public Entity(Tile[][] map)
	{
		this.map = map;
	}
	
	/**
	 * Assign a new image to this entity.
	 * @param image New image to use.
	 */
	public void setImage(Image image)
	{
		this.img = image;
	}
	
	/**
	 * Get the image for this entity.
	 * @return This entity's image.
	 */
	public Image getImage()
	{
		return img;
	}
	
	/**
	 * Get's the X coordinate of this entity.
	 * @return X coordinate.
	 */
	public int getPosX()
	{
		return posX;
	}

	/**
	 * Set's the X coordinate of this entity.
	 * @param posX New X coordinate.
	 */
	public void setPosX(int posX)
	{
		//Mark that the entity moved from it's previous spot
		map[posY][posX].entity = null;
		
		this.posX = posX;
		
		//Mark the entity's new location
		map[posY][posX].entity = this;
	}

	/**
	 * Get's the Y coordinate of this entity.
	 * @return Y coordinate.
	 */
	public int getPosY()
	{
		return posY;
	}

	/**
	 * Sets the Y coordinate of this entity.
	 * @param posY New Y coordinate.
	 */
	public void setPosY(int posY)
	{
		//Mark that the entity moved from it's previous spot
		map[posY][posX].entity = null;
		
		this.posY = posY;
		
		//Mark the entity's new location
		map[posY][posX].entity = this;
	}

	/**
	 * Sets the location of this entity.
	 * @param x New X coordinate.
	 * @param y New Y coordinate.
	 */
	public void setPosition(int x, int y)
	{
		//Mark that the entity moved from it's previous spot
		map[posY][posX].entity = null;
		
		this.posX = x;
		this.posY = y;
		
		//Mark the entity's new location
		map[posY][posX].entity = this;
	}
	
	/**
	 * Gets the current health of this entity.
	 * @return Current health.
	 */
	public int getHealth()
	{
		return health;
	}

	/**
	 * Updates this entity's health by the specified amount.
	 * @param change Amount to change this entity's health by.
	 */
	public void updateHealth(int change)
	{
		health += change;
	}
	
	/**
	 * Updates this entity. Perform any logic and calculations here.
	 * @param delta Time since last update in milliseconds
	 */
	public abstract void update(int deltaTime);
}
