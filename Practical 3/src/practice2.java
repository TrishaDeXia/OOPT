public class practice2 {

    public static void main(String[] args) {
        int[] list = {1, -2, 4, 5, 10, 200, -32, -22};
        int minIndex = minIndex(list);
        System.out.println("The index of the min is " + minIndex + " which the value is " + list[minIndex]);
  
    }

    public static int minIndex(int[] list) {
        int min = list[0];
        int minIndex = 0;

        for (int i = 1; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
