package src.train.common.core.util;

public final class Energy {
	private float rf;
	
	private Energy(float rf) {
		this.rf = rf;
	}
	
	public static Energy zero() {
		return new Energy(0);
	}
	
	public static Energy fromRF(float rf) {
		return new Energy(rf);
	}
	
	public static Energy fromEU(float eu) {
		return new Energy(eu * 4);
	}
	
	public static Energy fromMJ(float mj) {
		return new Energy(mj * 10);
	}
	
	public Energy copy() {
		return new Energy(this.rf);
	}
	
	public float toRF() {
		return rf;
	}
	
	public float toEU() {
		return rf / 4;
	}
	
	public float toMJ() {
		return rf / 10;
	}
}
