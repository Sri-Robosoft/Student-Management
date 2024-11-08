import java.util.*;

public class University {
    private String universityName;
    private List<College> collegeList;
    private List<NonTeachingFaculty> nonTeachingFacultyUniversity;

    private static int studentID=1000;

    University(String name) {
        this.universityName = name;
        this.collegeList = new ArrayList<>();
    }

    public String getUniversityName() {
        return this.universityName;
    }

    public void addCollegesToUniversity(College college) {
        collegeList.add(college);
    }

    public static String generateStudentID() {
        return "S" +studentID++;
    }

    public void generateHallTickets() {
        for(College c : collegeList) {
            for(Branch b : c.getBranchList()) {
                for(Student s : b.getStudentList()) {
                    if(s.getAttendance() >= 75) {
                        s.setHallTicket();
                    }
                }
            }
        }
    }

    public void addNonTeachingFacultyUniList(NonTeachingFaculty faculty) {
        nonTeachingFacultyUniversity.add(faculty);
    }

    public void getNonTeachingFacultyDetails() {
        for(NonTeachingFaculty n : nonTeachingFacultyUniversity) {
            n.workOfNonTeaching(n.getFacultyID(), n.getFacultyName(), "university");
        }
    }
}
