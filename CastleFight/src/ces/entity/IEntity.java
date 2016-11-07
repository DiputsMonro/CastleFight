package ces.entity;

import java.util.Set;

import ces.component.ComponentType;
import ces.component.IComponent;

/**
 * Represents an Entity in a Component-Entity-System framework.
 * 
 * An Entity is simply a collection of Components.
 * No substantive logic for interacting with these components exists within an Entity,
 * only logic for adding, removing, and managing various components.  All components
 * are equal to the Entity.
 * Substantive logic for interacting with specific components should exist only
 * within the System designed for those components.
 * 
 * @author Chris
 *
 */
public interface IEntity {
	
	/**
	 * Return true if the Entity contains a component of the give type, otherwise false.
	 * @param component
	 * @return
	 */
	public boolean hasComponent(ComponentType component);
	
	/**
	 * Return true if the Entity contains components of all the given types, otherwise false.
	 * @param components
	 * @return
	 */
	public boolean hasAllComponents(Set<ComponentType> components);
	
	/**
	 * Give the component to the entity.
	 * @param component
	 */
	public void addComponent(IComponent component);
	
	/**
	 * Remove the component of the given type from the entity.
	 * @param component
	 */
	public void removeComponent(ComponentType component);

	/**
	 * Gets the component of the given type from the entity.
	 * @param type
	 * @return
	 */
	public IComponent getComponent(ComponentType type);
	
}
