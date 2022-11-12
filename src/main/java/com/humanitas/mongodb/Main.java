import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static com.mongodb.client.model.Filters.eq;


public class Main {

    public static void main(String[] args) {

        MongoClient client = MongoClients.create("mongodb+srv://adrian:Ernabo1234#*@cluster0.d95kmej.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("pojazdy");
        MongoCollection col =db.getCollection("cwiczenia");

        col.deleteOne(eq("_id", new ObjectId("636fc272278090788db9e009")));

    }
    Logger logger = LoggerFactory.getLogger("MyApp");
}