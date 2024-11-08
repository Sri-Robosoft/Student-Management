public class TeachingFaculty extends Faculty{
    TeachingFaculty(String name) {
        super(name);
    }

    public void assignAssignmentToStudent(Student student, String name, boolean isSubmitted) {
        Assignment assignment = new Assignment(name, isSubmitted);
        student.addAssignment(assignment);
    }

    public void addMarks(Student student, String subName, int marks) {
        int totalMarks =0;
        for(Subject s: Branch.getSubjectList()) {
            if(s.getName().equalsIgnoreCase(subName)) {
                totalMarks += marks;
            }
        }
        student.setScore(totalMarks);
    }

    public void evaluateMarksForAssignment(Student student, int marks) {
        student.evaluateAssignment(marks);
    }
}
