package nastya;
import java.util.Arrays;
/** 
 * ����� ��� ������ � �������� �������.
 * @author �����
 * @version 1.0
*/
public class prost {
	/** ���� ��� �������� ���������������� ���������� �������� ����� */
	private static int l;
	/** ���� ��� �������� ���������������� ������� �������� ����� */
	private static int[] randomArray;
	/** ���� ��� �������� ���������� �������� ����� ����� ���������� */
	private static int m ;
	
	/** ������� ��������: �������� �� ����� �������.
	 * @param arg0 �����, ������� ����� ���������.
    *  @return �� - ���� ����� �������, ��� - ���� �� �������. */
	static boolean isPrime(int arg0) {
        if (arg0 == 1)
            return false;
        for (int d = 2; d * d <= arg0; d++) {
            if (arg0 % d == 0)
                return false;
        }
        return true;
    }
	
	/** ������� ��������� �������� �����.
	    *  @return ��������� ������ ������. */
    public static int getRandomPrime() {
        l = 0;
        boolean k = false;
        do {
            l = (int) (2 + (Math.random() * 10000000));
            k = isPrime(l);
        }while (!k);
        
        return l;
    }

    /** ������� ��������� ������� ������� ����� ����������� length.
     	* @param length ����������� �������.
	    *  @return ������ ������� �����. */
    public static int[] getRandomArray(int length) {
        randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = getRandomPrime();
        }
        Arrays.sort(randomArray);
        return randomArray;
    }
    /** ������� ��� ���������� ���������� �������� ����� ����� prime.
     * @param prime ������� �����.
	    *  @return ������� �����. */
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
