package pgs.javaDev;

import java.util.Scanner;

public class TextTree {
	
	private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int level;

        System.out.println("Podaj wysokoœæ choinki");
        while (true) {
            try {
                level = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Podaj liczbe ca³kowit¹");
                continue;
            }
            break;
        }

        System.out.println("Podaj kierunek [up, down, left, right]");
        String direction = sc.nextLine();

        switch (direction) {
            case "up":
                treeUp(level);
                break;
            case "down":
                treeDown(level);
                break;
            case "left":
                treeLeft(level);
                break;
            case "right":
                treeRight(level);
                break;
        }
    }
    
    private static void treeUp(int level) {
        for (int i = 0; i < level; i++) {
            String format = "%" + (level - i) + "c";
            System.out.printf(format, ' ');
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void treeDown(int level) {
        for (int i = level; i > 0; i--) {
            String format = "%" + (level - i + 1) + "c";
            System.out.printf(format, ' ');
            for (int j = i; j > 0 + 1; j--) {
                System.out.print('*');
            }
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void treeLeft(int level) {
        for (int i = 0; i < level; i++) {
            String format = "%" + (level - i) + "c";
            System.out.printf(format, ' ');
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = level - 1; i > 0; i--) {
            String format = "%" + (level - i + 1) + "c";
            System.out.printf(format, ' ');
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void treeRight(int level) {
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = level - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
