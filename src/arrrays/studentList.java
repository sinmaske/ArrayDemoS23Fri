/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrrays;

/**
 *
 * @author 9149m
 */
public class studentList {
    public static void main (String args[]) {
    //comment added at 1:22pm 19 May
    //comment added at 1:27pm 19 May
    Student s1 = new Student("s1","maskeen");
    
    
    Student s2 =new Student("s2","abc");
    
    
    
    Student[] myArray = new Student[3];
    
    
    myArray[0] = s1;
    myArray[1] = s2;
    myArray[2] = new Student("s3","def");
    
    for (int i=0; i<myArray.length; i++) {
        System.out.println(myArray[i].getsNAme());
    }
    }
}
