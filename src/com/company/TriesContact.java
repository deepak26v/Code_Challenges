package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriesContact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfOps = scanner.nextInt();
        List<String> contacts = new ArrayList<String>();
        int count = 0;

        for (int i = 0; i < numOfOps; i++) {
            String op = scanner.next();
            if(op != null && op.startsWith("add")) {
                contacts.add(op.split(" ")[1]);
            }

            }
        }
    }
}
