package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {

    private String name;
    private int age;


    @Override
    public boolean equals(Object obj) {
        Player p =(Player)obj;
        return p.getName() ==this.getName();
    }
}
