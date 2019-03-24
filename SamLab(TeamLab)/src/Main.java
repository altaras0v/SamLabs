public class Main {

    public static void main(String[] args) {
        Racer r1 = new Racer("Petr", 34);
        Racer r2 = new Racer("Sacha", 35);

        Mechanic m1 = new Mechanic("Fedya", 3);
        Mechanic m2 = new Mechanic("Oleg", 3);
        Mechanic m3 = new Mechanic("Petuh", 3);

        JuniorMechanic jm1 = new JuniorMechanic("Katya", 3);


        Employee array[] = new Employee[6];
        array[0]=r1;
        array[1]=r2;
        array[2]=m1;
        array[3]=m2;
        array[4]=m3;
        array[5]=jm1;

        PrintData.printArray(array);

    }
}
