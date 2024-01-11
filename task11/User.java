package session_4.task11;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String email;
    private String password;

    private char permissions;

    public void createUser(Scanner scan){
        System.out.println("To create an user, type its email");
        String email = scan.nextLine();

        if (!isValidEmail(email)){
            System.out.println("invalid email, try again");
            return;
        }

        System.out.println("Now type the password");
        String password = scan.nextLine();
        System.out.println("Now the permissions of te user \n 0. client  \n 1. admin");
        char permissions = Integer.toString(scan.nextInt()).charAt(0);

        if (password.length()<4){
            return;
        }
        this.email=email;
        this.password=password;
        this.permissions=permissions;
    }

    public void editUser(Scanner scan){
        System.out.println("To modify an user, type its email");
        String email = scan.nextLine();
        if (!isValidEmail(email)){
            System.out.println("invalid email, try again");
            return;
        }
        System.out.println("Now type the password");
        String password = scan.nextLine();

        this.email=email;
        this.password=password;
    }


    public boolean validateLogin(String email, String password){
        if (email!=null && password!=null){
            return Objects.equals(email, this.email) && Objects.equals(password, this.password);
        }
        return false;
    }

    public boolean isValidEmail(String email){

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return  matcher.matches();
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", permissions=" + permissions +
                '}';
    }

    public User(){
        this.email="email@example.com";
        this.password="1234";
        this.permissions='C';
    }

    public User(String email, String password) {
        this.email=email;
        this.password=password;
        this.permissions='C';
    }

    public User(String email, String password, char permissions) {
        this.email = email;
        this.password = password;
        this.permissions = permissions;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getPermissions() {
        return permissions;
    }

    public void setPermissions(char permissions) {
        this.permissions = permissions;
    }
}
