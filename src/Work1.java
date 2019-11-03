import java.util.Scanner;
public class Work1 {
    public static int x,y,r;

    public static void func1() {
        if (Math.abs(x) <= r && Math.abs(y) <= r) {
            System.out.println("yes,");
        } else {
            System.out.println("no,");
        }
    }
        public static void func2(){
            if (x == 0) {
                if (y>0)
                    System.out.println("пересечение I,II четверти");
                if (y<0)
                    System.out.println("пересечение III,IV четверти");
                if (y==0)
                    System.out.println("Точка находися в начале координат");}
            if (y == 0) {
                if (x>0)
                    System.out.println("пересечение I,IV четверти");
                if (x<0)
                    System.out.println("пересечение II,III четверти");}

        }


        public static void func3() {
            if (x > 0 && y > 0) {
                System.out.println("I");
            } else if (x < 0 && y > 0) {
                System.out.println("II");
            } else if (x < 0 && y < 0) {
                System.out.println("III");
            }
            else if (x > 0 && y < 0) {
                System.out.println("IV");
            }
            }

    public static void main(String[] args) {
        Scanner inputFigure = new Scanner(System.in);
        System.out.print("Введите радиус R=");
        int r = inputFigure.nextInt();
        System.out.print("Введите координату х=");
        int x = inputFigure.nextInt();
        System.out.print("Введите координату y=");
        int y = inputFigure.nextInt();
        func1();
        func2();
        func3();
    }
}
