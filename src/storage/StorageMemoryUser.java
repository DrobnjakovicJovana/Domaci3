/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student1
 */
public class StorageMemoryUser {

    List<User> users;

    public StorageMemoryUser() {
        users = new ArrayList() {
            {
                add(new User(1l, "pera", "pera", "pera@gmail.com", "Pera", "Peric"));
                add(new User(2l, "laza", "laza", "laza@gmail.com", "Laza", "Lazic"));
            }
        };
    }

    public User getUser(String username, String password) throws Exception {
        for (User user : users) {
            if(user.getUsername().equals(username)){
            if(user.getPassword().equals(password))
                return user;
            throw new Exception("Wrong password");
            }
        }
        throw new Exception("User doesnt exist");
    }

}
