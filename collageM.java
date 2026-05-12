class College {

    void collegeName() {
        System.out.println("Chandigarh University");
    }
}

class Department extends College {

    void deptName() {
        System.out.println("CSE Department");
    }
}

class Student extends Department {

    void studentName() {
        System.out.println("Amrinder");
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.collegeName();
        s.deptName();
        s.studentName();
    }
}