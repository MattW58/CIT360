package com.neubert.brandon;

import java.util.HashMap;

import com.doing.more.java.Handler;

public class TakeOutTheTrashHandler implements Handler {

	@Override
	public void handleIt(HashMap<String, Object> data) {
		System.out.println("Taking out the trash now");

	}

}