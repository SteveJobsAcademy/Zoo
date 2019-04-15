/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;

/**
 *
 * @author archimede
 */
public class Zoo {
    private int maxNumberOfAnimals;
    private ArrayList<Animal> animals;
    
    public Zoo(int maxNumberOfAnimals){
        this.maxNumberOfAnimals = maxNumberOfAnimals;
        this.animals = new ArrayList<>();
    }
    
    public boolean addAnimal(Animal a){
        if (this.animals.size() == this.maxNumberOfAnimals){
            return false;
        }
        this.animals.add(a);
        return true;
    }
    
    public boolean removeAnimal(String name, String type){
       for (int i = 0; i < animals.size(); i++) {
           Animal a = animals.get(i);
           if (name.equals(a.getName()) && type.equals(a.getClass().getSimpleName())){
              this.animals.remove(i);
              return true;
           }
       }
       return false;
    }
    
    public void printInfo() {
        for (int i = 0; i < animals.size(); i++) {
            // Animal a = animals.get(i);
            // System.out.println(a.getName() + " " + a.getClass().getSimpleName()); // animals[i]
            System.out.println(animals.get(i));
        }
    }
    
    public void getEatingInfo(){
        double meat = 0;
        double vegetable = 0;
        for (int i = 0; i < animals.size(); i++) {
            Animal a = animals.get(i);
            String interfaceName = a.getClass().getInterfaces()[0].getSimpleName();
            if ("Carnivorous".equals(interfaceName)){ //interfaceName == "Carnivorous"
                Carnivorous c = (Carnivorous) a;
                meat += c.needMeat();
                // meat += ((Carnivorous) a).needMeat();    
            } else if ("Herbivore".equals(interfaceName)){
                Herbivore h = (Herbivore) a;
                vegetable += h.needVegetable();
            } else if ("Omnivorous".equals(interfaceName)){
                Omnivorous o = (Omnivorous) a;
                meat += o.needMeat();
                vegetable += o.needVegetable();
            }
        }
        
        System.out.println("Vegetable needs: " + vegetable);
        System.out.println("Meat needs: " + meat);
    }
}
