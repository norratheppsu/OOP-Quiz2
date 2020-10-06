/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Oak
 */
public class Computing extends Faculty{
    
    public Computing(String name, int buildingNumber) {
        super(name, buildingNumber);
    }
    
    @Override
    public void admitStudents(int numStudents) {
        if(numStudents < 0) {
            System.out.println("ERROR: cannot admit a negative number of students");
        } else {
            super.admitStudents(numStudents);
        }
    }
}
