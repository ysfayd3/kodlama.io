package business;

import core.logging.ILogger;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
    IInstructorDao instructorDao;
    ILogger[] loggers;

    public InstructorManager(IInstructorDao instructorDao,  ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers=loggers;
    }
    public  void inctructorAdd(Instructor instructor){
        System.out.println("İnstructor eklendi");
    }
}
