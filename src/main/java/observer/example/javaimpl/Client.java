package observer.example.javaimpl;

/**
 * @author gukepeng
 * @create 2017/12/9
 */
public class Client {
    public static void main(String[] args) {
        NewsPager subject = new NewsPager();
        Reader r1 = new Reader();
        r1.setName("张三");

        Reader r2 = new Reader();
        r2.setName("李四");

        Reader r3 = new Reader();
        r3.setName("王五");

        //注册观察者
        subject.addObserver(r1);
        subject.addObserver(r2);
        subject.addObserver(r3);

        subject.setContent("本期内容是观察者模式");
    }

}
