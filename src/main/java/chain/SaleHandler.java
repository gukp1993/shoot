package chain;

/**
 * @author gukepeng
 * @create 2018/3/21
 */
public abstract class SaleHandler {
    /*
    持有下一个处理请求的对象
     */
    protected SaleHandler successor = null;

    /**
     * 设置下一个处理请求的对象
     *
     * @param successor
     */
    public void setSuccessor(SaleHandler successor) {
        this.successor = successor;
    }

    public abstract boolean sale(String user, String customer, SaleModel saleModel);
}
