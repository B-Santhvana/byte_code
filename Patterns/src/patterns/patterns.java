
package patterns;
/*
 ****
 ****
 ****
 ****
 */
public class patterns {

	public static void main(String[] args) {
		
		pattern1(4);
		pattern2(5);
		pattern3(5);
		pattern4(4);
		pattern5(4);
		pattern6(5);
		pattern7(5);
		pattern8(5);
		pattern9(5);
		pattern10(5);
		pattern11(5);
		pattern12(5);
		pattern13(5);
		
	}
	public static void pattern1(int n) {
		//loop for rows
		for (int row=1;row<=n;row++) {
			//no.of rows
			for(int col=1; col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("------------------");
	}
	
/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 */
	public static void pattern2(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
/*
 * * * * *
 * * * * 
 * * *
 * *
 * 
 */
	public static void pattern3(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=n-row+1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
	
/*
 odd no.cols
 
 * 
 * * *
 * * * * *
 * * * * * * *
 
 */
	public static void pattern4(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row*2-1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
	/*
	 even no.cols
	 
	 * *
	 * * * *
	 * * * * * *
	 * * * * * * * *
	 
	 */
	public static void pattern5(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row*2; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	
	}
/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */
	public static void pattern6(int n) {
		int num=1;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
		System.out.println("------------------");
	
	}
	
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
  
 */
	public static void pattern7(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(row +" ");	
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
/*
 
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 
 */
	public static void pattern8(int n) {
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
					System.out.print(col +" ");					
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
/*
 
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/
	public static void pattern9(int n) {
		for(int row=1; row<=n*2-1; row++) {
			if(row<=n) {
				for(int col=1; col<=row; col++) {
					System.out.print("* ");					
				}
			System.out.println();
			}
			
			else if(row>=n) {
				for(int col=1; col<=n*2-row; col++) {
					System.out.print("* ");	
				}
			System.out.println();
			}
			
			
		}
		System.out.println("------------------");
	}
	
/*
	    *
	  *   *
	*   *   *
  *   *   *   *
*   *   *   *    *

*/
	public static void pattern10(int n) {
		//no.of rows
		for (int row=1; row<=n; row++) {
			//no.of spaces
			for (int sp=1; sp<=n-row; sp++) {
				System.out.print(" ");
			}
			//no.of cols
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}	
			System.out.println();
		}
		System.out.println("------------------");
	}
/*
	 1
	1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
*/
	public static void pattern11(int n) {
		for (int row=1; row<=n; row++) {
			for (int sp=1; sp<=n-row; sp++) {
				System.out.print(" ");
			}
			for(int col=1; col<=row;col++) {
				System.out.print(col+" " );
			}
		System.out.println();
		}
		System.out.println("------------------");
	}
	
/*
	1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/
	public static void pattern12(int n) {
		for (int row=1; row<=n; row++) {
			for (int sp=1; sp<=n-row; sp++) {
				System.out.print(" ");
			}
			for(int col=1; col<=row;col++) {
				System.out.print(row+" " );
			}
		System.out.println();
		}
		System.out.println("------------------");
	}
/*
    *
   **
  ***
 ****
*****

*/
	
	public static void pattern13(int n) {
		//no.of rows- outer loop
		for(int row=1; row<=n;row++) {
			for(int sp=n-1;sp>=row;sp--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
/*
		*
	  *   *
	*   *   *
  *   *   *   *
*   *   *   *    *
  *   *   *   * 
    *   *   *
      *   *
        *
*/

}
