/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.Objects;

/**
 *
 * @author archimede
 */
public class Animal {
    private double weight;
    private String name;

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
       Animal a = (Animal) obj;
       return this.name.equals(a.getName()) && this.getClass().getSimpleName().equals(a.getClass().getSimpleName());
    }
    
    
    
}
