package Models;

import java.io.Serializable;

/**
 * Created by lldtien on 7/17/2017.
 */
public class Contest implements Serializable {
    private String contestID;
    private String contestName;
    private String contestWriter;
    private String contestStartTime;
    private String contestEndTime;
    private String contestStatus;

    public Contest() {
    }

    public Contest(String contestID, String contestName, String contestWriter, String contestStartTime, String contestEndTime, String contestStatus) {
        this.contestID = contestID;
        this.contestName = contestName;
        this.contestWriter = contestWriter;
        this.contestStartTime = contestStartTime;
        this.contestEndTime = contestEndTime;
        this.contestStatus = contestStatus;
    }

    public void setContestID(String contestID) {
        this.contestID = contestID;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public void setContestWriter(String contestWriter) {
        this.contestWriter = contestWriter;
    }

    public void setContestStartTime(String contestStartTime) {
        this.contestStartTime = contestStartTime;
    }

    public void setContestEndTime(String contestEndTime) {
        this.contestEndTime = contestEndTime;
    }

    public void setContestStatus(String contestStatus) {
        this.contestStatus = contestStatus;
    }

    public String getContestID() {
        return contestID;
    }

    public String getContestName() {
        return contestName;
    }

    public String getContestWriter() {
        return contestWriter;
    }

    public String getContestStartTime() {
        return contestStartTime;
    }

    public String getContestEndTime() {
        return contestEndTime;
    }

    public String getContestStatus() {
        return contestStatus;
    }
}
