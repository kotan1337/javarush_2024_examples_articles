package Level01.article01.ex01;

/*
 Пример простой программы на Java
*/

public class SampleProgram
{
    public static void main (String [] args)
    {
        System.out.println("Hello, Java world!");
        // наш комментарий
    }

    /**
     * Метод возвращает максимальное значение
     * из трех переданных аргументов
     * @param a - первый параметр
     * @param b - второй параметр
     * @param c - третий параметр
     * @return - максимальный из параметров
     */
    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}