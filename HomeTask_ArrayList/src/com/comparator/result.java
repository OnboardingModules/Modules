package com.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class result {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i=0;i<n;i++)
        {
            player[i]=new Player(scanner.next(),scanner.nextInt());
        }
        scanner.close();

        Arrays.sort(player,checker);
        for(int i=0;i<player.length;i++)
        {
            System.out.printf("%s%s\n",player[i].name,player[i].score);
        }
    }
}
