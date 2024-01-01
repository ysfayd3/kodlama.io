package dataAccess;

public class CourseHibernate implements ICourseDao{
    @Override
    public void add() {
        System.out.println("Course hibernate veritabanına eklendi");
    }
}
