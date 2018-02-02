package commontest;

import commontest.bean.People;

import java.io.*;

public class InputTest {
    private static File file = new File("D:\\ObjectOutputStream.txt") ;

    public static void main(String[] args) {
        //testObjectStream() ;
        //readObjectStream();
        //dataOutputStream();
        readDateStream();
    }

    private static void testObjectStream() {
        try {
            FileOutputStream fileStream = new FileOutputStream(file) ;
            ObjectOutputStream objStream = new ObjectOutputStream(fileStream) ;
            objStream.writeObject(new People("aaa",21));
            objStream.writeObject(new People("bbb",22));
            objStream.writeObject(new People("ccc",23));
            objStream.flush();
            objStream.close();

            FileInputStream inStream = new FileInputStream(file) ;
            ObjectInputStream objIn = new ObjectInputStream(inStream) ;
            Object obj = null ;
            while(objIn.read() > 0){
                System.out.println(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readObjectStream(){
        try {
            FileInputStream inStream = new FileInputStream(file) ;
            ObjectInputStream objIn = new ObjectInputStream(inStream);
            Object obj = null ;
            while((obj = objIn.readObject()) != null){
                System.out.println(obj);
            }
            objIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dataOutputStream(){
        People[] ps = {new People("aaa",12),new People("bbb",13),new People("ccc",14)} ;
        try{
            FileOutputStream fileStream = new FileOutputStream(file) ;
            DataOutputStream dataStream = new DataOutputStream(fileStream) ;
            for(People p : ps){
                dataStream.writeUTF(p.getName());
                dataStream.writeInt(p.getAge());
            }
            dataStream.flush();
            dataStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void readDateStream(){
        try{
            FileInputStream fileStream = new FileInputStream(file) ;
            DataInputStream dataIn = new DataInputStream(fileStream) ;
            String name = null ;
            System.out.println(dataIn.readUTF()) ;
            while((name = dataIn.readUTF()) != null){
                System.out.println(name);
            }
            dataIn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
