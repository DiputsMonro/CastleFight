package ces.component;

/**
 * Parent for all Components.
 * 
 * @author Chris
 *
 */
public abstract class AComponent implements IComponent {
	ComponentType type;
	
	/**
	 * Set the type of this Component.
	 * 
	 * @param type
	 */
	AComponent(ComponentType type) {
		this.type = type;
	}
	
	/**
	 * Get the type of this Component.
	 */
	@Override
	public ComponentType type() {
		return type;
	}

}
