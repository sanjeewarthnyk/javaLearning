package org.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int val = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter value: ");
            val = Integer.valueOf(br.readLine());
            if(val>10){
                throw new ArithmeticException("Number should be less than 10");
            }if(val<5){
                throw new MyException("Errrrrrrr");
            }
            System.out.println("Value is :"+val);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
