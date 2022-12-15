package Matrix;

public class Matrix {
	public static void main(String args[]){  
		
	int a[][]={{10,30,40},{20,40,30},{30,40,50}};    
	int b[][]={{11,33,44},{22,44,33},{11,22,44}};    
	    
	
	int c[][]=new int[3][3];  
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	c[i][j]=a[i][j]+b[i][j];    
	System.out.print(c[i][j]+" ");    
	}    
	System.out.println();   
	}    
	}
}


