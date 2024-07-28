/**
 * @author Gerek G. Jordan
 * CST 338 Software Design Summer 24
 * Due Date: July 23rd, 2024
 * https://github.com/CST-338/strategy-pattern-gjordn.git
 * This imp class is a child class of Monster.
 */

import java.util.HashMap;

public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;
        setAttack(new MeleeAttack(this));
        setStr(super.getAttribute(1, maxStr));
        setDef(super.getAttribute(1, maxDef));
        setAgi(super.getAttribute(1, maxAgi));
    }
    /**
     * Overridden toString method for Imp display.
     */
    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }

}
