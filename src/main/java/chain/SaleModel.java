package chain;

/**
 * @author gukepeng
 * @create 2018/3/21
 */
public class SaleModel {
    private String goods;//销售的商品
    private int saleNum;//销售的数量

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "SaleModel{" +
                "goods='" + goods + '\'' +
                ", saleNum=" + saleNum +
                '}';
    }
}
