public class Subject {
    private String name;
    private boolean isElective;

    public Subject(String name, boolean isElective) {
        this.name = name;
        this.isElective = isElective;
    }

    public String getName() {
        return name;
    }

    public boolean isElective() {
        return isElective;
    }
}
