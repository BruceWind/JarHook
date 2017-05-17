# Jar_Hook
在利用gradlehook一个jar包内的一个方法，实现代码插桩。


``` java
//jar包中的代码：
package com.androidyuan;

public class Hello {
    public Hello() {
    }

    public static void sayHello(String name) {//被hook的方法
    }
}


```

在sayHello方法里插入了`MainActivity.hookXM(String name);`.

**执行效果请看日志。**



### 目前实现原理


利用修改字节码技术，hibeaver是ASM基于gradle的一种包装方案，核心原理在于ASM框架。

目前，仅仅在编译期间hook，没有在运行时hook.

### 在运行期hook是否是一种可行性方案？

> + Dalvik:
    理论上来说运行时hook也可以，基于ASMDEX就好，Dalvik机器使用java字节码解释执行，运行期间也不断被自带JIT机制修改字节码。

> + Art:
    但是Art虚拟机之后，apk安装之后会把字节码转为跟其他平台一样的机器码，Art虚拟机算是一种比较特殊的JVM吧，已经完全抛弃了JVM规范了。
综上：
    还是老老实实稳定的使用编译期间hook的方案吧。


## 鸣谢

[hibeaver](https://github.com/BryanSharp/hibeaver)

[ASM](https://github.com/marchof/asm)
