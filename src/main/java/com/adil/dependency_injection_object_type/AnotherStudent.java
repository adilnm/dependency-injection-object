package com.adil.dependency_injection_object_type;

public class AnotherStudent {

	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		cheat.mathCheat();
	}
}
