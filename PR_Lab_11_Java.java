import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;
import myClasses.HelpClass;

public class PR_Lab_11_Java{
	final static int N = 7;
	final static int M = 3;
	
	public static void main(String[] args){
		/* Инициализация массива. */
		Building mB[] = new Building[5];
		for(int i = 0; i < 5; i++)
		{
			mB[i] = new Building(i);
		}
		
		/* Использование одномерных и двумерных массивов. */
		System.out.println("Использование одномерных и двумерных массивов:");
		Building[] array1 = new Building[N];
		for (int i = 0; i < N; i++)
		{
			array1[i] = new Building();
		}
		Building.array1Forming(array1, N);
		System.out.println("Длины сторон получившихся зданий одномерного массива:");
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
		System.out.println("Длины сторон получившихся зданий двумерного массива:");
		Building.array2Output(array2, N, M);
		/*................................................*/
	}
}
