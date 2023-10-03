package com.smb18k.people.utils;

import com.smb18k.people.dto.ResponseDTO;

public class Response {
    public static <T> ResponseDTO<T> success(T data){
        return new ResponseDTO<>(data, "Operacion existosa");
    }

    public static <T> ResponseDTO<T> error(T data){
        return new ResponseDTO<>(data, "Existe un error en la peticion");
    }
}
