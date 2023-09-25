package vieropeenrij;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;

public class LogGame implements java.util.Observer {
    private static ArrayList<String> $log = new ArrayList<String>();
    @Override
    public void update(Observable o, Object arg) {
        if (arg != null) {
            try {
                java.awt.Point p = (java.awt.Point) arg;
                java.io.FileWriter myWriter = new java.io.FileWriter("filename.txt");
                $log.add("a piece was dropped in column " + p.x + " and row " + p.y + "\n");

                myWriter.write($log.toString());
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("An error occurred.");
            }

        } else
            System.out.println("Reset");
    }
}
