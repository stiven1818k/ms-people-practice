package com.smb18k.people.service;

import com.smb18k.people.dto.ResponseDTO;
import com.smb18k.people.model.People;
import com.smb18k.people.repository.PeopleRepository;
import com.smb18k.people.utils.CustomExeptions;
import com.smb18k.people.utils.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IRegisterService implements RegisterService {

    @Autowired
    PeopleRepository peopleRepository;


    @Override
    public void saveUser(People people) {
        if (this.findByEmail(people.getCorreo()) == null){
            Validator val = new Validator();
            val.validators(people);
            peopleRepository.save(people);
        }else {
            throw  new CustomExeptions("Usuario ya existe");
        }


    }

    @Override
    public People findByEmail(String email) {
        Validator val = new Validator();
        val.emailValidator(email);
        return peopleRepository.findByEmail(email);
    }
}
