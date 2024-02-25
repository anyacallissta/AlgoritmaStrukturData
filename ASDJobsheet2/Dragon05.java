package ASDJobsheet2;

import java.util.Scanner;

public class Dragon05 {

    int x, y, width, height;
    Scanner sc = new Scanner(System.in);
    void moveLeft() {
        x -= 1;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveRight() {
        x += 1;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void moveDown() {
        y += 1;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void recentPosition() {
        System.out.print("Posisimu sekarang : " + x + "," + y );
        System.out.println();
    }
    
    void detectCollision() {
        System.out.println("GAME OVER!");
        System.exit(0);
    }

    void loopingGame() { 
        while (x > 0 || x < width || y > 0 || y < height) {
        System.out.print("Pilih 'L' untuk ke kiri, 'R' untuk ke kanan, 'U' untuk naik, 'D' untuk turun : ");
        char pilih = sc.nextLine().charAt(0);
            switch (pilih) {
                case 'L':
                    moveLeft();
                    break;

                case 'R':
                    moveRight();
                    break;
            
                case 'U':
                    moveUp();
                    break;

                case 'D':
                    moveDown();
                    break;

                default:
                    break;
            }
        recentPosition();
        }
    }

    public Dragon05() {

    }

    public Dragon05(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
