public class P2Q1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Number\t Square\t  Cube \n");

        for (int i = 0; i <= 20; i = i+2) {
            System.out.printf("%d \t %.4f   %.4f\n" , i, Math.sqrt(i), Math.pow(i, 3));
        }
    }
}
