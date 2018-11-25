package nastya;
import java.util.Scanner;
import nastya.prost;
/** 
 * Главный класс. Предназначен для вызова функций работы с простыми числами и вывода пользовательского интерфейса.
 * @author Настя
 * @version 1.0
*/



public class Main {
	/** Поле для хранения сгенерированного случайного простого числа */
	 private static int h = 0;
	  /** Поле для хранения размерности массива */
	 private static int g = 0;
	 /** Поле для хранения следующего простого числа после случайного */
	 private static int f = 0;
	 /** Поле для хранения лучайного числа */
	 private static int d = 0; 
	 /** Поле для хранения номера операции, выбранной пользователем  */
	 private static int age = 0;
	 	 
	/** Главная функция. В ней реализован вывод меню и вызов функций класса prost.
	     **/

	 static int rtye(int prime) {
		    boolean k = false;
		 int   m = 0;
		    for (int d = 1; !k; d++) {
		        m = prime + d;
		        k = false;
		    }
		    return m;
		}
	 
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
    	boolean pr = false;
        System.out.println("1 - случайное простое число ");
        System.out.println("2  - массив простых чисел случайной размерности ");
        System.out.println("3  - следующее простое число после случайного ");
        System.out.println("4  - является ли случайное число простым ");
        do {
            age = new Scanner(System.in).nextInt();
            switch (age) {
                case 1:
                    h = prost.getRandomPrime();
                    System.out.println("Случайное простое число - " + h);
                    break;
                case 2:
                    g = (int) (4 + (Math.random() * 10));
                    System.out.println("Размерность - " + g);
                    System.out.println("Массив - ");
                    int arr[] = prost.getRandomArray(g);
                    for (int d = 0; d < g; d++) {
                        System.out.println(arr[d]);
                    }
                    break;
                case 3:
                    h = prost.getRandomPrime();
                    System.out.println("Сучайное простое число - " + h);
                    f = prost.getNext(h);
                    System.out.println("Следующее простое число - " + f);
                    break;
                case 4:
                    d = (int) (4 + (Math.random() * 100));
                    System.out.println("Сучайное число - " + d);
                    pr = prost.isPrime(d);
                    if (pr == true) {
                        System.out.println("Число простое");
                    } else {
                        System.out.println("Число  не простое");
                    }
                    break;

                default:
                    System.out.println("Введите корректное число");
            }
        } while (true);
    }
    
}

