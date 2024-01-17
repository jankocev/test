package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer extends User{
    public String superSecretVal;
}
