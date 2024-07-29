package Monsters; /**
 * @author Gerek G. Jordan
 * CST 338 Software Design Summer 24
 * Due Date: July 23rd, 2024
 * https://github.com/CST-338/strategy-pattern-gjordn.git
 * This is an abstract class that represents different typse of monsters.
 * It provides attributes that all monsters will share.
 */

import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class Monster {
    private String name;
    private int hp;
    private int maxHP;
    private int xp = 10;
    private HashMap<String, Integer> items;
    private int str;
    private int def;
    private int agi;
    private Attack attack;

    //constructor
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
    /**
     * Auto-generated getters & setters for name, hp, maxHP, xp, & items.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }

        // Returns a random number between min and max inclusive
        return rand.nextInt((max - min) + 1) + min;
    }
    /**
     *Method that calculates if target has taken damage.
     */
    public boolean takeDamage(int damage) {
        if (damage > 0) {
            this.hp -= damage;
            System.out.println("The creature was hit for " + damage + " damage");
            if (this.hp <= 0) {
                this.hp = 0;
                System.out.println("Oh no! the creature has perished");
            }
            System.out.println(this);
            return this.hp > 0;
        }
        return true;
    }
    /**
     * Method calls takeDamage method of the monster that's passed in.
     */
    public boolean attackTarget(Monster target) {
        int damage = this.attack.attack(target);
        return target.takeDamage(damage);
    }


    /**
     * Overridden equals method to compare monsters.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;
        return getHp() == monster.getHp() && getMaxHP() == monster.getMaxHP() && getXp() == monster.getXp() && Objects.equals(getName(), monster.getName()) && Objects.equals(getItems(), monster.getItems());
    }
    /**
     * Overridden hashcode method for monster attributes.
     */
    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + getHp();
        result = 31 * result + getMaxHP();
        result = 31 * result + getXp();
        result = 31 * result + Objects.hashCode(getItems());
        return result;
    }
    /**
     * Overridden toString method for display.
     */
    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }
}
