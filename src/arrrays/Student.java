/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrrays;

/**
 *
 * @author 9149m
 */
public class Student {
    private String sId;
    private String sNAme;
    private String address;
    // comment added at 12:32pm
    // comment added for fetch and merge on my own
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String sId, String sNAme) {
        this.sId = sId;
        this.sNAme = sNAme;
    }

    
    
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsNAme() {
        return sNAme;
    }

    public void setsNAme(String sNAme) {
        this.sNAme = sNAme;
    }
    
    
}
