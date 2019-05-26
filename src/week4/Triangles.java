package week4;

public class Triangles {

    public void drawTriangle1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void drawTriangle2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void drawTriangle3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void drawTriangle4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 5 - i; j >= 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangles triangles = new Triangles();

        triangles.drawTriangle1();
        System.out.println();

        triangles.drawTriangle2();
        System.out.println();

        triangles.drawTriangle3();
        System.out.println();

        triangles.drawTriangle4();
    }
}