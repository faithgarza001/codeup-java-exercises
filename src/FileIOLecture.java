import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {
        newFile();
        writeFile();
    }
    static void newFile(){
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);



        try{
            if(Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("Created Directory");
            }
            if(!Files.exists(dataFile)) {
                Files.createFile(dataFile);
                System.out.println("Created file");
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
 //program to interfaces versus implementation
    static void writeFile() {
        List<String> fruit = new ArrayList<>();
        fruit.add("banana");
        fruit.add("orange");
        for (String fr : fruit)
            System.out.println(fr);
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries, fruit);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        fruit.add("Kiwi"); fruit.add("starfruit");
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries, fruit);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }


}
