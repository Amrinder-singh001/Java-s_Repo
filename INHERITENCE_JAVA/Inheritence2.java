
class Livingbeings {
    void Brain(){
        System.out.println("Animals Have A Brain");
    }
}
  class Animal extends Livingbeings {
    void Eat(){
        System.out.println("Animal Can Eat Anything");   
    }
  }
   
  class Bird extends Animal{
    void Fly(){
        System.out.println("Bird Can Fly");
    }
  }

  class Parrot extends Bird{
    void Speak(){
        System.out.println("Parrot Can Speak");
    }
  }
public class Inheritence2 {
    public static void main(String[] args) {
       Parrot pc = new Parrot();
        
       pc.Speak();
       pc.Fly();
       pc.Eat();
       pc.Brain();
    } 
    
}
