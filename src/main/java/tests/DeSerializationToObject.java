package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationToObject {

    public static Object DeSerailizedtoObject(String fileName) throws  Exception{
        FileInputStream fin = new FileInputStream(new File(fileName));
        ObjectInputStream ObjIn = new ObjectInputStream(fin);
        Object deSerialzedObj = ObjIn.readObject();
        ObjIn.close();
        fin.close();

        return deSerialzedObj;
    }
    public static void main(String args[]) throws Exception {

      EmployeeClass deSearlizedempC = (EmployeeClass) DeSerailizedtoObject("empTest");
      System.out.println(deSearlizedempC.getEmpName());
      System.out.println(deSearlizedempC.getDeptName());

    }

}
