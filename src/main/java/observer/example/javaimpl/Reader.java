package observer.example.javaimpl;

import java.util.Observable;

/**
 * @author gukepeng
 * @create 2017/12/9
 */
public class Reader implements java.util.Observer{
    /**
     * 读者的姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        //推模式，默认是拉模式，使用推模式，也可以获得目标对象引用，即两种模式可以同时使用
        System.out.println(name+"收到报纸了，阅读先。目标推过来的内容是===="+arg);
        System.out.println("推模式也能获得目标对象引用，因为两种模式可以同时使用："+((NewsPager)o).getContent());

        //拉模式
//        System.out.println(name+"收到报纸了，阅读先。主动到目标对象拉取的内容是=====" +((NewsPager)o).getContent());
    }
}
