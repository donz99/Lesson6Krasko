package Krasko.Lesson6;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
        //1.4, . . . , 2 кг конфет.

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите цену за 1 кг конфет ");
        double price = in.nextInt();
        for (double weight = 1.2; weight<2.1; weight = weight + 0.2){
            System.out.println(Math.round(weight*10)/10.0 + " кг стоит " + Math.round(price*weight*10)/10.0);
        }*/

        //For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
        //        //1.4, . . . , 2 кг конфет.

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите цену за 1 кг конфет ");
        double price = in.nextDouble();
        for (double weight = 1.2; weight<2.1; weight = weight + 0.2){
            System.out.println(weight + " кг стоит " + price*weight);
        }*/

        //For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
        //от A до B включительно.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа, первое меньше второго ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i<=b; i++){
            sum = sum + 1;
        }
        System.out.println("Сумма = " + sum);*/

        //For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
        //чисел от A до B включительно

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа, первое меньше второго ");
        int a = in.nextInt();
        int b = in.nextInt();
        int pr = 1;
        for (int i = a; i<=b; i++){
            pr = pr * i;
        }
        System.out.println("Произведение = " + pr);*/


        // For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
        //чисел от A до B включительно.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа, первое меньше второго ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i<=b; i++){
            sum = sum + i*i;
        }
        System.out.println("Сумму квадратов = " + sum);*/

        //For10. Дано целое число N (> 0). Найти сумму
        //1 + 1/2 + 1/3 + . . . + 1/N

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum + 1.0/i;
        }
        System.out.println("сумма 1/1 + 1/2 + 1/3 + . . . + 1/N " + sum);*/

        //For11. Дано целое число N (> 0). Найти сумму
        //N
        //2 + (N + 1)2 + (N + 2)2 + . . . + (2·N)
        //2
        //(целое число) (N+i)^2   (операция возведения в квадрат Math.pow(N+i,2) -> double (вещественное)

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            sum = sum + (n+i)*(n+i) ;
        }
        System.out.println("" + sum);*/

        //Series1◦
        //. Даны десять вещественных чисел. Найти их сумму.

        /*Scanner in = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i<=10; i++){
            double x = in.nextInt();
            sum = sum + x;
        }
        System.out.println("Сумма " + sum);*/

        //Series2. Даны десять вещественных чисел. Найти их произведение

        /*Scanner in = new Scanner(System.in);
        double pr = 1;
        for (int i = 1; i<=10; i++){
            double x = in.nextInt();
            pr = pr*x;
        }
        System.out.println("Произведение " + pr);*/

        //Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.

        /*Scanner in = new Scanner(System.in);
        double pr = 1;
        for (int i = 1; i<=5; i++){
            double x = in.nextInt();
            pr = (pr+x)/2;
        }
        System.out.println("Среднее арефметическое " + pr);*/

        //Series4. Дано целое число N и набор из N вещественных чисел. Вывести
        //сумму и произведение чисел из данного набора

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double sum = 0;
        double pr =  1;
        for (int i = 1; i<=n; i++){
            double x = in.nextInt();
            sum = sum + x;
            pr = pr * x;
        }
        System.out.println("Сумма чисел из данного набора " + sum);
        System.out.println("Произведение чисел из данного набора " + pr);*/

        //Series5. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке целые части всех чисел из данного
        //набора (как вещественные числа с нулевой дробной частью), а также
        //сумму всех целых частей.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i<=n; i++){
            double x = in.nextDouble();
            System.out.println("Целая часть: " + (int)x);
            sum = sum + (int)x;
        }
        System.out.println("Сумма чисел из данного набора " + sum);*/

        //Series6. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке дробные части всех чисел из данного набора (как вещественные числа с нулевой целой частью), а также
        //произведение всех дробных частей.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double pr = 1;
        for (int i = 1; i<=n; i++){
            double x = in.nextDouble();
            double drobn = x - (int)x;
            System.out.println("Дробная часть: " + drobn);
            pr = pr * drobn;
        }
        System.out.println("Произведение всех дробных частей: " + pr);*/

        //Series7. Дано целое число N и набор из N вещественных чисел. Вывести в
        //том же порядке округленные значения всех чисел из данного набора (как
        //целые числа), а также сумму всех округленных значений.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double summ = 0;
        for (int i = 1; i<=n; i++){
            double x = in.nextDouble();
            double okr = Math.round(x);
            System.out.println("Округленное значение: " + okr);
            summ = summ + okr;
        }
        System.out.println("Сумма: " + summ);*/

        //Series8. Дано целое число N и набор из N целых чисел. Вывести в том же
        //порядке все четные числа из данного набора и количество K таких чисел.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double summ = 0;
        for (int i = 1; i<=n; i++){
            double x = in.nextDouble();
            double okr = Math.round(x);
            System.out.println("Округленное значение: " + okr);
            K = summ + okr;
        }
        System.out.println(": " + summ);















    }
}
