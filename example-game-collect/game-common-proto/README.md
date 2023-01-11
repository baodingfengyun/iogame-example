## GenerateFileForProto 工具

将 com.iohao.game.collect.proto 目录下的Java文件（带注解@ProtobufClass）生成对应的proto文件。

这个过程与一般的proto生成Java文件来说，是相反的过程。

这种方法对于服务端来说比较友好，但是proto文件与Java源代码绑定，耦合度太高。

代码注释可以很好的生成到proto文件中。效果不错。
