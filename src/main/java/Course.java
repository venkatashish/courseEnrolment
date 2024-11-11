public class Course {
    private String name;
    private int code;
    private String instructor;

    public Course(String name, int code, String instructor){
        this.name = name;
        this.code = code;
        this.instructor = instructor;
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }

    public String getInstructor(){
        return instructor;
    }

    @Override
    public String toString(){
        return code+" || "+name+" || "+instructor;
    }

}
