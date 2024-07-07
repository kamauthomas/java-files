import java.util.Arrays;
public class ISBN_search {
    //this code will search a book by its ISBN number in a sorted array of ISBN numbers
    public static int searchISBN(String[] ISBNs, String target) {
        Arrays.sort(ISBNs);
        int left = 0;
        int right = ISBNs.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ISBNs[mid].equalsIgnoreCase(target)) {
                return mid;
            } else if (ISBNs[mid].compareTo(target) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            
        }

        return -1;
    }

    public static void main(String[] args) {
        String [] ISBNs = {
            "978-1-56619-909-9",
            "978-1-56619-909-8",
            "978-1-56619-909-7",
            "978-1-56619-909-6",
            "978-1-56619-909-5",
            "978-1-56619-909-4",
            "978-1-56619-909-3",
            "978-1-56619-909-2",
            "978-1-56619-909-1",
            "978-1-56619-909-0"
        };
        String target = "978-1-56619-909-9";
        int result = searchISBN(ISBNs, target);
        if (result != -1) {
            System.out.println("ISBN found at index : " + result);
        }else {
            System.out.println("ISBN not found");
            
        }
    }
}
