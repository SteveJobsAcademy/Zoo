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
public class Lion extends Animal implements Carnivorous{
    private double prop = 0.1;
    
    public Lion(double weight, String name) {
        super(weight, name);
    }
    
    @Override
    public double needMeat(){
        return super.getWeight() * this.prop;
    }
    
}
