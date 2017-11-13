/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uemployee;

/**
 *
 * @author sohak9660
 */
public class Staff extends UEmployees {
    
   String jobTitle;
   
   public Staff (String name, double salary, String tittle){
    super(name, salary);
    jobTitle  = tittle;
}
public String title(){
       return jobTitle;
   }

}


