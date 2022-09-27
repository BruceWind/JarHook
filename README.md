# JarHook
An example about hooking a Jar.

[中文](https://github.com/BruceWind/JarHook/blob/master/README_zh.md)

### my goal
In this project, I put `MainActivity.hookXM(String name);` into `sayHello`.

the source code of this jar in hello sub-module ：
``` java
package com.androidyuan;

public class Hello {
    public Hello() {
    }

    public static void sayHello(String name) {  //this method would be hooked.
    }
}
```

### important code in build.gradle
```
    ['methodName': 'sayHello', 'methodDesc': '(Ljava/lang/String;)V'
```
This code above has the structure is Byte-code. If you have seen some byte-code example, you may be familiar with it.


### Priciple

It modify Byte-code by hibeaber, which work with gradle and building process. And it depend on ASM.



## Thanks

[hibeaver](https://github.com/BryanSharp/hibeaver)

[ASM](https://github.com/marchof/asm)
