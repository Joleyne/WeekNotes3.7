// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(close10(8,13));
        System.out.println(close10(13,8));
        System.out.println(close10(13,7));
    }
    static int close10(int a , int b){
        int differA = Math.abs(a-10);
        int differB = Math.abs(b-10);

        if (differA < differB){
            return a;
        }
        if (differB < differA){
            return b;
        }
        return 0;
    }
}