package org.leetcode.Readers;

import java.io.*;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the val : ");

        /*Reader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        int num = bf.read();
        System.out.println("Entered num :"+num);*/

       /* Scanner sc = new Scanner(new InputStreamReader(System.in));
        String str  = String.valueOf(sc.next());
        System.out.println("Val : "+str);*/

        /*Scanner sc2 = new Scanner(new File("C:\\Users\\srathnayak\\IdeaProjects\\leetCode\\src\\main\\java\\org\\leetcode\\BuyStocks.java"));
        System.out.println(sc2.toString());;

        while (sc2.hasNextLine()) {
            String line = sc2.nextLine();
            System.out.println(line);
        }*/
        String line = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
           line =  br.readLine();
        }

        System.out.println(line);


    }
}
