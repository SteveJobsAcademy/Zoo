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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lion lion = new Lion(110, "Simba");
        Lion lion2 = new Lion(130, "Mufasa");
        Zebra zebra = new Zebra(140, "Martin");
        Monkey m = new Monkey(30, "Abu");
        
        lion.equals(lion2);
        /* System.out.println("size:" + l.needMeat());
        System.out.println(l instanceof Lion);
        System.out.println(l.getClass().getSimpleName());
        System.out.println(l.getClass().getInterfaces()[0].getSimpleName());
        */
        
        Zoo zoo = new Zoo(5);
        zoo.addAnimal(lion);
        zoo.addAnimal(lion2);
        zoo.addAnimal(zebra);
        zoo.addAnimal(m);
        
        zoo.printInfo();
        
        System.out.println(zoo.removeAnimal("Mufasa", "Zebra"));
        
        zoo.printInfo();
        
        zoo.getEatingInfo();
        
        
    }
    
}
