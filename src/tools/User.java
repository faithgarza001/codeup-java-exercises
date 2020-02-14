package tools;

/////*1. Create a class named `tools.User` that inherits from `Person`.*/
public class User extends Human {
    ////    /*Add a protected instance property named `admin` that is a boolean. This property represents whether an instance of this class is an admin user.*/
    protected boolean admin;

    ////
////    /* Write the constructor on `tools.User` that defines 3 parameters: the first name for the person, the last name and a boolean indicating whether or not that user is an administrator. The corresponding properties of the object
////should be set based on the arguments passed to the constructor.*/
    public User(String firstName, String lastName, boolean admin) {
        super(firstName, lastName);

         this.admin = admin;


    }

    ////
////    /* - Write an instance method on the `tools.User` class named `isAdmin` that returns
////      a boolean indicating whether or not the user is an administrator, based on
////      the `admin` property.*/
////
////
    public boolean isAdmin() {
        return admin;
    }

    public static void main(String[] args) {

    }
}
