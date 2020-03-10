package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Parole {
	
	private ArrayList<String> listaParole = new ArrayList<String>();
		
	public Parole() {
	}
	
	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		listaParole.sort(new ParoleComparator());
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}

	public void removeParola(String p) {
		listaParole.remove(p);
	}
}
