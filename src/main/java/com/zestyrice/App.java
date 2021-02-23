package com.zestyrice;

import java.io.IOException;

import com.budhash.cliche.ShellFactory;

public class App {

    public static void main(String[] args) throws IOException {
    	
    	CeilingFan ceilingFan = new CeilingFan();
    	
        ShellFactory.createConsoleShell("Ceiling Fan", "s=speed, r=reverse, e=exit \n" + ceilingFan.showStatus(), ceilingFan)
            .commandLoop();
    }

}
