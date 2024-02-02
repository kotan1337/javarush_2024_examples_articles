package Level01.ex011206;

public class StringExamples {
    public static void main(String[] args) {
        String a = String.valueOf(1);
        String b = String.valueOf(12.0D);
        String c = String.valueOf(123.4F);
        String d = String.valueOf(123456L);
        String s = String.valueOf(true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);

        /*
        Вывод:
        1
        12.0
        123.4
        123456
        true
         */
    }
}