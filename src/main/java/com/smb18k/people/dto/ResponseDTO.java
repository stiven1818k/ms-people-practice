package com.smb18k.people.dto;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class ResponseDTO<T>{

    public T data;
    public String message;



}
