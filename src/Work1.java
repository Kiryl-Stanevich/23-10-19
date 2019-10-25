import java.util.Scanner;
public class Work1 {
    public static void main(String[] args) {

        System.out.print ("Введите радиус R=");
        Scanner inputFigure = new Scanner (System.in);
        int r = inputFigure.nextInt ();
        System.out.print ("Введите координату х=");
        Scanner inputFigure1 = new Scanner (System.in);
        int x = inputFigure1.nextInt ();
        System.out.print ("Введите координату y=");
        Scanner inputFigure2 = new Scanner (System.in);
        int y = inputFigure2.nextInt ();

        if (Math.abs(x) <= r && Math.abs(y) <= r) {
            System.out.println("yes,");
        } else {
            System.out.println("no,");
        }
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
                else if (x == 0 && y == 0) {
            System.out.println("Точка находися в начале координат");
        }
                else if (x == 0) {
            System.out.println("Точка находится на оси 'x'");
        }
                    else if (y == 0)  {
                        System.out.println("Точка находится на оси 'y'");
                }
            }
        }
