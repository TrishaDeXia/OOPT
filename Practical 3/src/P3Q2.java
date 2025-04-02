public class P3Q2 {

    public static void main(String[] args) {

        int[] list = {1, -2, 4, 5, 10, 200, -32, -22};
    
        int smallestIndex = findSmallestIndex(list);
        
        System.out.println("The index of the min is " + smallestIndex + " which the value is " + list[smallestIndex]);
        System.out.println("Build successfully (total time: 0 seconds)");
    }

    public static int findSmallestIndex(int[] list) {

        int smallestIndex = 0;
        
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[smallestIndex]) {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }

}
