package observer.example.push;

/** 先创建好一个报纸，作为被观察的目标
 *  然后创建多个读者作为观察者
 * @author gukepeng
 * @create 2017/12/8
 */
public class Client {
    public static void main(String[] args) {
        //创建报纸，作为被观察者
        NewPaper subject = new NewPaper();
        //创建读者，作为观察者
        Reader r1 = new Reader();
        r1.setName("张三");
        Reader r2 = new Reader();
        r2.setName("李四");
        Reader r3 = new Reader();
        r3.setName("王五");

        //注册阅读者
        subject.attach(r1);
        subject.attach(r2);
        subject.attach(r3);

        //印刷报纸了
        subject.setContent("本期内容是观察者模式");

    }
}
