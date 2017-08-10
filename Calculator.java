/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.io.*;
public class Calculator 
{
    public static void main(String[] args)throws Exception 
    {
        int a,b,c=0;
        String str1,str2,str3;
        System.out.println("Enter First Digit: \n");
        BufferedReader bfr1;
        InputStreamReader isr1;
        isr1 = new InputStreamReader(System.in);
        bfr1 = new BufferedReader(isr1);
        str1 = bfr1.readLine();
        a=Integer.parseInt(str1);
        System.out.println("Enter Second Digit: \n");
        BufferedReader bfr2;
        InputStreamReader isr2;
        isr2 = new InputStreamReader(System.in);
        bfr2 = new BufferedReader(isr2);
        str2 = bfr1.readLine();
        b=Integer.parseInt(str2);
        System.out.println("Enter your choice: \n");
        System.out.println("1: Addition\n");
        System.out.println("2: Substraction\n");
        System.out.println("3: Multiplication\n");
        System.out.println("4: Division\n");
        BufferedReader bfr3;
        InputStreamReader isr3;
        isr3 = new InputStreamReader(System.in);
        bfr3 = new BufferedReader(isr2);
        str3 = bfr1.readLine();
        c=Integer.parseInt(str3);
        switch(c)
        {
            case 1:
                add();
                break;
            case 2:
                sub();
                break;
            case 3:
                mul();
                break;
            case 4:
                div();
                break;
            default:
                System.out.println("Wrong Choice\n");
        }
    }
    static void add(int a,int b)
    {
        int x = 0,y = 0;
        int d;
        d=x+y;
        System.out.println("= "+d);     
    }       
    static void sub(int a,int b)
    {
        int x = 0,y = 0;
        int d;
        d=x-y;
        System.out.println("= "+d);
    }
static void mul(int a,int b)
    {
        int x = 0,y = 0;
        int d;
        d=x*y;
        System.out.println("= "+d);
    }
static void div(int a,int b)
    {
        int x = 0,y = 0;
        float d;
        d=x+y;
        System.out.println("= "+d);
    }

            
    
            
    
}
