
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ElectricCarService implements Functions {

    @Override
    public void inspection() {
        System.out.println("Needs to be inspected every year!!");
    }

    @Override
    public void inspectionCenters() {
        System.out.println("You can inspect your El Car in El cars center.");
    }

    @Override
    public void storyOfInvention() {
        System.out.println("Around 1832, Robert Anderson develops the first crude electric vehicle, but it isn't until the 1870s or later that " +
                "electric cars become practical. Pictured here is an electric vehicle built by an English inventor in 1884.");
    }
    public ElectricCar[] readFromFile() {
        try {
            File file = new File("ElectricCars.txt");
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
            ElectricCar[] elCarArray = new ElectricCar[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String[] elCar= arr[i].split(",");
                elCarArray[i] = new ElectricCar();
                elCarArray[i].setFromArray(elCar);
            }
            return elCarArray;
        } catch (IOException E2) {
            System.out.println("Couldn't read the file!!");

        }
        return null;
    }
    public void writeInFile(ElectricCar elCar) {
        try {

            File file = new File("ElectricCars.txt");
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("Your file was created by name: " + file.getName());
            }

                try {
                    FileWriter fileWrite = new FileWriter(file.getName(),true);
                    BufferedWriter bw = new BufferedWriter(fileWrite);
                    bw.write(elCar.fieldsInString()+"\n");
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
