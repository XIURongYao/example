package top.dashuizhuyu.test.designpatterns.bridge.phasetwo;

/**
 * @author dashuizhuyu@qq.com
 */
public class Clothes extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出来的衣服是这样的……");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服卖出去了……");
    }


}
