package tp.tpinfo1.entite;

import java.util.ArrayList;
import java.util.List;

import tp.tpinfo1.enums.TypeAnimal;
import tp.tpinfo1.exception.LimiteVisisteurException;

public class Zoo {
	
	private List<Secteur> secteursAnimaux;
	private Integer visiteur;
	private static Integer NB_VISITEUR_PAR_SECTEUR = 15;


	public Zoo() {
		super();
		this.visiteur =0;
		this.secteursAnimaux = new ArrayList<Secteur>();
	}



	public Zoo(List<Secteur> secteursAnimaux, Integer nbVisiteurMaxParSecteur) {
		super();
		this.secteursAnimaux = secteursAnimaux;
		this.visiteur = nbVisiteurMaxParSecteur;
	}



	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}

	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}

	public void ajouterSecteur(TypeAnimal typeAnimal) {
		Secteur secteur = new Secteur(typeAnimal);
		secteursAnimaux.add(secteur);
		
	}
	
	
	public void nouveauVisiteur() throws LimiteVisisteurException {
		int nb = this.visiteur+=1;
		if (nb > this.secteursAnimaux.size() * NB_VISITEUR_PAR_SECTEUR) {
			throw new LimiteVisisteurException("Le nombre des visiteurs atteint le maximum");
			
		}
		this.visiteur = nb;
	}
	
	/*
	 * public int getLimiteVisiteur() {
	 * 
	 * }
	 * 
	 * public void nouvelAnimal() {
	 * 
	 * }
	 * 
	 * public int nombreAnimaux() {
	 * 
	 * }
	 */

}
