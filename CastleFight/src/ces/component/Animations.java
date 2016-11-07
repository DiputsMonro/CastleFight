package ces.component;

import java.util.HashMap;

import drawing.Animation;

public class Animations extends AComponent {
	public HashMap<String,Animation> animations;
	
	public Animations() {
		super(ComponentType.Position);
	}
}
