/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Khuong Hung
 */
public class Students {
private String ID;
    private String studentName;
    private String semester;
    private String courseName;

    public Students() {

    }

    public Students(String ID, String studentName, String semester, String courseName) {
        this.ID = ID;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
