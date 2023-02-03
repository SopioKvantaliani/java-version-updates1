package com.cydeo.review;

public class User {
    public String username;
    public String firstName;
    public String lastName;

    //public String role; Instead of this, we can use enum
    //List<String>roleList = "Admin", "Manager", "Employee"; Creating fixed roles this way, is not best practice. Instead we should use enum;


     public Role role; //enum

    public User(String username, String firstName, String lastName, Role role) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}

/*
=roles might be different which should be created initially in the application.
If no-one is able to change roles, it might be constant.
    -User Role
    -Admin Role
   It is better to create enum roles and declare there all roles.


 */
