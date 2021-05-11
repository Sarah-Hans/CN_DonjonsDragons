package game;

import characters.Character;
import consumables.*;
import mobs.*;
import stuff.*;

import java.util.Scanner;

public abstract class Square {

    // Méthode qui va gérer les interactions du player avec le contenu des cases du jeu
    public String interaction(Character player1) {
        String message = null;
        Scanner clavier = new Scanner(System.in);
        String choix;
        if (this instanceof EmptySquare) {
            message = "Il ne se passe rien ici, tu peux continuer ton chemin.";
        } else if (this instanceof MediumLifePotion || this instanceof BigLifePotion) {
            ((Potion) this).action(player1);
            message = "Tu récupères "+((Potion) this).getName()+" et tu gagnes "+((Potion) this).getAddLife()+" points de vie. Ta vie est maintenant de : "+player1.getLife();
        } else if (this instanceof Dragon || this instanceof Goblin || this instanceof Sorcerer) {
            System.out.println("Tu vas devoir affronter "+((Ennemy) this).getName());
            System.out.println("Tape go pour engager le combat !");
            choix = clavier.nextLine();
            if (choix.equals("go")) {
                player1.goFight(player1, (Ennemy) this);
                if (((Ennemy) this).getLife() > 0) {
                    ((Ennemy) this).atkMob(player1, ((Ennemy) this));
                }
            }
            message = "Etat de ton personnage : "+player1;
        } else if (this instanceof Fireball || this instanceof Lightning) {
            ((Spell) this).action(player1);
            message = "Tu récupères le sort "+ ((Spell) this).getName()+" et tu augmentes ton attaque de "+ ((Spell) this).getAtkLvl()+" points. Ton attaque est maintenant de : "+player1.getAttack();
        } else if (this instanceof Mace || this instanceof Sword) {
            ((Weapon) this).action(player1);
            message = "Tu récupère l'arme "+((Weapon) this).getName()+" et tu augmentes ton attaque de "+ ((Weapon) this).getAtkLvl()+" points. Ton attaque est maintenant de : "+player1.getAttack();
        }
        return message;
    }
}