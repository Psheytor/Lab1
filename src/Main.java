import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        File fp=new File("text.txt");
        int count=0, k=0;
        String simvol="";
        System.out.println("\tЗадание:\n В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять");
        //
        while (true) {
            System.out.println("Введите число k ");
            Scanner sc1 = new Scanner(System.in);
            try {
                k = sc1.nextInt();
                break;
            } catch (InputMismatchException fg) {
                System.out.println("Вы ввели не число. ");
            }
        }
        while (true) {
            System.out.println("Введите символ ");
            Scanner sc2 = new Scanner(System.in);
            try {
                simvol = sc2.nextLine();
                break;
            } catch (InputMismatchException fg) {
                System.out.println("Вы ввели не символ. ");
            }
        }
        //
        try(FileReader reader = new FileReader("text.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                if(count==k) {
                    System.out.print(simvol);
                    count=0;
                }
                else
                    System.out.print((char)c);
                count++;
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}