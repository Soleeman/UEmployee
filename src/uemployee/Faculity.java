/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployee;

/**
 *Something
 * @author sohak9660
 */
public class Faculity extends UEmployees {
//String name;
//String salary;

String department;

public Faculity (String name, double salary, String dep){
    super(name, salary);
    department  = dep;
}
    
   public String department(){
       return department;
   }
}
