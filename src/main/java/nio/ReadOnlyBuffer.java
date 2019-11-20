package nio;

import java.nio.ByteBuffer;

// 只读的Buffer
public class ReadOnlyBuffer {
    public static void main(String[] args) {
    //创建一个buffer
        ByteBuffer buffer = ByteBuffer.allocate(64);

        for (int i = 0; i < 64; i++) {
            buffer.put((byte) i);
        }

        //读取
        buffer.flip();

        //得到一个只读的Buffer
        ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());

        //读取
        while (readOnlyBuffer.hasRemaining()) {
            System.out.println(readOnlyBuffer.get());
        }

        //ReadOnlyBufferException，这行会导致运行出错
//        readOnlyBuffer.put((byte) 100);
    }
}
