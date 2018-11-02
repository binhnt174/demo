/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author MacBook Air
 */
public class NewClass {
    int id;
    String studentName;
       String bath;

    public NewClass(int id, String studentName, String bath) {
        this.id = id;
        this.studentName = studentName;
        this.bath = bath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
