package CLASSES_OBJECTS;

public class class_code1 {
    public static void main(String[] args) {
      Pen p = new Pen();
      Student s = new Student();

       p.setcolor("Yellow");   // color has to be set.
       p.settip(5);

       p.color = "Blue";   //we also change the color after the color has to be set. 

       s.setname("Amrinder singh");
       s.setmarks(498);
    //    s.setcgpa(7.86);
       
       System.out.println(p.color);
       System.out.println(p.tip);
 
       System.out.println(s.name);
       System.out.println(s.totalmarks);
    //    System.out.println(s.cgpa);

    } 
 }
  
class Pen {
   String color;
   int tip;

   void setcolor(String newcolor){
    color = newcolor;
   }

   void settip(int newtip){
      tip = newtip;
   }
}

class Student {
    String name;
    int totalmarks;
    float cgpa;

    void setname(String newname){
       name = newname;
    }
   
    void setmarks(int newmarks){
       totalmarks = newmarks;
    }

    void setcgpa(float newcgpa){
       cgpa = newcgpa;
    }
}
