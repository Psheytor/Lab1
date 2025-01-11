import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System. in );

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите позицию k:");
        int k = scanner.nextInt();

        System.out.println("Введите символ для замены:");
        char symbol = scanner.next().charAt(0);

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = replaceKthLetter(words[i], k, symbol);
        }

        String resultText = String.join(" ", words);

        System.out.println("Результат:");
        System.out.println(resultText);

        scanner.close();
    }

    private static String replaceKthLetter(String word, int k, char symbol) {
        if (k > 0 && k <= word.length()) {
            char[] chars = word.toCharArray();
            chars[k - 1] = symbol;
            return new String(chars);
        }
        return word;
    }

}
