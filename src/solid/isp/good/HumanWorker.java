package solid.isp.good;

/**
 * ✅ HumanWorker implements ALL interfaces — because humans can do all of these.
 * But they are NOT forced to; they CHOOSE to because it's relevant.
 */
public class HumanWorker implements Workable, Feedable, Restable, Collaboratable {

    private String name;

    public HumanWorker(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working on tasks.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating lunch.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void attendMeeting() {
        System.out.println(name + " is attending a meeting.");
    }

    @Override
    public void writeReport() {
        System.out.println(name + " is writing a report.");
    }
}
