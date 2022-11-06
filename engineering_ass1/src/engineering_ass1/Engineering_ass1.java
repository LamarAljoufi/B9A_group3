
//FarahAlamayrah - 2006356


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.Scanner;

public class Engineering_ass1 {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        Scanner input_file = new Scanner(System.in);
        
        //adding a loop
        while (true) {
            try {
                //print message:
                System.out.println("Enter Traces file name? ");
                String input = input_file.nextLine(); //reading
                File file = new File(input);
                input_file = new Scanner(file);

                break;
                
              //file not found error
            } catch (FileNotFoundException e) {
                System.out.println("the file does not Exist, sorry please try again");

            }
        }

        ArrayList<String> list = new ArrayList<String>();

        while (input_file.hasNextLine()) {
            String line = input_file.nextLine();
            String[] line_array = line.split("-");
            list.add(line_array[0]);

        }

        System.out.println("Done reading");
        input_file.close();

        try {
            fileWriter = new FileWriter("outputResults.txt");

        } catch (IOException e) {
            e.printStackTrace();

        }
        PrintWriter writeOutput = new PrintWriter(fileWriter);
        
        
        //distance
        for (int i = 0; i < list.size(); i++) {
            //inner loop
            for (int j = i + 1; j < list.size(); j++) {

                double distance = 0;
                String[] a_line = list.get(i).split(" ");
                String[] b_line = list.get(j).split(" ");

                for (int m = 0; m < a_line.length; m++) {
                    double a_num = Integer.parseInt(a_line[m]);
                    double b_num = Integer.parseInt(b_line[m]);

                    distance = distance + (a_num - b_num) * (a_num - b_num);
                }
                distance = Math.sqrt(distance);
                String distRound = String.format("%.2f", distance);
                writeOutput.println(distRound);

            }
        }
        System.out.println("Output results are stored in file outputResults.txt");
    }
}
