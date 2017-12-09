package observer.example.deformation;

import java.util.ArrayList;
import java.util.List;

/** 定义水质监测的目标对象
 * @author gukepeng
 * @create 2017/12/9
 */
public abstract class WaterQualitySubject {

    /**
     * 用来保存注册的观察者对象
     */
    protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();

    /**
     * 注册观察者对象
     * @param observer
     */
    public void attach(WatcherObserver observer){
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer
     */
    public void detach(WatcherObserver observer){
        observers.remove(observer);
    }

    /**
     * 通知相应的观察者对象
     */
    public abstract void notifyWatchers();

    /**
     * 获取水质污染的级别
     * @return
     */
    public abstract int getPolluteLevel();
}
