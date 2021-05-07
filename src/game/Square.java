package game;

import characters.Warrior;
import characters.Character;
import characters.Wizzard;
import consumables.BigLifePotion;
import consumables.MediumLifePotion;
import mobs.Dragon;
import mobs.Goblin;
import mobs.Sorcerer;
import stuff.Fireball;
import stuff.Lightning;
import stuff.Mace;
import stuff.Sword;


public abstract class Square {

    // Méthode qui va gérer les interactions du player avec le contenu des cases du jeu
    public String interaction(Character player1) {
        String message = null;
        if (this instanceof EmptySquare) {
            message = "La case est vide";
        } else if (this instanceof MediumLifePotion) {
            message = "Tu récupères une potion de vie medium";
        } else if (this instanceof BigLifePotion) {
            message = "Tu récupères une grosse potion de vie";
        } else if (this instanceof Dragon) {
            message = "Tu vas devoir affronter un dragon !";
        } else if (this instanceof Goblin) {
            message = "Tu vas devoir affronter un gobelin !";
        } else if (this instanceof Sorcerer) {
            message = "Tu vas devoir affronter un sorcier !";
        } else if (this instanceof Fireball) {
            if (player1 instanceof Warrior) {
                message = "Il y a un sort mais tu n'as pas le droit de l'équiper.";
            } else if (player1 instanceof Wizzard) {
                message = "Tu récupères le sort Fireball !";
            }
        } else if (this instanceof Lightning) {
            if (player1 instanceof Warrior) {
                message = "Il y a un sort mais tu n'as pas le droit de l'équiper.";
            } else if (player1 instanceof Wizzard) {
                message = "Tu récupères le sort Fireball !";
            }
        } else if (this instanceof Mace) {
            if (player1 instanceof Warrior) {
                message = "Tu récupère une masse !";
            } else if (player1 instanceof Wizzard) {
                message = "Il y a une masse mais tu n'as pas le droit de l'équiper.";
            }
        } else if (this instanceof Sword) {
            if (player1 instanceof Warrior) {
                message = "Tu récupère une épée !";
            } else if (player1 instanceof Wizzard) {
                message = "Il y a une épée mais tu n'as pas le droit de l'équiper.";
            }
        }
        return message;
    }

}
