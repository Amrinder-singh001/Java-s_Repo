package CLASSES_OBJECTS;

public class Student{

String name;
int rollno;

void SetName(String nm) {
name = nm; 
}

void SetRollNo(int rno) {
rollno = rno;
}

void DisplayInfo() {
System.out.println(name +" is student with Roll number "+rollno); 
}


public static void main(String[] args)
{

Student s1 = new Student();
Student s2 = new Student();

s1.SetName("John");
s2.SetName("Maria");
s1.SetRollNo(1002);
s2.SetRollNo(1005);
s1.DisplayInfo();
s2.DisplayInfo(); 

   }
}