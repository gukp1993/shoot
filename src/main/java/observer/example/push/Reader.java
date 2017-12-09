package observer.example.push;

/**
 * @author gukepeng
 * @create 2017/12/8
 */
public class Reader implements Observer {
    /**
     * 读者的姓名
     */
    private String name;

    /**
     * 被通知的方法
     *
     * @param content 推送的内容
     */
    @Override
    public void update(String content) {
        //这是采用推的方式
        System.out.println(name+"收到了报纸，阅读它，内容是====="+content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
