import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerate {

    public void saveJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter write = new FileWriter(address.cep()+".json");
        write.write(gson.toJson(address));
        write.close();
    }
}
