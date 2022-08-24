package com.mycompany.hibernate.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    
    @Column(name = "model")
    public String model;
    
    @Column(name = "color")
    public String color;
    
    @Column(name = "user_id")
    public int user_id;
    
}
