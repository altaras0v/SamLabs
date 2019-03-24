public class PrintData {
    public static void printArray(Employee[] array){
        for(Employee i: array){
            System.out.println(i.getName() + " " + i.countSalaryWithTax() + " ");
        }
    }
}
