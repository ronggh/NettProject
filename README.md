# NettyProject
## bio
    * blocking i/o
    * JDK1.4前只能用此方式，包在java.io下
    * BioServer is a server program
    * use telnet 6666 can connect to the server
## nio
    * non-blocking i/o
    * JDK 1.4开始提供，包在java.nio下
    * 面向缓冲区编程
### nio 三大核心
    * channel通道
    * buffer缓冲区
    * selector选择器
### 示例
    * BasicBuffer, Buffer的基本使用
    * FileChannel01，使用Chennel写本地文件
    * FileChannel02，使用Chennel读本地文件（上例中生成的）
    * FileChannel03，使用同一个Buffer实现文件拷贝
    * FileChannel04，使用transform，拷贝文件
    * ByteBufferPutGet，Put/Get放入、取出顺序、类型要一致
    * ReadOnlyBuffer, 只读的Buffer
    * MappedByteBufferTest,让文件直接在内存(堆外内存)修改, 操作系统不需要拷贝一次
    * ScatteringAndGatheringTest, 可以采用buffer数组，依次写入  [分散]
    * NioServer，NioClient,Nio
    * GroupChatServer，GroupChatClient,群聊系统
## netty
