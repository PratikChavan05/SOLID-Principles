package solid.isp.good;

/**
 * ✅ FOLLOWS Interface Segregation Principle
 *
 * The fat Worker interface is split into small, focused interfaces.
 * Each class implements ONLY the interfaces relevant to it.
 */
public interface Workable {
    void work();
}
