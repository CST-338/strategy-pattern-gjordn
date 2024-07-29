package Abilities;

import Monsters.Monster;

/**
 * @author Gerek G. Jordan
 * CST 338 Software Design Summer 24
 * Due Date: July 23rd, 2024
 * https://github.com/CST-338/strategy-pattern-gjordn.git
 * Class that represents a ranged attack. Implements Abilities.Attack interface.
 */

public class RangedAttack implements Attack{
    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getAgi();
    }
}
