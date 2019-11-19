package nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannel01 {
    // 使用通道写文件
    public static void main(String[] args) throws Exception {
        String str = "Hello,File Channel";
        //创建一个输出流->channel
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\file01.txt");

        //通过 fileOutputStream 获取 对应的 FileChannel
        //这个 fileChannel 真实 类型是  FileChannelImpl
        FileChannel fileChannel = fileOutputStream.getChannel();

        //创建一个缓冲区 ByteBuffer
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //将 str 放入 byteBuffer
        byteBuffer.put(str.getBytes());
        //对byteBuffer 进行flip
        byteBuffer.flip();
        //将byteBuffer 数据写入到 fileChannel
        fileChannel.write(byteBuffer);
        // close the stream
        fileOutputStream.close();
    }
}
