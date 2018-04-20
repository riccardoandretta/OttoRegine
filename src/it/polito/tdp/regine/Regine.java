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

	public List<Integer> posiziona(int N) {

		List<Integer> soluzione = new ArrayList<Integer>();

		if (cerca(soluzione, N, 0)) {
			return soluzione;
		} else {
			return null;
		}
	}

	/**
	 * Assumendo che scacchiera sia piena nelle righe da 0 a livello-1, determina le
	 * possibili posizioni per una regina alla riga==livello e prova ricorsivamente
	 * a posizionarla.
	 * 
	 * @param scacchiera
	 *            lista delle posizioni (colonna) delle regine precenenti
	 * @param N
	 *            dimensione scacchiera
	 * @param livello
	 *            riga a cui deve lavorare la ricorsione
	 */
	private boolean cerca(List<Integer> scacchiera, int N, int livello) {
		// ritornando un boolean faccio sì che mi fermi alla prima soluzione trovata

		if (livello == N) { // so di quanti elementi è composta, quindi mi fermo lì perchè è impossibile andare oltre
			// caso terminale, soluzione trovata
			return true;
		}

		for (int mossa = 0; mossa < N; mossa++) { // mosse possibili sono tutte le colonne della scacchiera
			if (posizioneSicura(scacchiera, livello, N, mossa)) { // ma non tutte le devo provare
				scacchiera.add(mossa);
				if (cerca(scacchiera, N, livello + 1)) // allora continuo la procedura
					return true; 			// lascio la scacchiera così com'è nel momento in cui ho trovato la sol
				scacchiera.remove(livello); // nel momento in cui ho trovato la sol non faccio più nemmeno il backtrack,
											// esco immediatamente (se lo facessi distruggerei la soluzione trovata)
			}
		}
		return false;
	}

	private boolean posizioneSicura(List<Integer> scacchiera, int livello, int n, int mossa) {

		for (int riga = 0; riga < livello; riga++) { // ciclo fra tutte le righe precedenti

			// stasse colonna
			if (scacchiera.get(riga) == mossa)
				return false;

			// stessa diagonale dx
			if (riga - scacchiera.get(riga) == livello - mossa)
				return false;

			// stessa diagonale sx
			if (riga + scacchiera.get(riga) == livello + mossa)
				return false;

		}

		return true;
	}

}

/*
 * 
 * 
 * [Q] --> R1=riga, C1=schacchiera.get(riga)
 * 
 * 
 * 
 * 			[Q] --> R2=livello, C2=mossa
 * 
 * Diagonale destra: R1-C1 == R2-C2
 * 
 * Diagonale sinistra: R1+C1 = R2+C2
 * 
 */