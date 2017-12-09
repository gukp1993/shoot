package observer.example.deformation;

/**
 * @author gukepeng
 * @create 2017/12/9
 */
public interface WatcherObserver {
    /**
     * 被通知的方法
     * @param subject 传入被观察的目标对象
     */
    void update(WaterQualitySubject subject);

    /**
     * 设置观察人员的职务
     * @param obj
     */
    void setJob(String obj);

    /**
     * 获取观察人员的职务
     * @return
     */
    String getJob();
}
