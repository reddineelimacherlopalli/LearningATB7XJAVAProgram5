package EX_190825;

public class Lab004 {
    public static void main(String[] args) {
        int n;
        for(n=1;n<=10;n++){
        System.out.println("Multiplication table of "+n);
        for(int i=1;i<=10;i++) {
            int m = n * i;

            System.out.println(n + "*" + i + "=" + m);
        }
        }

    }
}
