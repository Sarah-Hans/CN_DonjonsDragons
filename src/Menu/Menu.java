package Menu;

import Classes.Guerrier;
import Classes.Magicien;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int choixMenu;
		String choixClasse;
		String name;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Création de votre personnage, tape 1");
		System.out.println("Quitter le jeu, tape 2");
		
		choixMenu = clavier.nextInt();
		clavier.nextLine();
		
		if(choixMenu == 1) {
			// Création du personnage
			System.out.println("Choisis la classe de ton personnage :");
			System.out.print("guerrier ou magicien ?");
			choixClasse = clavier.nextLine();
			System.out.println("Votre choix est "+choixClasse);
			
			if (choixClasse.equals("guerrier")) {
				System.out.print("Entrez un nom pour votre guerrier :");
				name = clavier.nextLine();
				Guerrier g = new Guerrier(name);
				System.out.println(g);
			} else if (choixClasse.equals("magicien")) {
				System.out.println("Entrez un nom pour votre magicien :");
				name = clavier.nextLine();
				Magicien m = new Magicien(name);
				System.out.println(m);
			}
			
			
		} else if (choixMenu == 2) {
			System.out.println("Bye bye");
		}
		
		// fermer les ressources
        clavier.close();
		
	}
	

}
