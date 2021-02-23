package com.zestyrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CeilingFanTest {

	private static final Integer SPEED_ZERO = 0;
	private static final Integer SPEED_ONE = 1;
	private static final Integer SPEED_TWO = 2;
	private static final Integer SPEED_THREE = 3;
	private static final Boolean NOT_REVERSED = false;
	private static final Boolean REVERSED = true;
    
    @Test
    public void defaultSettingsTest() {
    	CeilingFan ceilingFan = new CeilingFan();
    	assertEquals(SPEED_ZERO, ceilingFan.getSpeedIndex());
    	assertEquals(NOT_REVERSED, ceilingFan.isReversed());
    }
    
    @Test
    public void reverseTest() {
    	CeilingFan ceilingFan = new CeilingFan();
    	ceilingFan.toggleSpeed();
    	ceilingFan.toggleReverse();
    	
    	assertEquals(SPEED_ONE, ceilingFan.getSpeedIndex());
    	assertEquals(REVERSED, ceilingFan.isReversed());
    	
    	ceilingFan.toggleSpeed();
    	
    	assertEquals(SPEED_TWO, ceilingFan.getSpeedIndex());
    	assertEquals(REVERSED, ceilingFan.isReversed());
    }
    
    @Test
    public void rollOverTest() {
    	CeilingFan ceilingFan = new CeilingFan();
    	ceilingFan.toggleSpeed();
    	ceilingFan.toggleSpeed();
    	ceilingFan.toggleSpeed();

    	assertEquals(SPEED_THREE, ceilingFan.getSpeedIndex());
    	
    	ceilingFan.toggleSpeed();
    	
    	assertEquals(SPEED_ZERO, ceilingFan.getSpeedIndex());
    }

}
