package nastya;
import java.util.Scanner;
import nastya.prost;
/** 
 * ������� �����. ������������ ��� ������ ������� ������ � �������� ������� � ������ ����������������� ����������.
 * @author �����
 * @version 1.0
*/



public class Main {
	/** ���� ��� �������� ���������������� ���������� �������� ����� */
	 private static int h = 0;
	  /** ���� ��� �������� ����������� ������� */
	 private static int g = 0;
	 /** ���� ��� �������� ���������� �������� ����� ����� ���������� */
	 private static int f = 0;
	 /** ���� ��� �������� ��������� ����� */
	 private static int d = 0; 
	 /** ���� ��� �������� ������ ��������, ��������� �������������  */
	 private static int age = 0;
	 	 
	/** ������� �������. � ��� ���������� ����� ���� � ����� ������� ������ prost.
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
        System.out.println("1 - ��������� ������� ����� ");
        System.out.println("2  - ������ ������� ����� ��������� ����������� ");
        System.out.println("3  - ��������� ������� ����� ����� ���������� ");
        System.out.println("4  - �������� �� ��������� ����� ������� ");
        do {
            age = new Scanner(System.in).nextInt();
            switch (age) {
                case 1:
                    h = prost.getRandomPrime();
                    System.out.println("��������� ������� ����� - " + h);
                    break;
                case 2:
                    g = (int) (4 + (Math.random() * 10));
                    System.out.println("����������� - " + g);
                    System.out.println("������ - ");
                    int arr[] = prost.getRandomArray(g);
                    for (int d = 0; d < g; d++) {
                        System.out.println(arr[d]);
                    }
                    break;
                case 3:
                    h = prost.getRandomPrime();
                    System.out.println("�������� ������� ����� - " + h);
                    f = prost.getNext(h);
                    System.out.println("��������� ������� ����� - " + f);
                    break;
                case 4:
                    d = (int) (4 + (Math.random() * 100));
                    System.out.println("�������� ����� - " + d);
                    pr = prost.isPrime(d);
                    if (pr == true) {
                        System.out.println("����� �������");
                    } else {
                        System.out.println("�����  �� �������");
                    }
                    break;

                default:
                    System.out.println("������� ���������� �����");
            }
        } while (true);
    }
    
}

