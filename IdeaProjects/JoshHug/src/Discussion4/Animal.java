package Discussion4;

public class Animal {
 protected String name, noise;
 protected int age;

         public Animal(String name, int age) {
         this.name = name;
         this.age = age;
         this.noise = "Huh?";
         }

         public String makeNoise() {
         if (age < 5) {
             return noise.toUpperCase();
             } else {
             return noise;
             }
         }

         public void greet() {
         System.out.println("Animal " + name + " says: " + makeNoise());
         }
 }

 class Cat extends Animal {

     public Cat(String name, int age) {
         super(name, age);
         this.noise = "Meow!";
     }
     public void greet() {
         System.out.println("Cat " + name + " says: " + makeNoise());
     }
 }

