package observer.example.javaimpl;

/**
 * @author gukepeng
 * @create 2017/12/9
 */
public class NewsPager extends java.util.Observable{

    /**
     * 报纸的具体内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    /**
     * 维护状态
     * 示例，设置报纸的具体内容，相当于要出版报纸了
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
        this.setChanged();//很重要
        //推模式
        this.notifyObservers(this.content);
        //拉模式
//        this.notifyObservers();
    }
}
