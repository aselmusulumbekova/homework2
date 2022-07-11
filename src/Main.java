import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./truck.json");


    public static void main(String[] args) {

        Driver[] drivers = {new Driver("driver-1", "Petr"),
                new Driver("driver-2", "Askar"),
                new Driver("driver-3", "Uson")

        };

        String json;
        json = GSON.toJson(drivers);
        System.out.println(json);

    }
    public void metod(){

    }

}

