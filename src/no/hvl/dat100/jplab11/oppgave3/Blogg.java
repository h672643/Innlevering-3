package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	Innlegg[] innleggtabell;
	int nesteledige;
	

	// TODO: objektvariable 

	public Blogg() {
    
	innleggtabell = new Innlegg[20];
	int nesteledige = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledige = 0;

	}
	
	public int getAntall() {
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {

		return this.innleggtabell;
	}
	
	
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < nesteledige; i++)
			if(innleggtabell[i].getId() == innlegg.getId())  {
				return i;
			}
		
	return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		int i = 0;
		
		while (i < nesteledige && !finnes) {
			if(innlegg.getId() == innleggtabell[i].getId()){
				finnes = true;
			}else {
			i++;
		}
		}
		return finnes;
		
	}

	public boolean ledigPlass() {
		
	boolean ledig = true;
		
		if(nesteledige == innleggtabell.length) {
			ledig = false;
		}
		return ledig;
	}
	
	
	public boolean leggTil(Innlegg innlegg) {
		
		if (finnes(innlegg)) {
			innleggtabell[nesteledige] = innlegg;
			return false;
		}else {innleggtabell[nesteledige] = innlegg;
			nesteledige++; 
			return true;
		}
	
		}
	
	
	public String toString() {
     String tekst = "" + nesteledige + "\n";
     
     for(int i = 0; i<nesteledige ; i++) {
    	 tekst += innleggtabell[i].toString();
     }
     return tekst;
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