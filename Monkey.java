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
public class Monkey extends Animal implements Omnivorous{
    private double propVegetable = 0.05;
    private double propMeat = 0.07;

    public Monkey(double weight, String name) {
        super(weight, name);
    }
    @Override
    public double needVegetable() {
        return super.getWeight() * this.propVegetable;
    }

    @Override
    public double needMeat() {
        return super.getWeight() * this.propMeat;
    }
    
}
