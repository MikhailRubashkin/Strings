
//Заменить все грустные смайлы :( в строке на весёлые :)

public class Task_2 {

    public static void main(String[] args) {



        String Str = new String(":(:(:(:(:(");

        System.out.print("Return Value " );
        System.out.println(Str.replace(')', ')'));

        System.out.print("Return Value " );
        System.out.println(Str.replace('(', ')'));
    }
}
