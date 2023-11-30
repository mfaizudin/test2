package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.User;

@Service
public class ContactService {

    public List<User> getAllContacts() {

        List<User> arrList = new ArrayList<>();

        User contact1 = new User("user00001", "A Sebastian A/L Anthony", "sebastian@hyped.com.my");
        User contact2 = new User("user00002", "Balu Govindasamy", "balugov@gmail.com");
        User contact3 = new User("user00003", "Chong How Kee", "chonghowkee@yahoo.com");
        User contact4 = new User("user00004", "Robert A/L Francis", "robert@hotmail.com");
        User contact5 = new User("user00005", "Teoh Min Kee", "teohminkee@inglab.com.my");

        arrList.add(contact1);
        arrList.add(contact2);
        arrList.add(contact3);
        arrList.add(contact4);
        arrList.add(contact5);

        return arrList;
    }   
}

