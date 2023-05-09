package com.genericutilities;

import java.util.Random;

public class javalibrary {
	public int random()
	{
		Random ran=new Random();
		int random = ran.nextInt(1000);
		return random;
	}
}
