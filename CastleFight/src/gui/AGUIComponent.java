package gui;

import geom.Vector2D;

public abstract class AGUIComponent implements IGUIComponent {
	Vector2D pos;
	int width, height;

	/**
	 * Determine if the given position is within the rectangular bounds of this component as 
	 * determined by its position, height, and width
	 */
	public boolean inBounds(Vector2D pos) {
		if (pos.getX() >= 0 && pos.getX() <= width && pos.getY() >= 0 && pos.getY() <= height)
			return true;
		
		return false;
	}

	/**
	 * Sets the position of this component to pos
	 */
	public void setPos(Vector2D pos) {
		this.pos = pos;
	}
	
	/**
	 * Returns the size of this component
	 */
	public Vector2D getSize() { return new Vector2D(width, height); }
	
	public abstract void update(Vector2D mpos);
	public abstract void draw();
}
