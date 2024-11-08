public class Faculty {
    private int facultyID;
    private String facultyName;

    Faculty(String name) {
        this.facultyID = College.generateFacultyID();
        this.facultyName = name;
    }

    public String getFacultyName() {
        return this.facultyName;
    }

    public int getFacultyID() {
        return this.facultyID;
    }
}
