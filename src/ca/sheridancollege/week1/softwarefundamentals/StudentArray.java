/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

import java.time.Clock;

/**
 * A class to create an array of students and print their names
 * @author Ali Hassan, 2019
 edit.......
 */
public class StudentArray 
{
    public static void main(String[] args)
    {
        System.out.print("Hello World");
        System.out.print("Another line");
        StudentDemo [] studentList = new StudentDemo[4];
        StudentDemo student1 = new StudentDemo("1", "Jim Halpern");
        studentList[0] = student1;
        studentList[1] = new StudentDemo("2", "Michael Scott");
        studentList[2] = new StudentDemo("3", "Pam Beasley");
        studentList[3] = new StudentDemo("4", "Dwight Schrute");
        
        
        for(int i=0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getName());
        }
    }
    
}
