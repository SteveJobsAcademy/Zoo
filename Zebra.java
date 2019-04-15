/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author archimede
 */
public class Zebra extends Animal implements Herbivore{
    public double prop = 0.2;
    
     public Zebra(double weight, String name) {
        super(weight, name);
    }

    @Override
    public double needVegetable() {
        return this.prop * super.getWeight();
    }
    
}
