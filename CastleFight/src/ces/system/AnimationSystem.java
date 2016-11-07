package ces.system;

import java.util.Collection;
import java.util.Set;

import ces.component.ComponentType;
import ces.component.IComponent;
import ces.entity.Entity;

public class AnimationSystem extends ASystem {
	
	public AnimationSystem() {
		super(
			ComponentType.Animations
		);
	}

	@Override
	public void act(Collection<Entity> entities) {

	}

	@Override
	public void impureAct__(Entity entity, Object arg) {
		// TODO Auto-generated method stub

	}

}
