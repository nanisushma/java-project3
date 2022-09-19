package day15;

public class Looping {

    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        int i = 11;


        while (true){
            System.out.println(i);
            i++;
            if (i == 10) break;

        }
        System.out.println("I am out of the loop ");
        int j = 11;
        do{
            System.out.println(j);
            j++;
            if (j == 11) break;

        }while (true);

        System.out.println("I am out of the do while loop");

        for (int k = 1;; k += 1 ){
            System.out.println(k);
            if(k == 10) break;

        }
        System.out.println("I am out of for loop");

        for (int l = 1; l <= 10 ; l+=1){
            if (l % 2 == 0){
                continue;
            }
            System.out.println(l);
        }

    }
}
