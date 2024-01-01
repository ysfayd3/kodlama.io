package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    ICourseDao iCourseDao;
    ILogger[] loggers;
    List<Course> courseList = new ArrayList<>();

    public CourseManager(ICourseDao iCourseDao, ILogger[] loggers) {
        this.iCourseDao = iCourseDao;
        this.loggers = loggers;
        courseList.add(new Course(1, "yusuf", -1));
        courseList.add(new Course(2, "caner", 1000));
        courseList.add(new Course(3, "adem", 1000));
        courseList.add(new Course(4, "alpo", 1000));
        courseList.add(new Course(4, "npc(mahmut)", 1000));

    }

    public void courseAdd(Course course) {

        checkCoursePrice(course);
        checkCourseName(course);

        courseList.add(course);

    }
//busıness rules arastır
    private void checkCoursePrice(Course course) {
        if (course.getCoursePrice() < 0) {
            throw new RuntimeException("Kursun fıyatı 0dan kucuk olamaz");
        }
    }

    private void checkCourseName(Course course) {
        for (Course course1 : courseList) {
            if (course1.getCourseName().equals(course.getCourseName())) {
                throw new RuntimeException("canerım burnu cok guzel");
            }
        }
    }
}
