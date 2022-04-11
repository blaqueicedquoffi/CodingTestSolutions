package com.collection.userpermission;

import java.util.ArrayList;
import java.util.List;

public class Test {
}

class Permission {

    public Permission() {}

    public Permission(String role, String name, boolean active) {

        this.role = role;

        this.name = name;

        this.active = active;

    }



    public String role;

    public String name;

    public boolean active;

}



class User {

    public User() {}

    public User(int id, String name, List<String> roles) {

        this.id = id;

        this.name = name;

        this.roles = roles;

    }

    public int id;

    public String name;

    public List<String> roles;

}



class Authorization {

    public List<Permission> permissions;

    public List<User> users;



    public Authorization(List<Permission> permissions, List<User> users) {

        this.permissions = permissions;

        this.users = users;

    }



    public ArrayList<String> listPermissions(int userId) {
        List<String> allowedPersmission=new ArrayList<>();
        for ( User user:users
             ) {
            if(user.id==userId){

                for (String rol:user.roles
                     ) {
                    for (Permission per:permissions
                         ) {
                        if(per.role.equals(rol)&&per.active)
                        {
                            allowedPersmission.add(per.name);
                        }
                    }
                }
            }
        }



        return (ArrayList<String>) allowedPersmission;

    }



    public boolean checkPermitted(String permissionName, int userId) {

        // TODO: fill this out!

        for ( User user:users
        ) {
            if(user.id==userId){

                for (String rol:user.roles
                ) {
                    for (Permission per:permissions
                    ) {
                        if(per.role.equals(rol)&&per.active&&permissionName.equals(per.name))
                        {
                           return true;
                        }
                    }
                }
            }
        }
        return false;

    }

}