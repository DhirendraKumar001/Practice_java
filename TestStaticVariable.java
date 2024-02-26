class Student{
    String name;
    int rollno;
    static String college = "MM(DU)";

    Student(String n, int r){
        name = n;
        rollno = r;
    }
        void display(){
            System.out.println(name+""+rollno+""+college);
    }

}

public class TestStaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Dhirendra Kumar", 11222846);
        s1.display();

        Student s2 = new Student("Krishna Kumar", 11222774);
        s2.display();
    }
}
