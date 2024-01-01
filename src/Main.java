import business.CategoryManager;
import business.CourseManager;
import core.logging.CategoryLog;
import core.logging.CourseLog;
import core.logging.ILogger;
import core.logging.InstructorLog;
import dataAccess.CategoryHibernate;
import dataAccess.CourseHibernate;
import entities.Category;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers = {new InstructorLog(), new CourseLog(), new CategoryLog()};
        CategoryManager categoryManager = new CategoryManager(new CategoryHibernate(), loggers);

        Course course = new Course(1, "caner", 8);

        Category category = new Category(9, "Elektronik");

        CourseManager courseManager = new CourseManager(new CourseHibernate(), loggers);
        courseManager.courseAdd(course);
        // breakpoınte bak
        //

        //categoryManager.showCategoryName();
        //categoryManager.add(category);
        //categoryManager.showCategoryName();

    }
}
//kullanılmayan ımportları ctrl +alt + o