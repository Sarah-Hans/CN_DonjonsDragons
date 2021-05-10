package menu;

import characters.Warrior;
import characters.Wizzard;
import characters.Character;
import game.Game;

import java.util.Scanner;

public class Menu {
	private Character player;
	private String name;
	private Scanner clavier;
	
	//constructor : tout initialiser
	public Menu() {
		name = null;
		player = null;
		this.clavier = new Scanner(System.in);
	}

	//menu de départ
	public void startMenu() {
		String choixMenu;
		while(player == null) {
			System.out.println("Création de ton personnage, tape create");
			System.out.println("Quitter le jeu, tape exit");
			choixMenu = clavier.nextLine();
			if(choixMenu.equals("create")) {
				player = createPerso();
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
			Game partie = new Game(player);
			partie.startGame();
		} else if(choixMenu.equals("exit")) {
			System.out.println("Bye bye");
			System.exit(0);
		}
	}
	
	//création du personnage
	public Character createPerso() {
		String choixClasse;
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
	public Character createGuerrier() {
		System.out.print("Entrez un nom pour votre guerrier :");
		name = clavier.nextLine();
		Character player1 = new Warrior(name);
		persoMenu(player1);
		return player1;
	}
	public Character createMagicien() {
		System.out.print("Entrez un nom pour votre magicien :");
		name = clavier.nextLine();
		Character player1 = new Wizzard(name);
		persoMenu(player1);
		return player1;
	}

	//menu Character
	public void persoMenu(Character player1) {
		String choixInfo;
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

	public String getName() {
		return name;
	}

	public Scanner getClavier() {
		return clavier;
	}

	public Character getPlayer() {
		return player;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClavier(Scanner clavier) {
		this.clavier = clavier;
	}

	public void setPlayer(Character player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Menu{" +
				"name='" + name + '\'' +
				", clavier=" + clavier +
				", player=" + player +
				'}';
	}
}
