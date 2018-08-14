package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExpLog {
	private List<Double> lista = new LinkedList<>();
	
	public Iterator<Double> getTermos(){
		return this.lista.iterator();
	}
	
	public double exp(double x) {
		this.lista = new LinkedList<>();
		
		double lim = 10E-6;
		double valor = ( ( Math.pow(x, 0) ) / Util.fatorial(0) );
		int n = 0;
		
		while(valor > lim) {
			double pot = Math.pow(x, n); //x^n
			double fat = Util.fatorial(n); //!n
			valor = pot / fat;
			
			this.lista.add(valor);
			n++;
		}
				
		return Util.somatorio(0, this.lista.size(), this.lista);
	}

	public double log(double x) {
		// TODO:
		throw new UnsupportedOperationException();
	}
}
