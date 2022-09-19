package day11;

public class Door {

    private static  int counter = 0;

    public void incrementCounter(){

        counter += 1;

    }

    public void decrementCounter(){

        counter -= 1;
    }

    public static int getCounter(){
        return counter;
    }


}
