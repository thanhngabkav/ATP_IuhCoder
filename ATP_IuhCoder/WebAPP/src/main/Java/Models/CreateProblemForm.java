package Models;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by lldtien on 8/5/2017.
 */
public class CreateProblemForm {
    private String problemID;
    private String problemName;
    private String content;
    private boolean isPublicFile;
    private CommonsMultipartFile input;
    private CommonsMultipartFile output;
    private String sampleInput[];
    private String sampleOutput[];

    public CreateProblemForm() {
    }


    public CommonsMultipartFile getInput() {
        return input;
    }

    public void setInput(CommonsMultipartFile input) {
        this.input = input;
    }

    public CommonsMultipartFile getOutput() {
        return output;
    }

    public void setOutput(CommonsMultipartFile output) {
        this.output = output;
    }

    public void setIsPublicFile(boolean isPublicFile) {
        this.isPublicFile = isPublicFile;
    }

    public boolean getIsPublicFile() {
        return isPublicFile;
    }

    public CreateProblemForm(String problemID) {
        this.problemID = problemID;
    }

    public void setProblemID(String problemID) {
        this.problemID = problemID;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProblemID() {
        return problemID;
    }

    public String getProblemName() {
        return problemName;
    }

    public String getContent() {
        return content;
    }

    public CreateProblemForm(String problemID, String problemName, String content, boolean isPublicFile, CommonsMultipartFile input, CommonsMultipartFile output, String[] sampleInput, String[] sampleOutput) {
        this.problemID = problemID;
        this.problemName = problemName;
        this.content = content;
        this.isPublicFile = isPublicFile;
        this.input = input;
        this.output = output;
        this.sampleInput = sampleInput;
        this.sampleOutput = sampleOutput;
    }

    public String[] getSampleInput() {
        return sampleInput;
    }

    public void setSampleInput(String[] sampleInput) {
        this.sampleInput = sampleInput;
    }

    public String[] getSampleOutput() {
        return sampleOutput;
    }

    public void setSampleOutput(String[] sampleOutput) {
        this.sampleOutput = sampleOutput;
    }
}

