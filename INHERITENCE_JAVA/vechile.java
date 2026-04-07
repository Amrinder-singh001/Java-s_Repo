  class cat {
    void Throughdog(){
        System.out.println("cat is eaten by dog");
    }
}
  class dog extends cat {
    void Throughrichard(){
        System.out.println("dog is eaten by ");   
    }
  }
   
  class richard extends dog{
    void Throughleapod(){
        System.out.println("richard is eaten by leapod");
    }
  }

  class leapod extends richard{
    void Througheagle(){
        System.out.println("leapod is eaten by eagle");
    }
  }
public class vechile{
    public static void main(String[] args) {
        leapod lp = new leapod();
        
        lp.Througheagle();
        lp.Throughleapod();
        lp.Throughrichard();
        lp.Throughdog();

    }
}