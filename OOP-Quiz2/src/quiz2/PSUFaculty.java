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
public class PSUFaculty extends Faculty{
    
    protected PSUCampus campus;
    
    public PSUFaculty(String name, int buildingNumber, PSUCampus campus) {
        super(name, buildingNumber);
        this.campus = campus;
    }
    
    @Override
    public void printInfo() {
        if(campus == PSUCampus.SONGKLA) {
            System.out.println("Main Campus: "+name);
        } else {
            System.out.println("Non-Main Campus: "+name);
        }
    }
    
    public boolean nameContainsPSU() {
        return name.contains("PSU");
    }
    
    public String convertSongklaToPhuket() {
        return name.replace("Songkla", "Phuket");
    }
}
