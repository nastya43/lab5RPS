package nastya;
import java.util.Arrays;
/** 
 * Класс для работы с простыми числами.
 * @author Настя
 * @version 1.0
*/
public class prost {
	/** Поле для возврата сгенерированного случайного простого числа */
	private static int l;
	/** Поле для возврата сгенерированного массива простого числа */
	private static int[] randomArray;
	/** Поле для возврата следующего простого числа после случайного */
	private static int m ;
	
	/** Функция проверки: является ли число простым.
	 * @param arg0 Число, которое нужно проверить.
    *  @return Да - если число простое, нет - если не простое. */
	static boolean isPrime(int arg0) {
        if (arg0 == 1)
            return false;
        for (int d = 2; d * d <= arg0; d++) {
            if (arg0 % d == 0)
                return false;
        }
        return true;
    }
	
	/** Функция генерации простого числа.
	    *  @return Случайное ростое чисело. */
    public static int getRandomPrime() {
        l = 0;
        boolean k = false;
        do {
            l = (int) (2 + (Math.random() * 10000000));
            k = isPrime(l);
        }while (!k);
        
        return l;
    }

    /** Функция генерации массива простых чисел размерности length.
     	* @param length Размерность массива.
	    *  @return Массив простых чисел. */
    public static int[] getRandomArray(int length) {
        randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = getRandomPrime();
        }
        Arrays.sort(randomArray);
        return randomArray;
    }
    /** Функция для нахождения следующего простого числа после prime.
     * @param prime Простое число.
	    *  @return Простое число. */
   static int getNext(int prime) {
        boolean k = false;
        m = 0;
        for (int d = 1; !k; d++) {
            m = prime + d;
            k = isPrime(m);
        }
        return m;
    }

}
