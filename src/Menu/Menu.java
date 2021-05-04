package Menu;

import Classes.Guerrier;
import Classes.Magicien;
import Classes.Personnage;
import Exceptions.PersonnageHorsPlateauException;
import Game.Jeu;
import java.util.Objects;

import java.util.Scanner;

public class Menu {
	
	private String choixMenu;
	private String choixClasse;
	private String name;
	private String choixInfo;
	private Scanner clavier;
	private Personnage player;
	
	//constructeur
	public Menu() {
		this.clavier = new Scanner(System.in);
	}

	//menu de départ
	public void startMenu() {
		while(Objects.isNull(player)) {
			System.out.println("Création de ton personnage, tape create");
			System.out.println("Quitter le jeu, tape exit");
			choixMenu = clavier.nextLine();
			if(choixMenu.equals("create")) {
				player = (Personnage) createPerso();

			} else if(choixMenu.equals("exit")) {
				System.out.println("Bye bye");
				System.exit(0);
			}
		}
		System.out.println("Lance la partie, tape start");
		System.out.println("Quitter le jeu, tape exit");
		choixMenu = clavier.nextLine();
		if(choixMenu.equals("start")) {
			System.out.println("Partie lancée");
			Jeu partie = new Jeu(player);
			try {
				partie.startGame();
			} catch (PersonnageHorsPlateauException e) {
				e.printStackTrace();
			}
		} else if(choixMenu.equals("exit")) {
			System.out.println("Bye bye");
			System.exit(0);
		}
	}
	
	
	//création du personnage
	public Object createPerso() {
		//Création du personnage
		System.out.println("Choisis la classe de ton personnage :");
		System.out.print("guerrier ou magicien ?");
		choixClasse = clavier.nextLine();
		System.out.println("Votre choix est "+choixClasse);
		//création d'un guerrier
		if (choixClasse.equals("guerrier")) {
			return createGuerrier();
			//création d'un magicien
			} else  {
				return createMagicien();
		}
	}
	public Guerrier createGuerrier() {
		System.out.print("Entrez un nom pour votre guerrier :");
		name = clavier.nextLine();
		Personnage player1 = new Guerrier(name);
		persoMenuGuerrier((Guerrier) player1);
		return (Guerrier) player1;
	}
	public Magicien createMagicien() {
		System.out.print("Entrez un nom pour votre magicien :");
		name = clavier.nextLine();
		Personnage player1 = new Magicien(name);
		persoMenuMagicien((Magicien) player1);
		return (Magicien) player1;
	}

	//menu Guerrier
	public void persoMenuGuerrier(Guerrier player1) {
		System.out.println("1 - Affichez les infos de votre personnage");
		System.out.println("2 - Modifier le nom de votre personnage");
		choixInfo = clavier.nextLine();
		if (choixInfo.equals("1")) {
			System.out.println(player1);
		} else if (choixInfo.equals("2")) {
			System.out.println("Modifie le nom de ton personnage : ");
			name = clavier.nextLine();
			System.out.println(player1);
		}
	}

	//menu Magicien
	public void persoMenuMagicien(Magicien player1) {
		System.out.println("1 - Affichez les infos de votre personnage");
		System.out.println("2 - Modifier le nom de votre personnage");
		choixInfo = clavier.nextLine();
		if (choixInfo.equals("1")) {
			System.out.println(player1);
		} else if (choixInfo.equals("2")) {
			System.out.println("Modifie le nom de ton personnage : ");
			name = clavier.nextLine();
			System.out.println(player1);
		}
	}

	public String getChoixMenu() {
		return choixMenu;
	}

	public String getChoixClasse() {
		return choixClasse;
	}

	public String getName() {
		return name;
	}

	public String getChoixInfo() {
		return choixInfo;
	}

	public Scanner getClavier() {
		return clavier;
	}

	public void setChoixMenu(String choixMenu) {
		this.choixMenu = choixMenu;
	}

	public void setChoixClasse(String choixClasse) {
		this.choixClasse = choixClasse;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChoixInfo(String choixInfo) {
		this.choixInfo = choixInfo;
	}

	public void setClavier(Scanner clavier) {
		this.clavier = clavier;
	}
}
