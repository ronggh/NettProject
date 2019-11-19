package nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FileChannel04 {
    // transferFrom 实现文件拷贝
    public static void main(String[] args) throws Exception {
        //创建相关流
        FileInputStream fileInputStream = new FileInputStream("d:\\file01.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\file02.txt");

        //获取各个流对应的filechannel
        FileChannel sourceChannel = fileInputStream.getChannel();
        FileChannel destChannel = fileOutputStream.getChannel();

        //使用transferForm完成拷贝
        destChannel.transferFrom(sourceChannel,0,sourceChannel.size());
        //关闭相关通道和流
        sourceChannel.close();
        destChannel.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
