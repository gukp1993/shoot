package observer.example.deformation;

/**
 * @author gukepeng
 * @create 2017/12/9
 */
public class Watcher implements WatcherObserver{

    /**
     * 职务
     */
    private String job;


    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 被通知的方法
     *
     * @param subject 传入被观察的目标对象
     */
    @Override
    public void update(WaterQualitySubject subject) {
        System.out.println(job+"获取到通知，当前污染级别为:"+subject.getPolluteLevel());
    }
}
