
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vViRuSs
 */
public class Odd {
   public static void main(String[] args) {
        System.out.println("input number :");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        
        for(int i=0;i<=number;i++){
            if((i%2)-1 == 0){
                System.out.println("result :" +i);
            }
        }
    }
}
