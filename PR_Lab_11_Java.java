import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;
import myClasses.HelpClass;

public class PR_Lab_11_Java{
	final static int N = 7;
	final static int M = 3;
	
	public static void main(String[] args){
		/* ���樠������ ���ᨢ�. */
		Building mB[] = new Building[5];
		for(int i = 0; i < 5; i++)
		{
			mB[i] = new Building(i);
		}
		
		/* �ᯮ�짮����� ��������� � ��㬥��� ���ᨢ��. */
		System.out.println("�ᯮ�짮����� ��������� � ��㬥��� ���ᨢ��:");
		Building[] array1 = new Building[N];
		for (int i = 0; i < N; i++)
		{
			array1[i] = new Building();
		}
		Building.array1Forming(array1, N);
		System.out.println("����� ��஭ ����稢���� ������ ������୮�� ���ᨢ�:");
		Building.array1Output(array1, N);

		Building[][] array2 = new Building[N][M];
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				array2[i][j] = new Building();
			}
		}
		Building.array2Forming(array2, N, M);
		System.out.println("����� ��஭ ����稢���� ������ ��㬥୮�� ���ᨢ�:");
		Building.array2Output(array2, N, M);
		/*................................................*/
	}
}
