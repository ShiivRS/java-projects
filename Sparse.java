import java.util.Scanner;

class Sparse{
	public static void main(String[] args){
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int r= ss.nextInt();
		int a[][]=new int[r][r];
		for(int i=0;i<r;i++){
			System.out.print("No. of columns/elements in row "+(i+1)+" :");
			int n=ss.nextInt();
			System.out.print("Enter the elements: ");
			for(int k=0;k<n;k++){
				a[i][k]=ss.nextInt();
			}
		}
		System.out.println("The Sparse Matrix is :");
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println("The Jagged Matrix is : ");
		for(int i=0;i<r;i++){
			for(int j=0;j<r;j++){
				if(a[i][j]!=0)
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
