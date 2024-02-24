package Recursion;

public class RecursionIntro {
    public static void main(String[] args) {
        printName(5);
    }
    public static void printName(int n){
        if(n == 0) {
            return;
        }
        printName(n - 1);
        System.out.println("Name");
    }
}
