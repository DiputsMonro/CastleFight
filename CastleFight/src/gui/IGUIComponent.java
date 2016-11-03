package gui;

import geom.Vector2D;

/***
 * Represents a GUI Component.
 * 
 * @author Chris
 *
 */
public interface IGUIComponent {
	
	/**
	 * Update logic for the component using mpos as the mouse position
	 * 
	 * @param mpos
	 */
	public void update(Vector2D mpos);
	
	/**
	 * Draw the component on the screen.  If this component contains other components, they should be drawn as well.
	 */
	public void draw();

	/**
	 * Returns true if the given vector position (usually a mouse location) would be within the bounds of the component.
	 * 
	 * @param pos Position to check
	 * @return true if pos is within the component, otherwise false
	 */
	public boolean inBounds(Vector2D pos);

	/**
	 * Set the position of the component to the screen position pos
	 * 
	 * @param pos
	 */
	public void setPos(Vector2D pos);
	
	/**
	 * Gets the width and height of the component as expressed by a Vector2D.
	 * 
	 * @return
	 */
	public Vector2D getSize();
}
