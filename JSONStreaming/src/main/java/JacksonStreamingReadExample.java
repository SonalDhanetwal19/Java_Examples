import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import java.io.File;
import java.io.IOException;

public class JacksonStreamingReadExample {
    public static void main(String [] args) throws IOException {
        JsonParser jsonParser = new JsonFactory().createParser(new File("customer_hub.json"));

    }
}
