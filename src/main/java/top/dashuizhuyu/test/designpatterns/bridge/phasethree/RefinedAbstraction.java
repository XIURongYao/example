package top.dashuizhuyu.test.designpatterns.bridge.phasethree;

/**
 * 具体抽象化角色
 */
public class RefinedAbstraction extends Abstraction {
    /**
     * 约束子类必须实现该构造函数
     *
     * @param _imp 实现化角色
     */
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }

    /**
     * 修正父类的行为
     */
    @Override
    public void request(){
        // 业务处理……
        super.request();
        super.getImp().doAnything();
    }
}
