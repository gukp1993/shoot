package observer.example.deformation;

/**
 * @author gukepeng
 * @create 2017/12/9
 */
public class WaterQuality extends WaterQualitySubject{

    /**
     * 污染级别，0表示正常，1表示轻度污染，2表示中度污染，3表示高度污染
     */
    private int polluteLevel=0;

    /**
     * 获取水质污染的级别
     *
     * @return
     */
    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    /**
     * 当监测水质情况后，设置水质污染的级别
     * @param polluteLevel
     */
    public void setPolluteLevel(int polluteLevel){
        this.polluteLevel=polluteLevel;
        //通知相应的观察者
        this.notifyWatchers();
    }

    /**
     * 通知相应的观察者对象
     */
    @Override
    public void notifyWatchers() {
        for(WatcherObserver watcher:observers){

            if(this.polluteLevel>=0){
                //通知监测人员做记录
                if("监测人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }

            if(this.polluteLevel>=1){
                //通知预警人员
                if("预警人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }

            if(this.polluteLevel>=2){
                //通知监测部门领导
                if("监测部门领导".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
        }

    }
}
