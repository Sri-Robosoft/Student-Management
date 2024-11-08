public class Assignment {
    private String assignmentName;
    private String format;
    private boolean isSubmitted;
    private int marks;

    Assignment(String assignmentName, boolean isSubmitted) {
        this.assignmentName = assignmentName;
        this.isSubmitted = isSubmitted;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }


}
