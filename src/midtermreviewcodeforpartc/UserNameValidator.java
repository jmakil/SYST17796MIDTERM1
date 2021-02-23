/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author makil
 */
public class UserNameValidator extends User{
  String name;
  public static boolean valid;
    
public String name(User user){
    return name = user.getName();
}

public boolean isValidatedName(String name){
    return valid = !(name.isEmpty());
}

public static void main(String[] args) {
    if (valid == false){
        System.out.println("The name is Empty");
    }
     else {
           System.out.println("The name is not Empty");
    }
        
    }
}



