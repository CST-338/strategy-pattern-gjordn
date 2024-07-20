/**
 * @author Gerek G. Jordan
 * CST 338 Software Design Summer 24
 * Due Date: July 23rd, 2024
 * https://github.com/CST-338/strategy-pattern-gjordn.git
 *
 */

import java.util.HashMap;
import java.util.Objects;

public class Monster {
    private String name;
    private int hp;
    private int maxHP;
    private int xp;
    private HashMap<String, Integer> items;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;
        return getHp() == monster.getHp() && getMaxHP() == monster.getMaxHP() && getXp() == monster.getXp() && Objects.equals(getName(), monster.getName()) && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + getHp();
        result = 31 * result + getMaxHP();
        result = 31 * result + getXp();
        result = 31 * result + Objects.hashCode(getItems());
        return result;
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }
}
