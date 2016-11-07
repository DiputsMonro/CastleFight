package ces.system;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import ces.component.ComponentType;
import ces.entity.Entity;

public class ASystem implements ISystem {
	HashSet<ComponentType> requiredComponents;
	
	public ASystem(ComponentType... types) {
		for (ComponentType type : types) {
			requiredComponents.add(type);
		}
	}

	@Override
	public Set<ComponentType> requiredComponents() {
		return requiredComponents;
	}

	@Override
	public void act(Collection<Entity> entities) {
		// TODO Auto-generated method stub
	}

	@Override
	public void impureAct__(Entity entity, Object arg) {
		// TODO Auto-generated method stub
	}

}
