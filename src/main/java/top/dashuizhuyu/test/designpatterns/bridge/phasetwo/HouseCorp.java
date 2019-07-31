package top.dashuizhuyu.test.designpatterns.bridge.phasetwo;

public class HouseCorp extends Corp {

    /**
     * 构造函数，由子类定义传递具体的产品进来
     *
     * @param house 产品
     */
    public HouseCorp(House house) {
        super(house);
    }

    /**
     * 房地产公司很High了，赚钱，计算利润
     */
    @Override
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了……");
    }


}
