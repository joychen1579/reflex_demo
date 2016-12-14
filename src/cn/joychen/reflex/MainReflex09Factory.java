package cn.joychen.reflex;

/**
 * Created by joychen on 2016/12/12.
 * 1.0.0版本
 * 工具类编写
 */
abstract public class MainReflex09Factory {


    // 方式一 把工具类做成单例
    // 方式二 把工具方法写成 static   把所有的构造器私有化，或者把该工具类加一abstract
    // 目的是为了全部是类去调用工具方法
    //

    private MainReflex09Factory() {}

    /**
     * @param className 类全路径
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T getBean(String className, Class<T> type) {
        try {
            Class<T> clz = (Class<T>) Class.forName(className);
            Object ob = clz.newInstance();
            if (type.isInstance(ob)) {
                return (T) ob;
            } else {
                throw new IllegalArgumentException("对象和类型不兼容");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
