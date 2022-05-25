package com.kata.pp_2_3_1.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column
    private String lastname;
    @Column
    private String name;
    @Column
    private int age;

    public User() {
    }

    public User(String lastname, String name, int age) {
        this.lastname = lastname;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String listname) {
        this.lastname = listname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", listname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
