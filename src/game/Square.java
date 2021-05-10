package game;

import characters.Warrior;
import characters.Character;
import characters.Wizzard;
import consumables.BigLifePotion;
import consumables.MediumLifePotion;
import consumables.Potion;
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
        int addLife;
        int addAtk;
        if (this instanceof EmptySquare) {
            message = "La case est vide, il ne se passe rien";
        } else if (this instanceof MediumLifePotion) {
            addLife = ((MediumLifePotion) this).getAddLife();
            player1.setLife(player1.getLife() + addLife);
            if ((player1 instanceof Warrior) && (player1.getLife() > 10)) {
                player1.setLife(10);
            }
            if ((player1 instanceof Wizzard) && (player1.getLife() > 6)) {
                player1.setLife(6);
            }
            message = "Tu récupères une potion de vie medium et tu gagnes 2 points de vie. Ta vie est maintenant de : "+player1.getLife();
        } else if (this instanceof BigLifePotion) {
            addLife = ((BigLifePotion) this).getAddLife();
            player1.setLife(player1.getLife() + addLife);
            if ((player1 instanceof Warrior) && (player1.getLife() > 10)) {
                player1.setLife(10);
            }
            if ((player1 instanceof Wizzard) && (player1.getLife() > 6)) {
                player1.setLife(6);
            }
            message = "Tu récupères une grosse potion de vie et tu gagnes 5 points de vie. Ta vie est maintenant de : "+player1.getLife();
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
                addAtk = ((Fireball) this).getAtkLvl();
                player1.setAttack(player1.getAttack()+ addAtk);
                if(player1.getAttack() > 15) {
                    player1.setAttack(15);
                }
                message = "Tu récupères le sort Fireball et tu augmentes ton attaque de 7 points. Ton attaque est maintenant de : "+player1.getAttack();
            }
        } else if (this instanceof Lightning) {
            if (player1 instanceof Warrior) {
                message = "Il y a un sort mais tu n'as pas le droit de l'équiper.";
            } else if (player1 instanceof Wizzard) {
                addAtk = ((Lightning) this).getAtkLvl();
                player1.setAttack(player1.getAttack()+ addAtk);
                if(player1.getAttack() > 15) {
                    player1.setAttack(15);
                }
                message = "Tu récupères le sort Lightning et tu augmentes ton attaque de 2 points. Ton attaque est maintenant de : "+player1.getAttack();
            }
        } else if (this instanceof Mace) {
            if (player1 instanceof Warrior) {
                addAtk = ((Mace) this).getAtkLvl();
                player1.setAttack(player1.getAttack()+ addAtk);
                if(player1.getAttack() > 10) {
                    player1.setAttack(10);
                }
                message = "Tu récupère une masse et tu augmentes ton attaque de 3 points. Ton attaque est maintenant de : "+player1.getAttack();
            } else if (player1 instanceof Wizzard) {
                message = "Il y a une masse mais tu n'as pas le droit de l'équiper.";
            }
        } else if (this instanceof Sword) {
            if (player1 instanceof Warrior) {
                addAtk = ((Sword) this).getAtkLvl();
                player1.setAttack(player1.getAttack()+ addAtk);
                if(player1.getAttack() > 10) {
                    player1.setAttack(10);
                }
                message = "Tu récupère une épée et tu augmentes ton attaque de 5 points. Ton attaque est maintenant de : "+player1.getAttack();
            } else if (player1 instanceof Wizzard) {
                message = "Il y a une épée mais tu n'as pas le droit de l'équiper.";
            }
        }
        return message;
    }

}
