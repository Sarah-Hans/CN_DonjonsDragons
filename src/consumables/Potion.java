package consumables;

import characters.Character;
import game.Square;

/**
 * Classe abstraite Potion qui hérite de la classe Square
 *
 * @see Square
 * @see Character
 *
 * @author Sarah-Hans
 */
public abstract class Potion implements Square {
    /**
     * Variable addLife de type entier
     * Elle définit le nombre de pv ajoutés par la potion
     * @see Potion(String, int)
     * @see Potion#getAddLife()
     * @see Potion#setAddLife(int)
     */
    protected int addLife;

    /**
     * Variable name de type String
     * Elle définit le nom de la potion
     * @see Potion(String, int)
     * @see Potion#getName()
     * @see Potion#setName(String)
     */
    protected String name;

    /**
     * Constructeur qui initialise les attributs ci-dessus
     *
     * @param name
     *          Le nom de la potion
     * @param addLife
     *          Les pv ajoutés par la potion
     *
     * @see Potion#name
     * @see Potion#addLife
     */
    public Potion(String name, int addLife) {
        this.name = name;
        this.addLife = addLife;
    }

    /**
     * Méthode interaction avec le joueur
     * @param player
     *          le joueur
     * @return une chaine de caractères
     *
     * @see Character
     * @see Potion#getName()
     * @see Potion#getAddLife()
     */
    public String interaction(Character player) {
        player.setLife(player.getLife() + addLife);
       return "Tu récupères "+ this.getName()+" et tu gagnes "+ this.getAddLife()+" points de vie. Ta vie est maintenant de : "+player.getLife();
    }

    /**
     *
     * @return les pv ajoutés
     */
    public int getAddLife() {
        return addLife;
    }

    /**
     * Met à jour les pv ajoutés
     * @param addLife
     */
    public void setAddLife(int addLife) {
        this.addLife = addLife;
    }

    /**
     *
     * @return le nom de la potion
     */
    public String getName() {
        return name;
    }

    /**
     * Met à jour le nom de la potion
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "addLife=" + addLife +
                ", name='" + name + '\'' +
                '}';
    }
}
