package nio;

import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {
        //举例说明Buffer 的使用 (简单说明)
        //创建一个Buffer, 大小为 5, 即可以存放5个int
        IntBuffer intBuffer = IntBuffer.allocate(5);

        //向buffer 存放数据
        for(int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put( i * 2);
        }

        //如何从buffer读取数据
        //将buffer转换，读写切换(!!!)
        /* 这部分是flip()的实现源码
        public final Buffer flip() {
        limit = position; //读数据不能超过5
        position = 0;
        mark = -1;
        return this;
    }
         */
        intBuffer.flip();
        intBuffer.position(1);// 当前位置
        System.out.println("读取一个：" + intBuffer.get());
        intBuffer.limit(4); // 限定
        System.out.println("使用限定后，其它的：");
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
