package entities;
//egitmen=instructor

public class Instructor {

    int instructorID;
    String instrutorName;

    public Instructor(int instructorID, String instrutorName) {
        this.instructorID = instructorID;
        this.instrutorName = instrutorName;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public String getInstrutorName() {
        return instrutorName;
    }

    public void setInstrutorName(String instrutorName) {
        this.instrutorName = instrutorName;
    }
}
