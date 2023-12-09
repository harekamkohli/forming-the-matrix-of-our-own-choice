
// Harekam Kohli 
// SBU ID- 115148763
// CSE-114
//kohli_harekam_Lab7_P1_ques1 

package lab_7;
import java.util.*;
public class lab7_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input= new Scanner(System.in);
		int r, c;
		System.out.print("Enter the number of rows needed:");
		r = input.nextInt();
		System.out.print("Enter the number of column needed:");
		c = input.nextInt(); 
		
		System.out.print("Enter the elements:");
		int[][] inp= new int[r][c];
		{
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				
				inp[i][j]= input.nextInt();
							
			}
		}
		}
		System.out.println("The array is:");
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				if (i<=j) {
					System.out.print(inp[i][j]);
				}
				else {
					System.out.print(" ");
				}
					}
			System.out.println();
				}
							}
		}
			

	

