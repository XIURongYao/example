package top.dashuizhuyu.test.designpatterns.bridge.phasethree;

public abstract class Abstraction {

    /**
     * 定义对实现化角色的引用
     */
    private Implementor imp;

    /**
     * 约束子类必须实现该构造函数
     * @param _imp 实现化角色
     */
    public Abstraction(Implementor _imp){
        this.imp = _imp;
    }

    /**
     * 自身的行为和属性
     */
    public void request(){
        this.imp.doAnything();
    }

    /**
     * 获得实现化角色
     * @return 实现化角色
     */
    public Implementor getImp(){
        return imp;
    }
}
