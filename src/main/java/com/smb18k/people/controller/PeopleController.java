package com.smb18k.people.controller;


import com.smb18k.people.dto.ResponseDTO;
import com.smb18k.people.model.People;
import com.smb18k.people.service.RegisterService;
import com.smb18k.people.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PeopleController {
    @Autowired
    RegisterService registerService;


    @RequestMapping(value ="/register", method = RequestMethod.POST)
    public ResponseEntity<ResponseDTO<String>> saveUser(@RequestBody People people){

            registerService.saveUser(people);
            ResponseDTO<String> res = Response.success("datos correctamente guardador");
            return new ResponseEntity<>(res, HttpStatus.OK);

    }

    @RequestMapping(value ="/getUser", method = RequestMethod.GET)
    public ResponseEntity<ResponseDTO<People>> saveUser(@RequestParam String email){


        ResponseDTO<People> res = Response.success(registerService.findByEmail(email));
        return new ResponseEntity<>(res, HttpStatus.OK);

    }

}
