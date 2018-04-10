package it.polito.tdp.regine;

/**
 * La posizione di una casella sulla scacchiera
 * 
 * @author Fulvio
 *
 */
public class Pos {
	private int riga ;
	private int colonna ;
	
	public Pos(int riga, int colonna) {
		super();
		this.riga = riga;
		this.colonna = colonna;
	}
	
	@Override
	public String toString() {
		return "[" + riga + ", " + colonna + "]";
	}

	public int getRiga() {
		return riga;
	}
	public void setRiga(int riga) {
		this.riga = riga;
	}
	public int getColonna() {
		return colonna;
	}
	public void setColonna(int colonna) {
		this.colonna = colonna;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + colonna;
		result = prime * result + riga;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pos other = (Pos) obj;
		if (colonna != other.colonna)
			return false;
		if (riga != other.riga)
			return false;
		return true;
	}
	
	
	
}
