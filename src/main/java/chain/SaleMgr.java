package chain;

/**
 * @author gukepeng
 * @create 2018/3/21
 */
public class SaleMgr extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user+"保存了"+customer+"购买"+saleModel+" 的销售数据");
        return true;
    }
}
