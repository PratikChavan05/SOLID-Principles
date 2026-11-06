package solid.isp.bad;

/**
 * ❌ VIOLATES Interface Segregation Principle
 *
 * This "fat" interface forces ALL workers to implement every method —
 * even methods that don't apply to them.
 *
 * A Robot can work() but can't eat() or sleep().
 * A Human intern might not have access to attendMeeting().
 *
 * Forcing classes to implement irrelevant methods leads to
 * empty stubs, UnsupportedOperationExceptions, and fragile code.
 */
public interface Worker {

    void work();

    void eat();

    void sleep();

    void attendMeeting();

    void writeReport();
}
