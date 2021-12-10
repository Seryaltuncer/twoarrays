
package TwoArrays;

import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        int [][]A = new int[3][3];
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0; i<A.length; i++)
            for(int j=0; j<A[i].length; j++){
                System.out.print("Enter A[" + i + 
                        "]["+j+"]: ");
                A[i][j] = keyboard.nextInt();
                System.out.println();
            }
        
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int j=0; j<A[0].length; j++)
            System.out.print(A[0][j] + " ");
        
        System.out.println();
        
        
        for(int i=0; i<A.length; i++)
            System.out.println(A[i][0]);
        
        
        for(int i=0; i<A.length; i++)
            System.out.println(A[i][i]);
        
        for(int i=A.length-1; i>=0; i--){
            System.out.println(A[i][A.length-1 - i]);
        }

    }
    
    
    
}
