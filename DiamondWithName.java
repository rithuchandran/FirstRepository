public class DiamondWithName {
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("RITHU");
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <(2*(n-i)-1) ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
