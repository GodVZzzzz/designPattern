package designpattern.decorator.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description
 */
public class IOTest {

    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in = new LowCaseInputStream(new BufferedInputStream((new FileInputStream("D:\\ss.txt"))));

            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }

            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
