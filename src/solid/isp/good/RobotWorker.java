package solid.isp.good;

/**
 * ✅ RobotWorker implements ONLY Workable — the only interface relevant to it.
 *
 * No empty stubs. No UnsupportedOperationException.
 * No misleading API. Clean and honest.
 */
public class RobotWorker implements Workable {

    private String model;

    public RobotWorker(String model) {
        this.model = model;
    }

    @Override
    public void work() {
        System.out.println("Robot " + model + " is performing automated tasks.");
    }
}
