package com.smb18k.people.controller;



import com.smb18k.people.dto.ResponseDTO;
import com.smb18k.people.utils.CustomExeptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionController {
    @ExceptionHandler(CustomExeptions.class)
    public ResponseEntity<ResponseDTO<String>> invalidData(CustomExeptions e){
        ResponseDTO<String> res =  new ResponseDTO<>("", e.getMessage());
        return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> genericExeption(Exception e){
        return new ResponseEntity<>("Error en el servicio: " + e.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
