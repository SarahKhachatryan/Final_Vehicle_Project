import java.io.*;

public class RaceCarService implements Functions {
    @Override
    public void inspection() {
        System.out.println("Needs to be inspected every 2 years!!");
    }

    @Override
    public void inspectionCenters() {
        System.out.println("You can inspect your Electric Car in District of Columbia Motor Vehicle Inspection Station");
    }

    @Override
    public void storyOfInvention() {

        System.out.println("German engineer Andreas Flocken built" +
                " the first real electric car in 1888. Electric trains were also use" +
                "d to transport coal out of mines, as their motors did not use up pre" +
                "cious oxygen. Before the pre-eminence of internal combustion engines, " +
                "electric automobiles also held many speed and distance records.");
    }

    public RaceCar[] readFromFile() {
        try {
            File file = new File("RaceCars.txt");
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
            RaceCar[] raceCarArray = new RaceCar[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String[] raceCar = arr[i].split(",");
                raceCarArray[i] = new RaceCar();
                raceCarArray[i].setFromArray(raceCar);
            }
            return raceCarArray;
        } catch (IOException E2) {
            System.out.println("Couldn't read the file!!");

        }
        return null;
    }

    public void writeInFile(RaceCar raceCar) {
        try {
            File file = new File("RaceCars.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Your file was created by name: " + file.getName());
            }
            try {
                FileWriter fileWrite = new FileWriter(file.getName(), true);
                BufferedWriter bw = new BufferedWriter(fileWrite);
                bw.write(raceCar.fieldsInString() + "\n");
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
