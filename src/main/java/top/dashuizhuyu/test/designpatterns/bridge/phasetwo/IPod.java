package top.dashuizhuyu.test.designpatterns.bridge.phasetwo;

public class IPod extends Product {

    @Override
    public void beProducted() {
        System.out.println("生产出来的iPod是这样的……");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了……");
    }
}
