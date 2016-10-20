package com.neubert.brandon;

import java.util.HashMap;

import com.doing.more.java.Handler;

public class PowerPropulsionDisplayHandler implements Handler {

	@Override
	public void handleIt(HashMap<String, Object> data) {
		System.out.println("This shows the Power and Propulsion");
	}
}