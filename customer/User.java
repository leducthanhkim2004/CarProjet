package customer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class  User {
    private  int User_ID;
    private  String User_Name;
    private String Role;
    private char [] Contact_Number = new char[10];
    private  String Status;
    public User(int User_id,String User_Name, String Role, String Contact_Number, String Status){
        this.User_ID= User_id;
        this.User_Name= User_Name;
        this.Role= Role;
        if(Contact_Number.length() ==10){
            char []Contact_user= Contact_Number.toCharArray();
            this.Contact_Number=Contact_user;
        }
        else{
            throw new IllegalArgumentException("Contact number should be in length 10");
        }
        this.Status= Status;    
    }
    // Getters for User_ID and User_Name if needed
    public int getUserID() {
        return User_ID;
    }
    public String getRole(){
        return Role;
    }
    public String getContactNumber(){
        return Contact_Number.toString();
    }
    public String getUserName() {
        return User_Name;
    }
    public String getStatus(){
        return Status;
    }
    public void AddRole(String Role){
        this.Role= Role;
    }
    public  boolean Is_In_User_List(List <String> UserNameList){
       for(String UserName: UserNameList){
            if(UserName.equals(this.User_Name)){
                return true;
            }
       }
        return false;
    }
    public void UpdateUser(User Another){
        if(Another != null){
            this.Contact_Number=Another.Contact_Number;
            this.Role =Another.Role;
            this.Contact_Number=Another.Contact_Number;
            this.Status= Another.Status;
        }
        else throw new IllegalArgumentException("There is no user to update");
    }
    
    
}