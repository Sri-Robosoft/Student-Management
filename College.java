import java.util.*;

public class College {
    private String name;
    private List<Branch> branchList;
    private List<NonTeachingFaculty> nonTeachingFaculty;

    private static int facultyID = 100;

    College(String collegeName) {
        this.name = collegeName;
        this.branchList = new ArrayList<>();
        this.nonTeachingFaculty = new ArrayList<>();
    }

    public void addBranchList(Branch branch) {
        branchList.add(branch);
    }

    public List<Branch> getBranchList() {
        return  branchList;
    }

    public void getBranchDetails() {
        System.out.println("Branch Details");
        System.out.println("***************");
        for(Branch b : branchList) {
            System.out.print("Branch: " +b.getBranchName());
            System.out.println();
            System.out.println(b.getTeachingFacultyDetails());
        }
        System.out.println();
    }

    public static int generateFacultyID() {
        return facultyID++;
    }

    public void addNonTeachingFacultyList(NonTeachingFaculty faculty) {
        nonTeachingFaculty.add(faculty);
    }

    public void getNonTeachingFacultyDetails() {
        for(NonTeachingFaculty n : nonTeachingFaculty) {
            n.workOfNonTeaching(n.getFacultyID(), n.getFacultyName(), "college");
        }
    }

    public void sendMonthlyReportToUniversity() {
        System.out.println("Student Details: ");
        System.out.println("***************");
        for(Branch b : branchList) {
            b.sendReport();
        }
    }

}
