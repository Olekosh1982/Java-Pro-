public class Main {
    public static void main(String[] args) {

        //        комментарий к коду - закомментировать строку Ctrl + D
        int myFirstVariable; // декларация (объявление) переменной
//        какие-то строки кода
        myFirstVariable = 25; // инициализация переменной (присвоение значения)

        int mySecondVariable = 2;

        System.out.println("my first variable: " + myFirstVariable); //выводим значение переменной на экран
        System.out.println(mySecondVariable); //выводим значение переменной на экран

        // объявляем и инициализируем переменную типа byte
        byte byteVariable = 25;

        // объявляем переменную типа short
        short shortVariable;
        shortVariable = 32000;

        // объявляем и инициализируем переменную типа long
        long longVariable = 222_222_000_000_000L;
        System.out.println(longVariable); //выводим значение переменной на экран

        // объявляем переменную типа double
        double doubleVar;
        doubleVar = 1.50; // присваиваем значение
        doubleVar = 1.5665; // присваиваем новое значение
        System.out.println(doubleVar); //выводим значение переменной doubleVar на экран

        //выровнять код Ctrl + Shift + L

    }

}
