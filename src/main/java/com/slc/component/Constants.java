package com.slc.component;

import java.util.Arrays;
import java.util.List;

import com.slc.model.Metodes;

public class Constants {
	public static final String SUMA_GOL_NAME = "sumaGol";
	public static final String SUMA_GOL_VALUE = "Sumar Gol";

	/*Aqui cal anar posant els mètodes creats*/
	
	public static final List<Metodes> listMetodes = Arrays.asList(new Metodes(SUMA_GOL_NAME, SUMA_GOL_VALUE));
}
