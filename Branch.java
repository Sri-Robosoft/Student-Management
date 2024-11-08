import java.util.*;

public class Branch {
    private String branchName;
    private List<Student> studentList;
    private static List<Subject> subjectList;
    private List<TeachingFaculty> teachingFaculty;

    Branch(String name) {
        this.branchName = name;
        this.studentList = new ArrayList<>();
        this.subjectList = new ArrayList<>();
        this.teachingFaculty = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void addStudentList(Student student) {
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return  studentList;
    }

    public void addTeachingFacultyList(TeachingFaculty faculty) {
        teachingFaculty.add(faculty);
    }

    public String getTeachingFacultyDetails() {
        System.out.print("Faculty: ");
        StringBuilder name= new StringBuilder();
        for (TeachingFaculty t: teachingFaculty) {
            name.append(t.getFacultyID()).append(" ").append(t.getFacultyName());
        }
        return name.toString();
    }

    public void addSubjectToList(Subject sub) {
        this.subjectList.add(sub);
    }

    public static List<Subject> getSubjectList() {
        return subjectList;
    }

    public void sendReport() {
        for(Student s : studentList) {
            System.out.println("ID: " +s.getStudentID()+ "  "+" Name: " +s.getStudentName()+ " "+" Branch: " +s.getStudentBranchName());
            System.out.println("Total Marks: " +s.getScore());
            System.out.println("Attendance: " +s.getAttendance()+ "%");
            if(s.getHallTicket()) {
                System.out.println("Hall Ticket Generated: " + "ID: " +s.getStudentID() + " Name: " +s.getStudentName());
            } else {
                System.out.println("Hall Ticket not generated: Attendance shortage");
            }
            System.out.println();
        }
    }

    public void topThreeScorers() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getScore() - s1.getScore();
            }
        });

        if(studentList.size() >= 3) {
            System.out.println("Top 3 Performers are:");
            for(Student s : studentList.subList(0,3)) {
                System.out.println("ID: " +s.getStudentID()+ " Name: " +s.getStudentName()+ " Total Score: "+s.getScore());
            }
        } else {
            for(Student s : studentList) {
                System.out.println("ID: " +s.getStudentID()+ " Name: " +s.getStudentName()+ " Total Score: "+s.getScore());
            }
        }
    }
}
