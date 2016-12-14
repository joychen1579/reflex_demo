package cn.joychen.reflex;

import cn.joychen.reflex.sysannotation.Fruit;

/**
 * Created by joychen on 2016/12/13.
 * 1.0.0版本
 */
public class MainReflex11Annotation2 {


    ///深入理解Java：注解（Annotation）自定义注解入门
    //元注解：

    //　元注解的作用就是负责注解其他注解。Java5.0定义了4个标准的meta-annotation类型，它们被用来提供对其它 annotation类型作说明。Java5.0定义的元注解：
    //          　　　　1.@Target,
    //          　　　　2.@Retention,
    //          　　　　3.@Documented,
    //          　　　　4.@Inherited
    // 详细解释看：http://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
    //这些类型和它们所支持的类在java.lang.annotation包中可以找到。下面我们看一下每个元注解的作用和相应分参数的使用说明。

    public static void main(String[] args) {
        //
        //一、 取值(ElementType)有：

        //1.CONSTRUCTOR:用于描述构造器
        //2.FIELD:用于描述域
        //3.LOCAL_VARIABLE:用于描述局部变量
        //4.METHOD:用于描述方法
        //5.PACKAGE:用于描述包
        //6.PARAMETER:用于描述参数
        //7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
        //7.TYPE:用于描述类、接口(包括注解类型) 或enum声明


        // @Retention：

//　@Retention定义了该Annotation被保留的时间长短：某些Annotation仅出现在源代码中，而被编译器丢弃；而另一些却被编译在class文件中；编译在class文件中的Annotation可能会被虚拟机忽略，而另一些在class被装载时将被读取（请注意并不影响class的执行，因为Annotation与class在使用上是被分离的）。使用这个meta-Annotation可以对 Annotation的“生命周期”限制。

//　作用：表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）

//　二、取值（RetentionPoicy）有：

//　　　1.SOURCE:在源文件中有效（即源文件保留）
//　　　2.CLASS:在class文件中有效（即class保留）
//　　　3.RUNTIME:在运行时有效（即运行时保留）
        // 取值(RetentionPolicy)有：
        //1.SOURCE    :Annotations are to be discarded by the compiler.
        //2.CLASS     :Annotations are to be recorded in the class file by the compiler
        //            * but need not be retained by the VM at run time.  This is the default
        //            * behavior.
        //3.RUNTIME   : Annotations are to be recorded in the class file by the compiler and
        //            * retained by the VM at run time, so they may be read reflectively.
        //            *

        //三、 @Documented:

        //@Documented用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。Documented是一个标记注解，没有成员。


        //  四、  @Inherited：
//@Inherited 元注解是一个标记注解，@Inherited阐述了某个被标注的类型是被继承的。如果一个使用了@Inherited修饰的annotation类型被用于一个class，则这个annotation将被用于该class的子类。

//注意：@Inherited annotation类型是被标注过的class的子类所继承。类并不从它所实现的接口继承annotation，方法并不从它所重载的方法继承annotation。

//当@Inherited annotation类型标注的annotation的Retention是RetentionPolicy.RUNTIME，则反射API增强了这种继承性。如果我们使用java.lang.reflect去查询一个@Inherited annotation类型的annotation时，反射代码检查将展开工作：检查class和其父类，直到发现指定的annotation类型被发现，或者到达类继承结构的顶层。


        Fruit fruit = new Fruit();
        fruit.displayName();

        System.out.println("color=" + fruit.getColor());

        //上面虽然定义了注解  但是使用的时候还是没有效果。  看下面MainReflex12Annotation3  一个实例

    }


}
