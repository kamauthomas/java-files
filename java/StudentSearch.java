//this code will find a specific students registration number from a set of unsorted registration numbers using linear search

public class StudentSearch{
    public static int searching(String[] students, String name) {
        for(int i = 0; i < students.length; i++){
            if(students[i].equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String [] students = {
            "DCSC01/4718/2022",
            "DCSC01/4722/2022",
            "DCSC01/4323/2022",
            "DCSC01/4324/2022",
            "DCSC01/4325/2022"
        };

        String name = "DCSC01/4722/2022";
       
        int result = searching(students, name);

        if (result != -1) {
            System.out.println("student Id found at index : " + result);
        }else {
            System.out.println("stundent id not found");
            
        }
    }
}