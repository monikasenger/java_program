package thursday_project;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,col,row;
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of column");
col=sc.nextInt();
System.out.println("enter the size of row");
row=sc.nextInt();
System.out.println("enter matrix value");
int arr[][]= new int[row][col];
for(i=0; i<row; i++)
{
	for(j=0; j<col; j++)
	{
		arr[i][j] = sc.nextInt();
	}
System.out.println();
}
int tran[][]= new int[row][col];
if(row==col) {
for(i=0;i<row;i++)
{
for(j=0;i<col;j++)
	{
	tran[i][j]= arr[j][i];
	}
	}
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		System.out.print(tran[i][j]);
	}
	System.out.println();
}
}else
	for(i=0;i<col;i++)
	{
		for(j=0;j<row;j++)
		{
			System.out.print(arr[j][i]+" ");	
		}	
		System.out.println();
	}
}}
