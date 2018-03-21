package chain;

/**
 * @author gukepeng
 * @create 2018/3/21
 */
public class Client {
    public static void main(String[] args) {
        //创建业务对象
        GoodsSaleEbo ebo = new GoodsSaleEbo();
        //准备测试数据
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("测试商品");
        saleModel.setSaleNum(10);

        //调用业务功能
        ebo.sale("小李", "买家张三", saleModel);
        ebo.sale("小张", "买家李四", saleModel);
    }
}
