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
public class Hospitality extends Faculty{
    
    public Hospitality(String name, int buildingNumber, int numStudents) {
        super(name, buildingNumber);
        this.numStudents = numStudents;
    }
}
