Program

import java.util.*;

public class Matries
{
  public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the size of Matrix(n*n) :");
		int n = obj.nextInt();
		int arr1[][] = new int [n][n];
		int arr2[][] = new int [n][n];
		
		int arr3[][] = new int [n][n];
		
		System.out.println("Enter the Elements of 1st Matrix");
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				arr1[i][j] = obj.nextInt();
			}	
		}
		
		System.out.println("Enter the Elements of 2nd Matrix");
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				arr2[i][j] = obj.nextInt();
			}	
		}
		
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
			
		}
				
		System.out.println("------------------------------");
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("------------------------------");
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				arr3[i][j]=arr1[i][j] + arr2[i][j] ;
			}
		
		}
		System.out.println("Matrices SUM is");
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
