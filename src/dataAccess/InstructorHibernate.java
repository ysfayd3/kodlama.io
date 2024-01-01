package dataAccess;

public class InstructorHibernate implements IInstructorDao{
    @Override
    public void add() {
        System.out.println("Instructor hibernate database is add");
    }
}
