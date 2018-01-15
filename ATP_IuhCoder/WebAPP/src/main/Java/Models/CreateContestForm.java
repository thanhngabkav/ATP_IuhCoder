package Models;

/**
 * Created by lldtien on 8/10/2017.
 */
public class CreateContestForm {
    private String contestName;
    private String startTime;
    private String duration;
    private String[] problemName;

    public CreateContestForm(String contestName, String startTime, String duration, String[] problemName) {
        this.contestName = contestName;
        this.startTime = startTime;
        this.duration = duration;
        this.problemName = problemName;
    }

    public CreateContestForm() {
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String[] getProblemName() {
        return problemName;
    }

    public void setProblemName(String[] problemName) {
        this.problemName = problemName;
    }
}
