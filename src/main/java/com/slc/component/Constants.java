package com.slc.component;

import java.util.Arrays;
import java.util.List;

import com.slc.model.Metodes;

public class Constants {
	
	public static final List<Metodes> listMetodes = Arrays.asList(new Metodes("gols"), new Metodes("assist"),new Metodes("xuts_porta"), new Metodes("xuts_fora"), new Metodes("perdues"),
				new Metodes("recuperacions"), new Metodes("intercepcions"), new Metodes("gols_generats")
			);
	
	public static final List<Integer> jugadors = Arrays.asList(10, 14, 18);
	
	public static final int NUM_METODES = listMetodes.size();
	public static final int NUM_JUGADORS = jugadors.size();
}
