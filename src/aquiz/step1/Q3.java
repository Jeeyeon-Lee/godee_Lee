package aquiz.step1;

class BaseClass {
	private float x = 1.0f;

	protected float getVar() {
		return x;
	}
}

class SubClass extends BaseClass {
	private float x = 2.0f;
	@Override
	public float getVar() {
		return x;
	}
	public float getVar(float f) {
		return f;
	}
	public class Q3 {
	}
}
