package tp.tpinfo1.service;

import java.util.ArrayList;
import java.util.List;

import tp.tpinfo1.entite.Animal;
import tp.tpinfo1.entite.Secteur;
import tp.tpinfo1.entite.Zoo;
import tp.tpinfo1.exception.AnimalDansMauvaisSecteurException;

public class ZooService implements IZooService{
	public void AjouterAnimalDansSecteur(Zoo zoo, Animal animal) {
		List<Secteur> newList = new ArrayList<Secteur>();
		
		for(Secteur secteur : zoo.getSecteursAnimaux()) {
			if(secteur.getTypeAnimalDansSecteur().equals(animal.getTypeAnimal())){
				try {
					secteur.ajouterAnimal(animal);
				} catch (AnimalDansMauvaisSecteurException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			newList.add(secteur);
		}
		
		zoo.setSecteursAnimaux(newList);
		
	}

	
}
