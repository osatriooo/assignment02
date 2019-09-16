import com.enigma.model.Directions;
import com.enigma.model.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please iput your coordinate (X,Y, DIRECTION)");
        System.out.println("NORTH, SOUTH, WEST, or EAST = ");
        String coordinate = br.readLine();
        String [] post = coordinate.split(",");
        Robot atom = new Robot(Integer.parseInt(post[0]),Integer.parseInt(post[1]),Directions.valueOf(post[2]));

        System.out.println("= = Plese input daya for the robot = =");
        System.out.println(" PLEASE INPUT 1 VOLT = ");
        String jumDaya = br.readLine();
        int daya = Integer.parseInt(jumDaya);
        atom.fullDaya(Integer.parseInt(jumDaya));

        System.out.println("plese input your instruction to your robot");
        System.out.println(" F = FRONT, R = RIGHT, L = LEFT, B = BACK ");
        String perintah = br.readLine();
        atom.setCommands(perintah);

        atom.run();
        System.out.println(atom.print());
    }

}
