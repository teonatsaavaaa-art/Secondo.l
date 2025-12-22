package org.example;


public class Main {
    static void main() {
        int[] scores = {60, 65, 70, 76, 88, 95};

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 75) {
                System.out.println(scores[i]);
            }
        }
    }
}


