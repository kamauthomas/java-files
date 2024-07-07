public class Bubble_sort {
    public static int Bsort(String[] fruits){
        int length = fruits.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (fruits[j].compareToIgnoreCase(fruits[j + 1]) > 0) {
                    String temp = fruits[j];
                    fruits[j] = fruits[j + 1];
                    fruits[j + 1] = temp;
                }
            }
        }
        return fruits.length;
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi", "avocado", "apple", "mango", "banana", "orange"};
        Bsort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
