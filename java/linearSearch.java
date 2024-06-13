

public class linearSearch {

    public static int linearSearch(int[]numbers, int key) {
        for (int  index = 0; index < numbers.length; index++) {
            if (numbers[index] == key) {
                return index;
            }
            
        }

        return -1;
    }

    public static void main(String [] args){
        int[] numbers = {1,34,3,2,43};
        int key = 3;
    
        int result = linearSearch(numbers, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Element not found");
        }
    }




}

