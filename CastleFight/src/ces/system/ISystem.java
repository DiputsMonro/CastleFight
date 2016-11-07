package ces.system;

import java.util.Collection;
import java.util.Set;

import ces.component.ComponentType;
import ces.entity.Entity;

/**
 * Represents a System in a Component-Entity-System framework.
 * 
 * Contains all of the logic for how the game engine should manipulate
 * a component and the entity which contains it.
 * 
 * @author Chris
 *
 */
public interface ISystem {
	/**
	 * Get a set of the Components this object requires.
	 * A System will only act upon an entity if that entity contains
	 * all of the system's required components.
	 * @return
	 */
	public Set<ComponentType> requiredComponents();
	
	/**
	 * Attempts to act upon all entities given.
	 * @param entities
	 */
	public void act(Collection<Entity> entities);
	
	//
	// This is an impure implementation of act() to
	// help the transition into the component-entity-system.
	// This should be removed when the transition is
	// complete and should not be used in the final system.
	// TODO: REMOVE THIS FUNCTION
	//
	public void impureAct__(Entity entity, Object arg);
}
