package Inheritance;

public class Son extends Grandfather {
    public static void main(String[] args){
        Son s = new Son();
        s.city();
        s.country();
        System.out.println(s.i);
    }
    public void activites()
    {
        System.out.println("activities");
    }
}
