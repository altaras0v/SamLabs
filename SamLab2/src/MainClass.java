import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// All code in one class cause it is requirement.
// Comments to code also also do not provided
public class MainClass {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Parameter: " + arg);
        }
        if (args.length > 0) {
            switch (args[0]) {
                case "1":
                    task1();
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4(args);
                    break;
                case "5":
                    task5();
                    break;
                case "6":
                    task6();
                    break;
                case "7":
                    task7();
                    break;
                case "8":
                    task8();
                    break;
                case "9":
                    task9();
                    break;
                case "10":
                    task9();
                    break;
                default:
                    System.out.println("Unknown");
            }

        }
        task10();
    }
    private static void task10(){
        String card[] = {"Jack","Queen","King","Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String rank[] = {"Hearts","Spades","Clubs","Diamonds"};

        String allCards[] = new String[52];
            for(int i = 0,k=0;i<rank.length;i++,k=k+13){
                for(int j = 0; j<card.length;j++){
                    allCards[k+j] = card[j] + " of " + rank[i];
                }
            }

        Random rnd = new Random();
        for (int i = 0; i < allCards.length; i++) {
            int j = rnd.nextInt(i + 1);
            String temp = allCards[i];
            allCards[i] = allCards[j];
            allCards[j] = temp;
        }
        for(String s : allCards){
            System.out.println(s);
        }

    }

    private static void task4(String[] args){


            Scanner sc = new Scanner(System.in);
            System.out.println("Please input array dimensions");
            int sizeX = sc.nextInt();
            int sizeY = sc.nextInt();
            int[][] arr = new int[sizeX][sizeY];
            int find = Integer.parseInt(args[1]);
            int findX = 0, findY = 0;
            int delta = Integer.parseInt(args[2]);
            for (int i = 0; i < sizeX; i++) {
                for (int k = 0; k < sizeY; k++) {
                    arr[i][k] = (int) (100 * Math.random());
                }
            }
            int check = 0;
            for (int[] n : arr) {
                System.out.println(Arrays.toString(n));
            }

            for (int i = 0; i < sizeX; i++) {
                for (int k = 0; k < sizeY; k++) {
                    if (arr[i][k] == find) {
                        findX = i;
                        findY = k;
                        check++;
                        break;
                    }
                }
            }
            if (check == 0) {
                System.out.println("No matches");
            } else {
                System.out.printf("Found coordinates! %d %d \n", findX, findY);
            }

            int m = 0;
            loop:
            for (int i = 0; i < sizeX; i++) {
                for (int k = 0; k < sizeY; k++) {
                    m++;
                    if (arr[i][k] == find) {
                        findX = i;
                        findY = k;
                        check++;
                        break loop;
                    }
                }
            }
            if (check == 0) {
                System.out.println("No matches");
            } else {
                System.out.printf("Found coordinates and iterations! %d %d %d \n", findX, findY, m);
            }

            int check1 = 0;
            for (int i = 0; i < sizeX; i++) {
                for (int k = 0; k < sizeY; k++) {
                    if ((arr[i][k] < (find - delta)) || (arr[i][k] > (find + delta))) {
                        check1++;
                    }
                }
            }
            System.out.println(check1);
        }

    private static void task8(){

        Random rand = new Random();
        int mas[] = new int[4];
        int i = 0;
        do{
            mas[i]=rand.nextInt((99 - 10) + 1) + 10;
            i++;
        } while (i<mas.length);
        String result = "Progressiya vozrast";
        int j = 0;
        do{
            if (j > 0 && mas[j - 1] >= mas[j]) {
                result = "Progressiya ne vozrast";
                break;
            }
            j++;
        }while (j<mas.length);
        System.out.println(result);
        System.out.println(Arrays.toString(mas));
    }

    private static void task7(){

        Random rand = new Random();
        int mas[] = new int[4];
        int i = 0;
        while (i<mas.length){
            mas[i]=rand.nextInt((99 - 10) + 1) + 10;
            i++;
        }
        String result = "Progressiya vozrast";
        int j = 0;
        while (j<mas.length){

            if (j > 0 && mas[j - 1] >= mas[j]) {
                result = "Progressiya ne vozrast";
                break;
            }
            j++;
        }
        System.out.println(result);
        System.out.println(Arrays.toString(mas));
    }

    private static void task9(){
        String card[] = {"Jack","Queen","King","Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String rank[] = {"Hearts","Spades","Clubs","Diamonds"};

        int b = 13;// Cause Random()<1.0;
        int c = 4;
        int randomNumberCard =   (int) (Math.random() * b);
        int randomNumberRank =   (int) (Math.random() * c);

        System.out.println("Your card is:");
        System.out.printf("%s %s %s",card[randomNumberCard],"of",rank[randomNumberRank]);


    }

    private static void task6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность \"бабочки\"");
        int n =in.nextInt();

        String arr[][]=new String[n][n];
        int i,j;

        for (i=0;i<arr.length/2+1;i++){
            for (j=0;j<arr[i].length;j++){
                if ((j<i) || (j>=(arr[i].length-i)))
                    arr[i][j]=" ";
                else
                    arr[i][j]="*";

            }
        }
        for (i=arr.length-1; i>=arr.length/2; i--){
            for (j=0; j<arr[i].length; j++){
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=" ";
                else
                    arr[i][j]="*";}
        }
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static void task5() {
        Random rand = new Random();
        int mas[] = new int[4];
        for(int i = 0; i<mas.length;i++){
            mas[i]=rand.nextInt((99 - 10) + 1) + 10;
        }
        String result = "Progressiya vozrast";
        for (int i = 0; i < mas.length; i++) {
            if (i > 0 && mas[i - 1] >= mas[i]) {
                result = "Progressiya ne vozrast";
                break;
            }
        }
        System.out.print(result);
        System.out.println(Arrays.toString(mas));
    }

    private static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number");
        int n =  in.nextInt();
        boolean f = true;
        int i;
        for(i=2; i<n ;i++)
        {
            if (n%i==0) {
                f = false;
                break;
            }
        }
        if (f) System.out.println("easy number");
        else System.out.println("composite number");
    }

    private static void task1() {
        final  int n = 100;
        int mas[] = new int[n];
        int k;
        int j = 0;

        for(k = 0; j < n ; k++){
            if(k%17==0||k%23==0){
                mas[j]=k;
                j++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of mas");
        int amount = scanner.nextInt();
        int mas[] = new int[amount];
        for(int i = 0; i<mas.length;i++){
            mas[i]=(int)(100*Math.random());
        }
        int indexOfMax = 0;
        int indexOfMin = 0;


        for (int i = 1; i < mas.length; i++)
        {
            if (mas[i] > mas[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (mas[i] < mas[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println("Array");
        for (int m:mas){
            System.out.println(m);
        }
        if(indexOfMax>indexOfMin){
            int sum = 0;
            for(int i = indexOfMin+1;i<indexOfMax;i++){
                sum+=mas[i];
            }
            System.out.println("Sum: "+ sum);
        }else {
            int sum = 0;
            for(int i = indexOfMax-1;i>indexOfMin;i--){
                sum+=mas[i];
            }
            System.out.println("Sum: "+ sum);
        }
    }
}