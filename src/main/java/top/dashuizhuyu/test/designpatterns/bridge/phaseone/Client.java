package top.dashuizhuyu.test.designpatterns.bridge.phaseone;

/**
 * 场景类
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("-------房地产公司是这样运行的-------");
        // 先找到我的公司
        HouseCorp houseCorp = new HouseCorp();
        // 看我怎么赚钱
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-------服装公司是这样运行的-------");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
        // 山寨公司是这样运行的
        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();


    }



}
