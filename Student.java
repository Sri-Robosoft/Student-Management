import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private String branchName;
    private List<Assignment> assignment;
    private int score;
    private int attendance;
    private boolean hasHallTicket = false;

    Student(String name, Branch branch, int attendance) {
        this.name = name;
        this.branchName = branch.getBranchName();
        this.studentID = University.generateStudentID();
        this.assignment = new ArrayList<>();
        this.attendance = attendance;
    }

    public String getStudentName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentBranchName() {
        return this.branchName;
    }

    public void addAssignment(Assignment assignment){
        this.assignment.add(assignment);
    }

    public void submittedAssignment(String assign, String format) {
        for(Assignment a : this.assignment) {
            if(assign.equalsIgnoreCase(a.getAssignmentName())) {
                if(!a.isSubmitted()) {
                    a.setSubmitted(true);
                    a.setFormat(format);
                }
            }
        }
    }

    public void evaluateAssignment(int marks) {
        for(Assignment a : this.assignment) {
            if(a.isSubmitted()) {
                a.setMarks(marks);
            }
            setScore(a.getMarks());
        }
    }

    public void setScore(int mark) {
        this.score += mark;
    }

    public int getScore() {
        return this.score;
    }

    public int getAttendance() {
        return attendance;
    }

    public boolean getHallTicket() {
        return this.hasHallTicket;
    }

    public void setHallTicket() {
        this.hasHallTicket = true;
    }


}
