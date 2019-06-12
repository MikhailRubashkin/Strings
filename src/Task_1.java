
//Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
public class Task_1 {

    public static void main(String[] args) {


        String s = "Some text";
        int count = 100;
        for(int i = 0; i<100;i++){
            s+=i;
            System.out.println(s);
        }
        long ts = System.nanoTime();

        System.out.println(" ");

        StringBuilder s2 = new StringBuilder(110);
        int count2 = 100;
        s2.append("Some text");
        for(int i = 0;i<count2;i++){
            s2.append(i);
            System.out.println(s2);
        }
        long te =System.nanoTime();
        System.out.println( " elapsed time:" + (te - ts)/1e6 + "ms");

    }
}
