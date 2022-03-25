package com.company;

import java.util.Scanner;

/*
* Artiukh Mihail, #2
*/
public class Main {
    /*
    * Дано вещественное число x. Вычислить .*/
    public static int Factorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * Factorial(f - 1);
        }
    }
    private static void task27(){
        System.out.println("task27 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextInt();
        double otv=0;

    for (int i=1;i<15;i=  (i+2)){
        otv = (otv + Math.pow(x,i)/Factorial(i));

    }
        System.out.println("otvet = "+otv);
        System.out.println();
    }
    /*
    * Найти сумму –12 + 22 – 32 + 42 + ... + 102. Условную инструкцию
    * не использовать.
     */
    private static void task52(){
    System.out.println("task52 ");
    double otv=0;
    int b = 1;
    for (byte i = 1;i<11;i++ ){
        b = -b;
        otv = otv + Math.pow(i,2)*b;
    }
        System.out.println("otvet = "+otv);
        System.out.println();
    }

    /*
    *Около стены наклонно стоит палка длиной 4,5 м. Нижний конец
    * находится на расстоянии 3 м от стены. Он начинает скользить
    * в плоскости, перпендикулярной стене. Определить значения угла
    * между палкой и полом (в градусах) через каждые 0,2 м с момента
    *  начала скольжения до падения палки.
     */
    private static void task77(){
        System.out.println("task77 ");
        double x;

        for (double i = 3; i<4.5; i=i+0.2){
            x = i/4.5;
            System.out.println(Math.toDegrees(Math.acos(x)));
        }
        System.out.println();
    }

    /*
    В области N районов. Известны количество жителей (в тыс. чел.)
    и площадь (в км2) каждого района. Определить среднюю плотность
    населения по области в целом.
     */
     private static void task102(){
     System.out.println("task102 ");
     double otv=0;
     Scanner scanner = new Scanner(System.in);
        System.out.print("колво районов = ");
        int n = scanner.nextInt();
         for (int i = 0; i < n; i++) {
             System.out.print("колво жителей = ");
             int hum = scanner.nextInt();
             System.out.print("площадь = ");
             int s = scanner.nextInt();
             otv += (float)(hum / s);
         }
         System.out.println("средняя плотность населения по области в целом "
         + otv/n);

         System.out.println();
    }

    /*
    Задача Ал-Хорезми (780–850 гг.). Разложить число 10 на 2 слагаемых,
     сумма квадратов которых равна 58.
     */
    private static void task127(){
        System.out.println("task127 ");
        for (int i = 0; i <10 ; i++) {
            for (int j = 10-i; j <10 ; j++) {
                if (i*i+j*j==58){
                    System.out.println(i+" + "+j);
                    return;
                }

            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
	task27();
    task52();
    task77();
    task102();
    task127();
    }
}
