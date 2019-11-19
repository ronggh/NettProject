package nio;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel03 {
    // 使用通道实现文件拷贝
    public static void main(String[] args) throws Exception {
        // 源文件和通道
        FileInputStream fileInputStream = new FileInputStream("d:\\file01.txt");
        FileChannel fileChannel01 = fileInputStream.getChannel();

        // 目标文件和通道
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\file02.txt");
        FileChannel fileChannel02 = fileOutputStream.getChannel();

        // 缓充区，使用同一个进行读写
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        while (true) { //循环读取
            //这里有一个重要的操作，一定不要忘了
            /*
             public final Buffer clear() {
                position = 0;
                limit = capacity;
                mark = -1;
                return this;
            }
             */
            byteBuffer.clear(); //清空buffer
            int num = fileChannel01.read(byteBuffer);
            System.out.println("read num =" + num);
            if(num == -1) { //表示读完
                break;
            }
            //将buffer 中的数据写入到 fileChannel02 -- 2.txt
            byteBuffer.flip();
            fileChannel02.write(byteBuffer);
        }

        //关闭相关的流
        fileInputStream.close();
        fileOutputStream.close();
    }
}
