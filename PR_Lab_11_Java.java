import java.util.Scanner;
import java.util.ArrayList;
import myClasses.Facade;
import myClasses.Building;
import myClasses.HelpClass;

public class PR_Lab_11_Java{
	public static void main(String[] args){
		/* Инициализация массива. */
		Building mB[] = new Building[5];
		for(int i = 0; i < 5; i++)
		{
			mB[i] = new Building(i);
		}
	}
}
