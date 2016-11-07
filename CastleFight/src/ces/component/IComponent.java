package ces.component;

/**
 * Represents a component in a Component-Entity-System framework.
 * 
 * Components should contain only public data and no methods, except for their identifier method.
 * Systems should be used to act upon the data in components.
 * This allows components to be completely defined by their data.
 * 
 * @author Chris
 *
 */
public interface IComponent {
	
	/**
	 * Get the type of this component
	 * 
	 * @return The type of this Component
	 */
	public ComponentType type();
}
