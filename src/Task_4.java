import java.util.Scanner;

//Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.

public class Task_4 {

    public static void main(String[] args) {


        int countWord = 0;

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String[] array = sc.nextLine().split(" +");
            countWord = countWord + array.length;
            break;
        }
        System.out.println("Количество слов = " + countWord);


    }
}
