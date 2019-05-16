import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Generate_JSON_file {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "Nic");
        obj.put("age", "28");

        JSONArray list = new JSONArray();
        list.put("msg 111");  // -- use "put", "add" isn't work
        list.put("msg 222");
        list.put("msg 333");

        obj.put("messages", list);

        try {

            //print to file
            // the file will be created in the specified folder automatically
            FileWriter file = new FileWriter("C:\\Users\\file.json");
            file.write(String.valueOf(obj)); //-- working version
            //file.write(obj.toString());    -- working version too

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //print to console
        System.out.print(obj);

    }
}
