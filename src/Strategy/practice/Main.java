package Strategy.practice;

//策略接口,计算购车总金额
interface Strategy {
    int calPrice(int price,int num);
}
//购买5辆及以下不打折
class Nodiscount implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return price * num;
    }
}
//购买6-10辆打9.5折
class Discount1 implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return (int)(price * num * 0.95);
    }
}
//购买11-20辆打9折算法实现
class Discount2 implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return (int)(price * num * 0.9);
    }
}
//购买20辆以上打8.5折算法实现
class Discount3 implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return (int)(price * num * 0.85);
    }
}
//上下文,根据不同策略来计算购车总金额
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calPrice(int price, int num) {
        //计算价格算法
        return strategy.calPrice(price,num);
    }
}

public class Main {

    //每辆车单价10000
    public static void main(String[] args) {
        Strategy strategy;
        //计算购买3辆总金额
        strategy = new Nodiscount();
        Context context = new Context(strategy);
        System.out.println("购买3辆总金额: " + context.calPrice(10000,3));
        // 计算12辆总金额
        strategy = new Discount2();
        Context context2 = new Context(strategy);
        System.out.println("购买12辆总金额: " + context2.calPrice(10000,12));
    }

}

