package tp.tpinfo1;

import java.util.ArrayList;
import java.util.Iterator;

import tp.tpinfo1.entite.Animal;
import tp.tpinfo1.entite.Chien;
import tp.tpinfo1.entite.Zoo;
import tp.tpinfo1.enums.TypeAnimal;
import tp.tpinfo1.exception.LimiteVisisteurException;
import tp.tpinfo1.service.IZooService;
import tp.tpinfo1.service.ZooService;

public class Application {

	public static void main(String[] args) throws LimiteVisisteurException {
		// TODO Auto-generated method stub
		IZooService zooService = new ZooService();
		Zoo monZoo = new Zoo();
		monZoo.ajouterSecteur(TypeAnimal.CARNIVORE);
		monZoo.nouveauVisiteur();
		
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			monZoo.nouveauVisiteur();
			
		}
		
		Animal chien = new Chien("Snoopy",TypeAnimal.CARNIVORE);
		zooService.AjouterAnimalDansSecteur(monZoo, chien);
		
		System.out.println(monZoo.getSecteursAnimaux().size());
		System.out.println(monZoo.getSecteursAnimaux().get(0).getListAnimal().size());
		

	}

}
