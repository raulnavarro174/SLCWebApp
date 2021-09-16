package com.slc.component;

import java.util.Arrays;
import java.util.List;

import com.slc.model.Metodes;

public class Constants {
	
	public static final List<Metodes> listMetodes = Arrays.asList(new Metodes("partits"), new Metodes("gols"),
			new Metodes("assist"), new Metodes("xuts_porta"), new Metodes("xuts_fora"), new Metodes("perdues"),
				new Metodes("recuperacions"), new Metodes("intercepcions"), new Metodes("gols_generats"), 
				new Metodes("regats")
			);
	
	public static final List<Integer> jugadors = Arrays.asList(1, 5, 6, 8, 9, 10, 11, 14, 15, 19, 26);
	
	public static final int NUM_METODES = listMetodes.size();
	public static final int NUM_JUGADORS = jugadors.size();
}