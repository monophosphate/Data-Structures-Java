import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

    public static void printArrayList(ArrayList<Plant> myGarden) {
        for (Plant each : myGarden) {
            each.printInfo();
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;

        ArrayList<Plant> myGarden = new ArrayList<>();

        String plantName;
        String plantCost;
        String colorOfFlowers;
        boolean isAnnual;

        input = scnr.nextLine();
        while (!input.equals("-1")) {
            String[] tmp = input.split(" ");

            if (tmp[0].equalsIgnoreCase("plant")) {
                Plant plant = new Plant();
                plant.setPlantName(tmp[1]);
                plant.setPlantCost(tmp[2]);
                myGarden.add(plant);
            }

            if (tmp[0].equalsIgnoreCase("flower")) {
                Flower flower = new Flower();
                flower.setPlantName(tmp[1]);
                flower.setPlantCost(tmp[2]);
                flower.setPlantType(Boolean.parseBoolean(tmp[3]));
                flower.setColorOfFlowers(tmp[4]);
                myGarden.add(flower);
            }
            input = scnr.nextLine();
        }
        printArrayList(myGarden);
    }
}
