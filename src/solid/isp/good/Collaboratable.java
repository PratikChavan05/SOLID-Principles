package solid.isp.good;

/**
 * ✅ Only entities that participate in organizational activities implement this.
 */
public interface Collaboratable {
    void attendMeeting();
    void writeReport();
}
