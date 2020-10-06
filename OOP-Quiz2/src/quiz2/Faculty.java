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

public class Faculty {

    protected String name;
    protected int numStudents;
    protected int buildingNumber;

    public Faculty(String name, int buildingNumber) {
            this.name = name;
            this.numStudents = 0;
            this.buildingNumber = buildingNumber;
    }

    public void admitStudents(int numStudents) {
            this.numStudents = this.numStudents + numStudents;
            System.out.println("Successfully admit "+numStudents+" students");
            printInfo();
    }

    public void printInfo() {
            System.out.println(this.name + " has " + this.numStudents + " students and is located at building "+this.buildingNumber);
    }
	
}
