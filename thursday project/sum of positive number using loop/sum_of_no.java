package thursday_project;

import java.util.Scanner;

public class sum_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nenter the positive number");
		num=sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum = sum + i;
            
        }

        System.out.println("Sum = " + sum);
    }

	}

