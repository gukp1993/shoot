package chain;

/**
 * 商品销售管理模块业务处理
 *
 * @author gukepeng
 * @create 2018/3/21
 */
public class GoodsSaleEbo {
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //如果全部在这里处理，基本的顺序是
        //1.权限检查
        //2.数据检查
        //3.逻辑检查
        //4.真正的业务处理

        //用功能链处理
        SaleHandler ssc=new SaleSecurityCheck();
        SaleHandler sdc=new SaleDataCheck();
        SaleHandler slc=new SaleLogicCheck();
        SaleMgr sm=new SaleMgr();
        ssc.setSuccessor(sdc);
        sdc.setSuccessor(slc);
        slc.setSuccessor(sm);

        //向链上的第一个对象发出处理的请求
        return ssc.sale(user, customer, saleModel);
    }
}
