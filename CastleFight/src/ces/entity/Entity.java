/**
 * 
 */
package ces.entity;

import java.util.HashMap;
import java.util.Set;

import ces.component.ComponentType;
import ces.component.IComponent;

/**
 * Concrete implementation of IEntity.  See IEntity for details
 * @author Chris
 *
 */
public class Entity implements IEntity {
	HashMap<ComponentType, IComponent> components;

	@Override
	public boolean hasComponent(ComponentType type) {
		return this.components.containsKey(type);
	}

	@Override
	public boolean hasAllComponents(Set<ComponentType> types) {
		boolean hasAll = true;
		for (ComponentType type : types) {
			if(!this.components.containsKey(type)) {
				hasAll = false;
				break;
			}
		}
		return hasAll;
	}

	@Override
	public void addComponent(IComponent component) {
		this.components.put(component.type(), component);
	}


	@Override
	public void removeComponent(ComponentType type) {
		this.components.remove(type);
	}

	@Override
	public IComponent getComponent(ComponentType type) {
		return this.components.get(type);
	}
}
