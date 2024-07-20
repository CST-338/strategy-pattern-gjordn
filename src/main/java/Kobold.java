/**
 * @author Gerek G. Jordan
 * CST 338 Software Design Summer 24
 * Due Date: July 23rd, 2024
 * https://github.com/CST-338/strategy-pattern-gjordn.git
 * This Kobold class is a child class of Monster.
 */

import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }
    /**
     * Overridden toString method for Kobold display.
     */
    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}
