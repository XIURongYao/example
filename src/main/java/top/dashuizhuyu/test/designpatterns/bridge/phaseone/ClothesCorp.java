package top.dashuizhuyu.test.designpatterns.bridge.phaseone;

public class ClothesCorp extends Corp {

    /**
     * 服装公司生产的就是衣服了
     */
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服……");
    }

    /**
     * 服装公司卖服装，可只卖服装，不卖穿衣服的模特
     */
    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服……");
    }

    /**
     * 服装公司不景气，但怎么说也是赚钱行业
     */
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚小钱……");
    }
}
