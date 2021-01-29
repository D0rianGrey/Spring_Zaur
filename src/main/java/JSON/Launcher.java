package JSON;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;

public class Launcher extends JSON {


    public static void main(String[] args) throws IOException {

//        String testXml = """
//                <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
//                <company>
//                    <name>IT-Heaven</name>
//                    <offices>
//                        <office floor="1" room="1">
//                            <employees>
//                                <employee name="Maksim" job="Middle Software Developer" />
//                                <employee name="Ivan" job="Junior Software Developer" />
//                                <employee name="Franklin" job="Junior Software Developer" />
//                            </employees>
//                        </office>
//                        <office floor="1" room="2">
//                            <employees>
//                                <employee name="Herald" job="Middle Software Developer" />
//                                <employee name="Adam" job="Middle Software Developer" />
//                                <employee name="Leroy" job="Junior Software Developer" />
//                            </employees>
//                        </office>
//                    </offices>
//                </company>""";


//        String json = converter1(testXml, 4);
//        System.out.println(json);

//        File xmlFile = new File("src\\main\\java\\XML_Parser\\Employees.xml");
//        byte[] b = Files.readAllBytes(xmlFile.toPath());
//        String xml = new String(b);
//        JSONObject jsonObject = XML.toJSONObject(xml);
//        System.out.println(jsonObject.toString(4));







    }
}
