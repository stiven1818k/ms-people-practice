package com.smb18k.people.service;

import com.smb18k.people.model.People;

public interface RegisterService {
    public void saveUser(People people);
    public People findByEmail(String mail);
}
