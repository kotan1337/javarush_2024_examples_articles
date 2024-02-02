package Level01.ex011205;

public class ex011205 {
    public static void main(String[] args) {
        String str = "123";
        int number1 = Integer.parseInt(str);
        System.out.println(number1);
        System.out.println();

        int number2 = Integer.parseInt("321");
        System.out.println(number2);
        System.out.println();

        int number3 = Integer.parseInt("321" + 0);
        System.out.println(number3);
        System.out.println();

        // Не скомпилируется: переменная типа int, а значение типа String
        // int number = "321";
    }
}
