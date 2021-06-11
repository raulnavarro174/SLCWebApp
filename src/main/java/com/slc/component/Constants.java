package com.slc.component;

import java.util.Arrays;
import java.util.List;

import com.slc.model.Metodes;

public class Constants {
	
	public static final List<Metodes> listMetodes = Arrays.asList(new Metodes("gols"), new Metodes("assist"),new Metodes("xuts_porta"), new Metodes("xuts_fora"), new Metodes("perdues"), new Metodes("partits"),
				new Metodes("recuperacions")
			);
}
