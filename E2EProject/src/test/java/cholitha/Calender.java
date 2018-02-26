package cholitha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int [][] matrix = {
				{ 2, 3, 4},
				{ 5, 6, 7},
				{ 2, 3, 8}
				};
		
	
			for (int i = 0 ;i<matrix.length; i++)

		{
				
			for (int j = 0 ;j< matrix.length; j++)
				
			{	
				
				
				System.out.print( matrix[i][j] + " ");
			}
				 System.out.println();
				
				
		}	
		
			
			final int[][] matrix2 = {
					  { 1, 2, 3 },
					  { 4, 5, 6 },
					  { 7, 8, 9 }
					};

					for (int i = 0; i < matrix2.length; i++) {
					    for (int j = 0; j < matrix2[i].length; j++) {
					        System.out.print(matrix2[i][j] + " ");
					    }
					    System.out.println();
					}
								
			Date d =new Date();
			SimpleDateFormat sdf =new SimpleDateFormat("M/dd/yyyy");
			System.out.println(sdf.format(d));
			Calendar c = Calendar.getInstance();
			System.out.println(c.get(Calendar.DAY_OF_WEEK));
			System.out.println(c.get(Calendar.AM_PM));
			
			
			
	}
}

