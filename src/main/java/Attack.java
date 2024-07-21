/**
 * @author Gerek G. Jordan
 * CST 338 Software Design Summer 24
 * Due Date: July 23rd, 2024
 * https://github.com/CST-338/strategy-pattern-gjordn.git
 * This is an interface that is organized under the Ability interface.
 */
public interface Attack extends Ability {
    Integer attack(Monster target);
}
