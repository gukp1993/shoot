package observer.example.pull;

/**
 * @author gukepeng
 * @create 2017/12/8
 */
public class NewPaper extends Subject{

    /**
     * 报纸的具体内容
     */
    private String content;

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content=content;
        notifyObservers();//通知读者
    }
}

