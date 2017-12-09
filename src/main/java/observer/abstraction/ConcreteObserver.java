package observer.abstraction;

/**
 * @author gukepeng
 * @create 2017/12/7
 */
public class ConcreteObserver implements Observer{

    private String observerState;//观察者的状态

    /**
     * 更新的接口
     *
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        //具体的更新实现
        //这里可能需要更新观察者的状态，使其与目标的状态保持一致
        observerState=((ConcreteSubject)subject).getSubjectState();
    }
}
