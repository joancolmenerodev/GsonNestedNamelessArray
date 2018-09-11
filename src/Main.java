import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();
        try {
            JsonResponse jsonResponse = gson.fromJson(new FileReader(new File("resources/jsonexample.json")), JsonResponse.class);
            System.out.println(jsonResponse.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
