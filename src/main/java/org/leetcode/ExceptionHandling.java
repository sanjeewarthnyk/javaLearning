package org.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i=8;
        int j=0;
        int k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try{
            k = Integer.parseInt(br.readLine());
            //System.out.println("i/j"+i/j);
            //k = Integer.valueOf("qwe");
            System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println("Devide by zero");
        }catch(NumberFormatException e) {
            System.out.println("reachable?"+e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            System.out.println("I reach here");
        }
    }


}
