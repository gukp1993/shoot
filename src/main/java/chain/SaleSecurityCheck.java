package chain;

/**
 * 权限检查
 *
 * @author gukepeng
 * @create 2018/3/21
 */
public class SaleSecurityCheck extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println("1.权限检查");
        //进行权限检查，简单点，就小李能通过
        if ("小李".equals(user)) {
            return this.successor.sale(user, customer, saleModel);
        } else {
            System.out.println("对不起，" + user + "没有权限");
            return false;
        }

    }
}
