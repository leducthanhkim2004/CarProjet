package customer;

public class Customer extends User{
    private String LicenseNumber;
    public Customer(User user,String LicenseNumber){
        super(user.getUserID(), user.getUserName(),user.getRole(),user.getContactNumber(),user.getStatus());
        this.LicenseNumber=LicenseNumber;
    
    }
    public String getLicense(){
        return LicenseNumber;
    }
   
    @Override
    public String toString() {
        return "Customer{" +
                "LicenseNumber='" + LicenseNumber + '\'' +
                ", User_ID=" + getUserID() +
                ", User_Name='" + getUserName() + '\'' +
                ", Role='" + getRole() + '\'' +
                ", Contact_Number=" + String.valueOf(getContactNumber()) +
                ", Status='" + getStatus() + '\'' +
                '}';
    }
}
