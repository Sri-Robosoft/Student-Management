public class NonTeachingFaculty extends Faculty {
    NonTeachingFaculty(String name) {
        super(name);
    }

    public void workOfNonTeaching(int id, String name, String type) {
        if(type.equalsIgnoreCase("college"))
            System.out.println("college related task");
        else
            System.out.println("Logistics related task of university");
    }


}
