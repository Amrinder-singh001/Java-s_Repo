// ENCAPSULATION - 2
package CLASSES_OBJECTS;

class Student {

    private int marks;

    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    int getMarks() {
        return marks;
    }
}

class Encapt2 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setMarks(85);

        System.out.println("Marks = " + s.getMarks());
    }
}