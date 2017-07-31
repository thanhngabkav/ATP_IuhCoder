package Models;

/**
 * Created by lldtien on 7/19/2017.
 */

import java.io.Serializable;

/**
 * Not complete
 *
 */
public class Submission implements Serializable {
    private String SubmissionID;
    private String StartTime;
    private String ProblemName;
    private String Verdict;
    private String Time;
    private String Memory;

    public Submission() {
    }

    public Submission(String submissionID, String startTime, String problemName, String verdict, String time, String memory) {
        SubmissionID = submissionID;
        StartTime = startTime;
        ProblemName = problemName;
        Verdict = verdict;
        Time = time;
        Memory = memory;
    }

    public void setSubmissionID(String submissionID) {
        SubmissionID = submissionID;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public void setProblemName(String problemName) {
        ProblemName = problemName;
    }

    public void setVerdict(String verdict) {
        Verdict = verdict;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getSubmissionID() {
        return SubmissionID;
    }

    public String getStartTime() {
        return StartTime;
    }

    public String getProblemName() {
        return ProblemName;
    }

    public String getVerdict() {
        return Verdict;
    }

    public String getTime() {
        return Time;
    }

    public String getMemory() {
        return Memory;
    }


}
