import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SHIYAN5_3 {

    public static void main(String[] args) {

        FileInputStream fp1;

        FileOutputStream fp2;

        try{

            fp1 = new FileInputStream("QQ.png");

            fp2 = new FileOutputStream("QQBak.png");

           byte a[] = new byte[16];

           while(fp1.available()!=0)
{
               fp1.read(a);

               fp2.write(a);


           }

           fp1.close();

           fp2.close();

        }catch(IOException e){

            System.out.println("exception!");

        }
    }
}




