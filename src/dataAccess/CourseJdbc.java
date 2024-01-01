package dataAccess;

public class CourseJdbc implements  ICourseDao{
    @Override
    public void add() {
        System.out.println("Course  jdbc database is add ");
    }
}
