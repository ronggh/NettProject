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
    * BasicBuffer, Buffer的基本使用
    * FileChannel01，使用Chennel写本地文件
    * FileChannel02，使用Chennel读本地文件（上例中生成的）
    * FileChannel03，使用同一个Buffer实现文件拷贝
    * FileChannel04，使用transform，拷贝文件
## netty
