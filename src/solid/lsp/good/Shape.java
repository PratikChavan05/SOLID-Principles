package solid.lsp.good;

/**
 * ✅ FOLLOWS Liskov Substitution Principle
 *
 * Instead of forcing Square to extend Rectangle (and break its contract),
 * we define a common abstraction that both can implement WITHOUT
 * violating any behavioral contract.
 */
public interface Shape {

    double calculateArea();

    String describe();
}
