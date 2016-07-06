第一层：
    maven {
      url 'https://dl.bintray.com/samyzhang/maven/'
    }
https://dl.bintray.com/samyzhang/maven/org/zsy/frame/libext/umeng/libext-umeng/1.0.0/
compile 'org.zsy.frame.libext.umeng:libext-umeng:1.0.0'
第二层：
想检查一下自己的library在jcenter上是否存在？你可以直接访问[http://jcenter.bintray.com]
然后进入和你library的group id 以及artifact id匹配的目录
https://jcenter.bintray.com/org/zsy/frame/libext/umeng/libext-umeng/1.0.0/

compile 'org.zsy.frame.libext.umeng:libext-umeng:1.0.0'