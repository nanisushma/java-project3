package day18;

import java.util.Arrays;

public class CommandLineArguments {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        if (args.length == 0) {

        } else {


            if (args[0].equalsIgnoreCase("development")) {
                //Development
            } else if (args[0].equalsIgnoreCase("staging")) {
                //Staging
            } else {
                //Production
            }
        }
    }
}