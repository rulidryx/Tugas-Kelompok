package Program;
import java.io.FileInputStream;
import java.io.IOException;

public class file {
    public static void main(String args[]){
        FileInputStream finput=null;
        int data;
 
        //membuka file
        try{
            finput = new FileInputStream("d:/nama.txt");
        }catch(IOException e){}
        //membaca data dari dalam file dan menpilkanya ke layar
        try{
            while((data = finput.read())!=-1){
                //ketika di tampikan data di konversi ketipe char
                System.out.print((char) data);
            }
 
        }catch(IOException e){}
        try{
             finput.close();
        }catch(IOException e){}
 
    }
}
