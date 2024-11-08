public class HelperClass {
    public void HelperFunction() {
        University vtu = new University("VTU");
        NonTeachingFaculty nonTeacherUni1 = new NonTeachingFaculty("Suresh");
        vtu.addNonTeachingFacultyUniList(nonTeacherUni1);

        College yit = new College("YIT");
        vtu.addCollegesToUniversity(yit);

        Branch cseBranch = new Branch("CSE");
        yit.addBranchList(cseBranch);
        Branch eceBranch = new Branch("ECE");
        yit.addBranchList(eceBranch);

        NonTeachingFaculty nonTeacher1 = new NonTeachingFaculty("Suresh");
        yit.addNonTeachingFacultyList(nonTeacher1);
        NonTeachingFaculty nonTeacher2 = new NonTeachingFaculty("Harish");
        yit.addNonTeachingFacultyList(nonTeacher2);

        TeachingFaculty Teacher1 = new TeachingFaculty("Ramesh");
        cseBranch.addTeachingFacultyList(Teacher1);
        TeachingFaculty Teacher2 = new TeachingFaculty("Kavya");
        eceBranch.addTeachingFacultyList(Teacher2);

        cseBranch.addSubjectToList(new Subject("Data Structures", false));
        cseBranch.addSubjectToList(new Subject("Java", false));
        cseBranch.addSubjectToList(new Subject("OOPS", false));
        cseBranch.addSubjectToList(new Subject("Cryptography", true));

        yit.getBranchDetails();

        Student student1 = new Student("Helios", cseBranch, 78);
        Student student2 = new Student("Parvez", cseBranch, 60);
        Student student3 = new Student("Lohith", cseBranch, 90);
        cseBranch.addStudentList(student1);
        cseBranch.addStudentList(student2);
        cseBranch.addStudentList(student3);

        Teacher1.addMarks(student1, "Data Structures", 40);
        Teacher1.addMarks(student1, "Java", 50);
        Teacher1.addMarks(student1, "OOPS", 70);
        Teacher1.addMarks(student1, "Cryptography", 54);
        Teacher1.addMarks(student2, "Data Structures", 60);
        Teacher1.addMarks(student2, "Java", 35);
        Teacher1.addMarks(student2, "OOPS", 44);
        Teacher1.addMarks(student2, "Cryptography", 84);
        Teacher1.addMarks(student3, "Data Structures", 90);
        Teacher1.addMarks(student3, "Java", 56);
        Teacher1.addMarks(student3, "OOPS", 41);
        Teacher1.addMarks(student3, "Cryptography", 59);

        Teacher1.assignAssignmentToStudent(student1,"Assignment-1", false);
        Teacher1.assignAssignmentToStudent(student1,"Assignment-2", false);
        Teacher1.assignAssignmentToStudent(student2,"Assignment-1", false);
        Teacher1.assignAssignmentToStudent(student2,"Assignment-2", false);
        Teacher1.assignAssignmentToStudent(student3,"Assignment-1", false);
        Teacher1.assignAssignmentToStudent(student3,"Assignment-2", false);


        student1.submittedAssignment("Assignment-1", ".pdf");
        student1.submittedAssignment("Assignment-2", ".txt");
        student2.submittedAssignment("Assignment-2", ".docx");
        student3.submittedAssignment("Assignment-1", ".pdf");

        Teacher1.evaluateMarksForAssignment(student1, 30);
        Teacher1.evaluateMarksForAssignment(student2, 30);
        Teacher1.evaluateMarksForAssignment(student3, 30);

        vtu.generateHallTickets();
        yit.sendMonthlyReportToUniversity();
        cseBranch.topThreeScorers();
    }
}
