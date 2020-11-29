import java.io.*;

public class BoatService  implements Functions {

    @Override
    public void inspection() {
        System.out.println("Needs to be inspected before every usage!!");
    }

    @Override
    public void inspectionCenters() {
        System.out.println("You can inspect your boat in Tahoe Boat Inspections.");
    }

    @Override
    public void storyOfInvention() {
        System.out.println("The oldest recovered boat in the world, the Pesse canoe, found in the Netherlands, " +
                "is a dugout made from the hollowed tree trunk of a Pinus sylvestris that was constructed somewhere " +
                "between 8200 and 7600 BC. ..." +
                " Boats were used between 4000 and 3000 BC in Sumer, ancient Egypt and in the Indian Ocean.");
    }
    public Boat[] readFromFile() {
        try {
            File file = new File("Boats.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append("\n");
            }
            fr.close();
            String[] arr = sb.toString().split("\n");
            Boat[] boatsArray = new Boat[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String[] plane= arr[i].split(",");
                boatsArray[i] = new Boat();
                boatsArray[i].setFromArray(plane);
            }
            return boatsArray;
        } catch (IOException E2) {
            System.out.println("Couldn't read the file!!");

        }
        return null;
    }
    public void writeInFile(Boat boat) {
        try {
            File file = new File("Planes.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Your file was created by name: " + file.getName());
            }
            try {
                FileWriter fileWrite = new FileWriter(file.getName(), true);
                BufferedWriter bw = new BufferedWriter(fileWrite);
                bw.write(boat.fieldsInString() + "\n");
                bw.close();
                System.out.println("Everything is ok!");
            } catch (IOException e1) {
                System.out.println("Cant write to file. Try again.");
            }

        } catch (IOException e) {
            System.out.println("Can't create that file. Try again.");
        }

    }
}


