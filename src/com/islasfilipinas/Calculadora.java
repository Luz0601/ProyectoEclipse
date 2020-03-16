package com.islasfilipinas;

public class Calculadora {
	
	public int suma (int n1, int n2) {
		return n1+n2;
	}
	
	public boolean contieneCaracter (String cadena) {
		//métyodo para ver si la cadena que introduczco contiene esos caracteres especiales.
		boolean resultado = false;
		//declaro y creo array de string
		String caracterEspecial[] = {"!","$","#","@","%"};
		int i = 0;
		//compruebo si la cadena que me pasan por parám. contiene alguno de esos caracteres
		while (i < caracterEspecial.length && resultado == false) {
			resultado = cadena.contains(caracterEspecial[i]);
			i++;
		}
		
		return resultado;
	}

}
