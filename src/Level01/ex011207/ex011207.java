package Level01.ex011207;

public class ex011207 {
    public static void main(String[] args) {
        String name = "Rome";
        int count = name.length();
        System.out.println(count);
        System.out.println();

        count = "".length();
        System.out.println(count);
        System.out.println();

        name = "Rom";
        count = (name + 12).length();
        System.out.println(count);
        System.out.println();
    }

}
