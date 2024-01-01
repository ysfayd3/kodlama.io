package dataAccess;

public class InstructorJdbc implements IInstructorDao{
    @Override
    public void add() {
        System.out.println("Instructor database is add");
    }
}
