package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by THANH NGA on 6/19/2017.
 */
public class MarkingData implements Serializable {
    private int SubmissionID;
    private float TimeLimit;
    private int MemoryLimit;
    private List<Input> ListInput;
    private List<Output> ListOutput;
    private String SourceCode;

    public MarkingData(int submissionID, float timeLimit, int memoryLimit, List<Input> listInput,
                       List<Output> listOutput) {
        SubmissionID = submissionID;
        TimeLimit = timeLimit;
        MemoryLimit = memoryLimit;
        ListInput = listInput;
        ListOutput = listOutput;
    }
    public MarkingData() {
        // TODO Auto-generated constructor stub
        this(-1,-1,-1, new ArrayList(), new ArrayList());
    }
    public int getSubmissionID() {
        return SubmissionID;
    }
    public void setSubmissionID(int submissionID) {
        SubmissionID = submissionID;
    }
    public float getTimeLimit() {
        return TimeLimit;
    }
    public void setTimeLimit(float timeLimit) {
        TimeLimit = timeLimit;
    }
    public int getMemoryLimit() {
        return MemoryLimit;
    }
    public void setMemoryLimit(int memoryLimit) {
        MemoryLimit = memoryLimit;
    }
    public List<Input> getListInput() {
        return ListInput;
    }
    public void setListInput(List<Input> listInput) {
        ListInput = listInput;
    }
    public List<Output> getListOutput() {
        return ListOutput;
    }
    public void setListOutput(List<Output> listOutput) {
        ListOutput = listOutput;
    }
    public String getSourceCode() {
        return SourceCode;
    }
    public void setSourceCode(String sourceCode) {
        SourceCode = sourceCode;
    }
}
