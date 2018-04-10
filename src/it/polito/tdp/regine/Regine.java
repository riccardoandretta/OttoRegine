package it.polito.tdp.regine;

import java.util.ArrayList;
import java.util.List;

/**
 * La disposizione di un certo numero di regine sulla scacchiera
 * 
 * @author Fulvio
 *
 */
public class Regine {
	
	private List<Pos> regine ;
	
	public Regine() {
		regine = new ArrayList<>() ;
	}
	
	public void add(Pos regina) {
		if(regine.contains(regina)) {
			throw new IllegalArgumentException("C'è già una regina in posizione "+regina) ;
		}
		regine.add(regina) ;
	}
	
	public void removeLast() {
		regine.remove(regine.size()-1) ;
	}

}
