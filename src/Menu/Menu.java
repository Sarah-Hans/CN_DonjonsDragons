package Menu;

import Classes.Guerrier;
import Classes.Magicien;
import java.util.Scanner;

public class Menu {
	
	private String choixMenu;
	private String choixClasse;
	private String name;
	private int choixInfo;
	private String classe;
	private Scanner clavier;
	
	//constructeur
	public Menu() {
		this.clavier = new Scanner(System.in);
	}
	
	
	//création du personnage
	public void createPerso() {
		//Création du personnage
		System.out.println("Choisis la classe de ton personnage :");
		System.out.print("guerrier ou magicien ?");
		choixClasse = clavier.nextLine();
		System.out.println("Votre choix est "+choixClasse);
		//création d'un guerrier
		if (choixClasse.equals("guerrier")) {
			classe = "guerrier";
			System.out.print("Entrez un nom pour votre guerrier :");
			name = clavier.nextLine();
				
			//création d'un magicien
			} else if (choixClasse.equals("magicien")) {
				classe = "magicien";
				System.out.println("Entrez un nom pour votre magicien :");
				name = clavier.nextLine();
		}
		persoMenu();
			
	}
	//menu personnage
	public void persoMenu() {
		System.out.println("1 - Affichez les infos de votre personnage");
		System.out.println("2 - Modifier le nom de votre personnage");
		choixInfo = clavier.nextInt();
		clavier.nextLine();
		if (choixInfo == 1) {
			afficherPerso();
		} else if (choixInfo == 2) {
			modifierPerso();
		}
	}
	
	//afficher les infos du personnage
	public void afficherPerso() {
		String choixModif;
		if (classe.equals("guerrier")) {
			Guerrier g = new Guerrier(name);
			System.out.println(g);
		} else if(classe.equals("magicien")) {
			Magicien m = new Magicien(name);
			System.out.println(m);
		}
		System.out.print("Souhaites-tu le modifier ?[oui / non]");
		choixModif = clavier.nextLine();
		if(choixModif.equals("oui")) {
			modifierPerso();
		} else if(choixModif.equals("non")) {
			System.out.println("Ready to play !!!");
			System.out.println("Revenir au menu principal (start) ou quitter (exit)");
			choixMenu = clavier.nextLine();
			while(!choixMenu.equals("exit")) {
				startMenu();
			}
			System.out.println("Bye bye");
			System.exit(0);
		}
	}
	//modifier le nom du personnage
	public void modifierPerso() {
		System.out.println("Modifie le nom de ton personnage : ");
		name = clavier.nextLine();
		afficherPerso();
	}
	
	//menu de départ
		public void startMenu() {
				System.out.println("Création de votre personnage, tape start");
				System.out.println("Quitter le jeu, tape exit");
				
				choixMenu = clavier.nextLine();
				if(choixMenu.equals("start")) {
					
						createPerso();
					
				} else if(choixMenu.equals("exit")) {
					System.out.println("Bye bye");
					System.exit(0);
				}
			
	}

	public String getChoixMenu() {
		return choixMenu;
	}

	public void setChoixMenu(String choixMenu) {
		this.choixMenu = choixMenu;
	}

	public String getChoixClasse() {
		return choixClasse;
	}

	public void setChoixClasse(String choixClasse) {
		this.choixClasse = choixClasse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChoixInfo() {
		return choixInfo;
	}

	public void setChoixInfo(int choixInfo) {
		this.choixInfo = choixInfo;
	}

	public Scanner getClavier() {
		return clavier;
	}

	public void setClavier(Scanner clavier) {
		this.clavier = clavier;
	}
	
		
}
