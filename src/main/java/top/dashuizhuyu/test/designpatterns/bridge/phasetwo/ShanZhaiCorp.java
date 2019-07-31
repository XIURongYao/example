package top.dashuizhuyu.test.designpatterns.bridge.phasetwo;

public class ShanZhaiCorp extends Corp {
    /**
     * 构造函数，由子类定义传递具体的产品进来
     *  产什么产品，不知道，等被调用的才知道
     *
     * @param product 产品
     */
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    /**
     * 狂赚钱
     */
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀……");
    }
}
