
//Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.

public class Task_3 {

    public static boolean func (String str, String word) {

        if (str.startsWith ("Строка")  & str.endsWith ("Строка") ){

            return true;

        }else return false;

    }



    public static void main(String[] args) {

        System.out.println(func("Строка начинается словом Строка", "Строка"));
    }
}
