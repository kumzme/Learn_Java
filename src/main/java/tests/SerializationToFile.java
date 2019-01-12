package tests;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import static tests.DeSerializationToObject.DeSerailizedtoObject;


public class SerializationToFile {

    public static void SerializationToFile(Object classObject, String filename) throws Exception{
        FileOutputStream fout = new FileOutputStream(filename);
        ObjectOutputStream out =new ObjectOutputStream(fout);
        out.writeObject(classObject);
        out.close();
        fout.close();
    }
    public static void main(String args[]) throws Exception {
        Rectangle r1 = new Rectangle(11.1,12.1);
        SerializationToFile(r1,"restSeralized");
        System.out.println("Sucess");
        Rectangle deSerailzedObject = (Rectangle) DeSerailizedtoObject("restSeralized");
        System.out.println("Rest Area is "+ deSerailzedObject.Area());

        EmployeeClass empc = new EmployeeClass("DeepM",11111,"11111");
        SerializationToFile(empc,"empTest");
        System.out.println("employee class sucessfully seralized to byte stream");
    }

}
