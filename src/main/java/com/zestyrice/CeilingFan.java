package com.zestyrice;

import com.budhash.cliche.Command;

public class CeilingFan {
	
	private Boolean isReversed = false;
	private final int[] SPEEDS = {0, 1, 2, 3};
	private Integer speedIndex = 0;
	
	@Command(name="speed", abbrev="s") 
	public String toggleSpeed() {
		int currentIndex = this.speedIndex;
		int nextIndex = (currentIndex + 1) % SPEEDS.length;
		speedIndex = nextIndex;
		return showStatus();
	}
	
	@Command(name="reverse", abbrev="r")
	public String toggleReverse() {
		isReversed = !isReversed;
		return showStatus();
	}
	
	@Command(name="exit", abbrev="e")
	public void exit() {
		System.exit(0);
	}
	

	public String showStatus() {
		return "Speed: " + speedIndex.toString() + " Reverse: " + isReversed.toString();
	}


	public Integer getSpeedIndex() {
		return speedIndex;
	}

	public void setSpeedIndex(Integer speedIndex) {
		this.speedIndex = speedIndex;
	}

	public Boolean isReversed() {
		return isReversed;
	}

	public void setReversed(Boolean isReversed) {
		this.isReversed = isReversed;
	}

}
