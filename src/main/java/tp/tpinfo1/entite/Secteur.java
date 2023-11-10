package tp.tpinfo1.entite;

import java.util.ArrayList;
import java.util.List;

import tp.tpinfo1.enums.TypeAnimal;
import tp.tpinfo1.exception.AnimalDansMauvaisSecteurException;

public class Secteur {
	private TypeAnimal typeAnimalDansSecteur;
	private List<Animal> listAnimal;
	
	public Secteur(TypeAnimal typeAnimalDansSecteur, List<Animal> listAnimal) {
		super();
		this.typeAnimalDansSecteur = typeAnimalDansSecteur;
		this.listAnimal = listAnimal;
	}
	
	public Secteur(TypeAnimal typeAnimalDansSecteur) {
		this.typeAnimalDansSecteur = typeAnimalDansSecteur;
		this.listAnimal = new ArrayList<Animal>();
		
	}
	
	public TypeAnimal getTypeAnimalDansSecteur() {
		return typeAnimalDansSecteur;
	}
	public void setTypeAnimalDansSecteur(TypeAnimal typeAnimalDansSecteur) {
		this.typeAnimalDansSecteur = typeAnimalDansSecteur;
	}
	public List<Animal> getListAnimal() {
		return listAnimal;
	}
	public void setListAnimal(List<Animal> listAnimal) {
		this.listAnimal = listAnimal;
	}
	
	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		if (!this.typeAnimalDansSecteur.equals(animal.getTypeAnimal())) {
			throw new AnimalDansMauvaisSecteurException("animal dans u ");
			
		}
		this.listAnimal.add(animal);
		
	}
	
	

}
