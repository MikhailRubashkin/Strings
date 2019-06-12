

//Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.

public class Task_5 {

    public static void main(String[] args) {


        String word="Stoooppppd";
        StringBuilder res=new StringBuilder();
        char first=word.charAt(0);
        res.append(first);
        for (int i = 1; i < word.length(); i++) {
            char ch=word.charAt(i);
            if(ch!=first){
                res.append(ch);
            }
            first=ch;
        }
        System.out.println(res);
    }
}
