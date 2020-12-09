package JSON;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class JSON {

    public static String converter1(String xml, int factor) {
        try {
            JSONObject jsonObject = XML.toJSONObject(xml);
            return jsonObject.toString(factor);
        } catch (JSONException jsonException) {
            return jsonException.toString();
        }
    }

}




