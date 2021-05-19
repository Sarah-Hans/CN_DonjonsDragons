package stuff;

import characters.Warrior;
import characters.Character;


public abstract class Spell extends AttackItem {

    public Spell(String name, int atkLvl) {
        super(name, atkLvl);

    }
    public String interaction(Character player) {
        if (player instanceof Warrior) {
            return "Il y a un sort mais tu n'as pas le droit de l'équiper.";
        } else {
            player.setAttack(player.getAttack()+ atkLvl);
            return "Tu récupères le sort "+ this.getName()+" et tu augmentes ton attaque de "+ this.getAtkLvl()+" points. Ton attaque est maintenant de : "+player.getAttack();
        }
    }

}
