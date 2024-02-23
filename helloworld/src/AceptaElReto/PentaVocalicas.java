package AceptaElReto;

import java.util.Scanner;

public class PentaVocalicas {
	
	public static void main(String[] args)
	{
		String linia;
		Scanner s = new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		for(int i = 0; i<n;i++)
		{
			linia = s.nextLine();
			if(linia.contains("a")&&linia.contains("e")&&linia.contains("i")&&linia.contains("o")&&linia.contains("u"))
			{
				System.out.println("SI");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}

}
