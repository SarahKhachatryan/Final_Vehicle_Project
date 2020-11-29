import java.io.*;

public class PlaneService implements Functions {
    @Override
    public void inspection() {
        System.out.println("Needs to be inspected before every flight!!");
    }

    @Override
    public void inspectionCenters() {
        System.out.println("You can inspect your Plane in LTA-Authorised Vehicle Inspection Centres");
    }

    @Override
    public void storyOfInvention() {
        System.out.println("An airplane or aeroplane (informally plane) is a powered, fixed-wing aircraft " +
                "that is propelled forward by thrust from a jet engine, propeller or rocket engine. ... The " +
                "Wright brothers invented and flew the first airplane in 1903, " +
                "recognized as \"the first sustained and controlled heavier-than-air powered flight\".");
    }

    public Plane[] readFromFile() {
        try {
            File file = new File("Planes.txt");
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
            Plane[] planeArray = new Plane[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String[] plane = arr[i].split(",");
                planeArray[i] = new Plane();
                planeArray[i].setFromArray(plane);
            }
            return planeArray;
        } catch (IOException E2) {
            System.out.println("Couldn't read the file!!");

        }
        return null;
    }

    public void writeInFile(Plane plane) {
        try {
            File file = new File("Planes.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Your file was created by name: " + file.getName());
            }
            try {
                FileWriter fileWrite = new FileWriter(file.getName(), true);
                BufferedWriter bw = new BufferedWriter(fileWrite);
                bw.write(plane.fieldsInString() + "\n");
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

