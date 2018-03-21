package chain;

import org.apache.commons.lang3.StringUtils;

/**
 * @author gukepeng
 * @create 2018/3/21
 */
public class SaleDataCheck extends SaleHandler{
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println("2.数据检查");
        if(StringUtils.isBlank(user)||StringUtils.isBlank(customer)
                ||saleModel==null){
            System.out.println("入参不能为空");
            return false;
        }
        return this.successor.sale(user,customer,saleModel);
    }
}
