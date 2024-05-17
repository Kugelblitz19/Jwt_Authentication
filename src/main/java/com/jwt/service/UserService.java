package com.jwt.service;

import com.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User>users=new ArrayList<>();

    public UserService() {
        users.add(new User(UUID.randomUUID().toString(),"Kunal Priyadarshi","Kunal123priya@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Bibhu Priyadarshi","bibhu@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(),"Rahul Tiwari","tiwarirahul@gmail.com"));
    }
    public List<User>getUsers(){
        return this.users;
    }
}
