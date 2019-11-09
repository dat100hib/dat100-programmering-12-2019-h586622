package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] nyBlogg;
	private int nesteLedige = 0;

	public Blogg() {
		nyBlogg = new Innlegg[20];
		this.nesteLedige = 0;

	}

	public Blogg(int lengde) {
		nyBlogg = new Innlegg[lengde];
		this.nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	}

	public Innlegg[] getSamling() {
		return nyBlogg;

	}

	public int finnInnlegg(Innlegg innlegg) {
//feilfeilfeil
		int res = -1;
		int pos = 0;
		while (nesteLedige > pos && res == -1) {
			if (nyBlogg[pos].getId() == innlegg.getId()) {
				res = nyBlogg[pos].getId();

			}
			pos++;
		}

		return res;

	}

	public boolean finnes(Innlegg innlegg) {

		for (int i = 0; i < nyBlogg.length; i++) {
			if (nyBlogg[i] != null && innlegg.getId() == nyBlogg[i].getId()) {
				return true;
			}
		}
		return false;
		// En metode public boolean finnes(Innlegg innlegg) som returnerer true om der
		// finnes et innlegg i samlingen med samme id som innlegget gitt ved parameteren
		// innlegg
	}

	public boolean ledigPlass() {
		if (nesteLedige < nyBlogg.length) {
			return true;
		} else {
			return false;
		}

	}

	public boolean leggTil(Innlegg innlegg) {

		if (finnes(innlegg) == true) {
			return false;
		}
		nyBlogg[nesteLedige] = innlegg;
		nesteLedige++;
		return true;
	}


	public String toString() {
		String temp = nyBlogg.length + "\n";
		for (int i = 0; i < nyBlogg.length; i++) {
			if (nyBlogg[i] != null) {
			temp = temp + nyBlogg[i].toString();
			}
		}
		return temp;
	}



	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}