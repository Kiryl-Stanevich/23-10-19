
public class Work1 {
    public static void main(String[] args) {

        int r = 5;
        int x = 2;
        int y = 1;

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
            }
        }
