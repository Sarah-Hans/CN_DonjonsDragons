package menu;

import characters.*;
import characters.Character;
import game.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
* Cette classe gère l'<b>affichage du menu</b>et la <b>création du personnage</b>
* <p>
*  La création du personnage nécessite :
* <ul>
* <li>une variable de type objet (Character) qui sera généré</li>
* <li>une variable de type String pour récupérer le nom du personnage</li>
* <li>une variable de type Scanner pour gérer les entrées clavier de l'utilisateur</li>
* </ul>
* Le menu permet de lancer le jeu : instanciation du Game.
* </p>
*
* @see Game
* @author Sarah-Hans
*
 */

public class Menu {
	/**
	* L'objet player de type Character qui sera créé
	* Celui ci n'est pas modifiable
	* @see Menu#Menu()
	* @see Menu#getPlayer
	 */
	private Character player;

	/**
	* Le nom du player. Celui-ci est modifiable
	* @see Menu#Menu()
	* @see Menu#getName()
	* @see Menu#setName(String)
	 */
	private String name;

	/**
	* La variable qui va permettre les entrées clavier
	 */
	private Scanner clavier;
	
	/**
	* Constructeur Menu
	* <p>
	* A la construction d'un nouveau menu, l'objet player est vide ainsi que son nom et on instancie l'entrée clavier.
	* @see Menu#name
	* @see Menu#player
	* @see Menu#clavier
	* </p>
	 */
	public Menu() {
		name = null;
		player = null;
		this.clavier = new Scanner(System.in);
	}




	/**
	* <b>Menu de départ</b>
	* <p>
	* Création d'une variable choixMenu qui récupère l'entrée clavier de l'utilisateur.
	* Tant que le player n'est pas créé on propose de le créer.
	* Si l'utilisateur choisi de le créer, on appelle la méthode createPerso(),
	 * s'il choisit de récupérer un personnage existant la liste des persos disponibles s'affiche,
	 * s'il choisi de quitter le jeu, le programme se ferme.
	* Dès que le personage est créé ou chargé, on propose de lancer une partie ou de quitter le jeu
	* Le lancement d'une partie instancie la classe Game et lance la méthode startGame.
	* </p>
	* @see Menu#player
	* @see Menu#createPerso()
	* @see Game
	* @see Game#startGame()
	 * @see Menu#pickHero()
	 * @see Menu#getHeroes()
	 */
	public void startMenu() {
		String choixMenu;
		while(player == null) {
			System.out.println("1 - Création de ton personnage");
			System.out.println("2 - Choisis un personnage disponible");
			System.out.println("3 - Quitter le jeu");
			choixMenu = clavier.nextLine();
			if(choixMenu.equals("1")) {
				player = createPerso();
			} else if(choixMenu.equals("2")) {
				System.out.println("Voici les personnages disponibles :");
				getHeroes();
				player = pickHero();
				System.out.println("Personnage sélectionné : "+ player);
			} else if(choixMenu.equals("3")) {
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
	
	/**
	* <b>Sous menu de création du personnage</b>
	* <p>
	* Création d'une variable choixClasse qui récupère l'entrée clavier de l'utilisateur.
	* L'utilisateur est invité à choisir la classe de son personnage (guerrier ou magicien)
	* Lancement des méthodes createGuerrier() et createMagicien() en fonction de son choix.
	* </p>
	*
	* @return le retour de ces deux méthodes
	*
	* @see Menu#createGuerrier()
	* @see Menu#createMagicien()
	 */
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

	/**
	 * <b>Sous-sous menu de création du personnage de type guerrier</b>
	 * <p>
	 * L'utilisateur est invité à définir le nom de son personnage
	 * Le personnage est ainsi instancié
	 * La méthode qui affiche le menu de modification du personnage est appelée
	 * La méthode retourn l'objet player1
	 * </p>
	 *
	 * @return l'objet player1 de type Warrior
	 *
	 * @see Menu#name
	 * @see Character
	 * @see Warrior
	 * @see Warrior(String)
	 * @see Menu#persoMenu(Character)
	 */
	public Character createGuerrier() {
		System.out.print("Entrez un nom pour votre guerrier :");
		name = clavier.nextLine();
		Character player1 = new Warrior(name);
		persoMenu(player1);
		return player1;
	}

	/**
	 * <b>Sous-sous menu de création du personnage de type magicien</b>
	 * <p>
	 * L'utilisateur est invité à définir le nom de son personnage
	 * Le personnage est ainsi instancié
	 * La méthode qui affiche le menu de modification du personnage est appelée
	 * La méthode retourn l'objet player1
	 * </p>
	 *
	 * @return l'objet player1 de type Wizzard
	 *
	 * @see Menu#name
	 * @see Character
	 * @see Wizzard
	 * @see Wizzard(String)
	 * @see Menu#persoMenu(Character)
	 */
	public Character createMagicien() {
		System.out.print("Entrez un nom pour votre magicien :");
		name = clavier.nextLine();
		Character player1 = new Wizzard(name);
		persoMenu(player1);
		return player1;
	}

	/**
	* <b>Sous-menu de modification du personnage</b>
	* <p>
	* Ce menu permet à l'utilisateur de modifier le nom de son personnage ou d'afficher les information de son personnage
	* Une variable choixInfo de type String est créée afin de récupérer l'entrée clavier
	*
	* </p>
	* @param player1
	* 			le personnage créé de type Character
	*
	* @see Menu#player
	* @see Menu#name
	 */
	public void persoMenu(Character player1) {
		String choixInfo;
		System.out.println("1 - Affichez les infos de votre personnage");
		System.out.println("2 - Modifier le nom de votre personnage");
		System.out.println("3 - Sauvegarder votre personnage");
		choixInfo = clavier.nextLine();
		if (choixInfo.equals("1")) {
			System.out.println(player1);
		} else if (choixInfo.equals("2")) {
			System.out.println("Modifie le nom de ton personnage : ");
			name = clavier.nextLine();
			System.out.println(player1);
		} else if (choixInfo.equals("3")) {
			try
			{
				//étape 1: charger la classe de driver
				Class.forName("org.postgresql.Driver");
				//étape 2: créer l'objet de connexion
				Connection conn = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/donjonsdragons","postgres","123Donjons");
				//étape 3: créer l'objet statement
				Statement stmt = conn.createStatement();
				String nom = player1.getName();
				String classe = player1.getClassName();
				int vie = player1.getLife();
				int atk = player1.getAttack();
				// player.getClassName pour ne pas avoir de if
				int statut = stmt.executeUpdate("INSERT INTO \"Hero\" (\"Type\", \"Nom\", \"NiveauVie\", \"NiveauForce\") "
						+ "VALUES ('" + classe + "', '" + nom + "', '" + vie + "', '" + atk + "')");
				System.out.println(statut);

				//étape 4: exécuter la requête

				conn.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

	/**
	 * <b>Méthode qui affiche les personnages disponibles pour jouer</b>
	 * <p>
	 *     On utilise le JDBC avec tout d'abord le chargement de la classe de Driver.
	 *     Ensuite on crée l'objet de connexion
	 *     On crée l'objet Statement et on exécute la requête
	 *     Enfin on ferme l'objet de connexion
	 * </p>
	 *
	 */
	public void getHeroes() {
		try
		{
			//étape 1: charger la classe de driver
			Class.forName("org.postgresql.Driver");
			//étape 2: créer l'objet de connexion
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/donjonsdragons","postgres","123Donjons");
			//étape 3: créer l'objet statement
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM \"Hero\"");
			//étape 4: exécuter la requête
			while(res.next())
				System.out.println(res.getInt(1)+"  "+res.getString(2)
						+"  "+res.getString(3)+"  "+res.getInt(4)+"  "+res.getInt(5)+"  "+
						res.getString(6)+ "  "+res.getString(7)+ "  "+res.getInt(8));
			//étape 5: fermer l'objet de connexion
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	/**
	 * <b>Méthode qui permet de choisir un personnage disponible</b>
	 * <p>
	 *     Chargement de la classe de Driver
	 *     Création de l'objet de connexion
	 *     Création de l'objet statement
	 *     Récupération du personnage en fonction de son id.
	 *
	 * </p>
	 * @return le player
	 *
	 * @see Character
	 * @see Menu#player
	 *
	 */
	public Character pickHero() {
		int choix;
		try
		{
			//étape 1: charger la classe de driver
			Class.forName("org.postgresql.Driver");
			//étape 2: créer l'objet de connexion
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/donjonsdragons","postgres","123Donjons");
			//étape 3: créer l'objet statement
			Statement stmt = conn.createStatement();
			System.out.println("Choisi un personnage");
			choix = clavier.nextInt();
			clavier.nextLine();
			ResultSet res = stmt.executeQuery("SELECT * FROM \"Hero\" WHERE \"Id\"="+" '"+ choix + "'");
			res.next();
			// récupérer type wizzard ou warrior, utiliser reflect
			if(res.getString("Type").equals("Magicien")) {
				player = new Wizzard(name);
			} else if (res.getString("Type").equals("Guerrier")) {
				player = new Warrior(name);
			}
			player.setName(res.getString("Nom"));
			player.setLife(res.getInt("NiveauVie"));
			player.setAttack(res.getInt("NiveauForce"));
			player.setCasePlayer(res.getInt("Position"));
			//étape 5: fermer l'objet de connexion
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return player;
	}

	/**
	 * Retourne le nom du joueur.
	 *
	 * @return nom du joueur.
	 *
	 * @see Menu#name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Retourne le joueur.
	 *
	 * @return l'objet joueur.
	 *
	 * @see Menu#player
	 */
	public Character getPlayer() {
		return player;
	}

	/**
	 * Met à jour le nom du joueur.
	 *
	 * @param name
	 *            Le nouveau nom du joueur.
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Méthode qui transforme l'objet menu en String
	 *
	 * @return objet Menu
	 */
	@Override
	public String toString() {
		return "Menu{" +
				"name='" + name + '\'' +
				", clavier=" + clavier +
				", player=" + player +
				'}';
	}
}
