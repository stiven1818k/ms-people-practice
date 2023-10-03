package com.smb18k.people.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "People")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String correo;
    private String contraseña;
}
