package solid.isp.bad;

/**
 * ❌ Robot is FORCED to implement eat(), sleep(), attendMeeting(), writeReport()
 * even though none of these make sense for a robot.
 *
 * This leads to:
 *   - Empty method stubs (silent bugs)
 *   - UnsupportedOperationException (runtime crashes)
 *   - Misleading API (callers think robots can eat!)
 */
public class RobotWorker implements Worker {

    private String model;

    public RobotWorker(String model) {
        this.model = model;
    }

    @Override
    public void work() {
        System.out.println("Robot " + model + " is performing automated tasks.");
    }

    @Override
    public void eat() {
        // ❌ Robots don't eat! But we're forced to implement this.
        throw new UnsupportedOperationException("Robot " + model + " cannot eat!");
    }

    @Override
    public void sleep() {
        // ❌ Robots don't sleep!
        throw new UnsupportedOperationException("Robot " + model + " cannot sleep!");
    }

    @Override
    public void attendMeeting() {
        // ❌ Robots don't attend meetings!
        throw new UnsupportedOperationException("Robot " + model + " cannot attend meetings!");
    }

    @Override
    public void writeReport() {
        // ❌ Robots don't write reports!
        throw new UnsupportedOperationException("Robot " + model + " cannot write reports!");
    }
}
