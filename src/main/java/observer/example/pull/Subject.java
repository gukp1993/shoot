package observer.example.pull;

import java.util.ArrayList;
import java.util.List;

/** 目标对象，作为被观察者
 * @author gukepeng
 * @create 2017/12/8
 */
public class Subject {

    /**
     * 观察者列表，比如报纸的订阅者
     */
    private List<Observer> readers = new ArrayList<Observer>();

    /**
     * 添加订阅操作，报纸的读者需要想报社订货，先要注册
     * @param reader 报纸的读者
     */
    public void attach(Observer reader){
        readers.add(reader);
    }

    /**
     * 报纸的读者可以取消订阅
     * @param reader 报纸的读者
     */
    public void detach(Observer reader){
        readers.remove(reader);
    }

    /**
     * 报社印刷了报纸，需要通知订阅的读者
     */
    protected void notifyObservers(){
        for(Observer reader:readers){
            reader.update(this);
        }
    }
}
