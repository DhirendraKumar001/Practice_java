

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Page implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        Page p1 = new Page();
        p1.print();
        p1.show();
    }
}
