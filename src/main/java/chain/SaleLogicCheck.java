package chain;

/**
 * @author gukepeng
 * @create 2018/3/21
 */
public class SaleLogicCheck extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println("3.逻辑校验");
        return this.successor.sale(user,customer,saleModel);
    }
}
