package ReadFromFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFromCSV {
    private List<String> csvData= new ArrayList<String>();
    public List<String> readFromCSV(String path) throws IOException {
        csvData.clear();
       List<String> data= Files.readAllLines(Paths.get(path));

       for(String s:data){
        csvData.add(s);
       }
       List<String> csv=csvData;
     return csv;

    }
}
