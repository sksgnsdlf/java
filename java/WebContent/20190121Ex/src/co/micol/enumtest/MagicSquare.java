package co.micol.enumtest;

import java.io.IOException;

public class MagicSquare {
        public static void main(String[] args) throws IOException{
                int square[][];
                int val = 1;
                int n = 0;
                int row = 0;    
                int col = 0;    
               
                System.out.print("홀수 숫자만 입력 :");
                n = System.in.read()-48;
               
                col = n/2; //절반까지
                square =  new int[n][n]; //배열의 크기             
                while(val <= n*n){ //n의 제곱만큼 실행
                        square[row][col] = val;                 
                        if(val % n == 0){ //짝수일때
                                row++;	  //row가 증가
                        }else{		  	  //아닐때는
                                row--; 	  //row는 감소
                                col++;	  //col은 증가
                        }                   
                        if(row < 0)
                                row = n-1;
                        if(row >= n)
                                row = 0;
                        if(col < 0)
                                col = n-1;
                        if(col >= n)
                                col = 0;
                        val++;
                }            
                for(int i = 0; i<n; i++){
                        for(int j = 0; j<n; j++){
                                System.out.print(square[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}
