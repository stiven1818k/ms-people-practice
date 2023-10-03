package com.smb18k.people.utils;

import com.smb18k.people.model.People;

public class Validator {
    public void validators(People people) {
        if (people != null) {
            if (people.getName() == null || people.getContraseña() == null || people.getCorreo() == null) {
                throw new CustomExeptions("Un campo esta vacio porfavor llenar");
            } else {
                    this.emailValidator(people.getCorreo());
                    if (people.getName().matches("[a-zA-Z ]{2,254}")) {
                        if (!people.getContraseña().matches("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$")) {
                            throw new CustomExeptions("La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula. NO puede tener otros símbolos.");
                        }
                    } else {
                        throw new CustomExeptions("El nombre no puede contener caracteres especiales");
                    }

            }
        } else {
            throw new CustomExeptions("El campo esta vacio porfavor llenar todos los datos");
        }
    }

    public void emailValidator(String  email){
        if (!email.matches("[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}")){
            throw new CustomExeptions("El correo electronico es invalido");
        }
    }


}
