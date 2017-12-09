package observer.example.pull;

/**
 * @author gukepeng
 * @create 2017/12/8
 */
public class Reader implements Observer{
    /**
     * 读者的姓名
     */
    private String name;

    /**
     * 被通知的方法
     *
     * @param subject 具体的目标对象，可以获取报纸的内容
     */
    @Override
    public void update(Subject subject) {
        System.out.println(name+"收到了报纸，阅读它，内容是====="+((NewPaper)subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
