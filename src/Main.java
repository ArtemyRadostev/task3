import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String wrd = scn.next();
        int c = wrd.length() - 1;
        int index1 = wrd.lastIndexOf("а");
        int index2 = wrd.lastIndexOf("я");
        int index3 = wrd.lastIndexOf("и");
        if (index1 == c || index2 == c || index3 == c) {
            System.out.println("Приветик!"); }
        else { System.out.println("Здарова!"); }
        }
    }