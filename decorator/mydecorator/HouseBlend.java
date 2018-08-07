package designmodel.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 黑咖啡
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
        }

        public double cost(){
        return .89;
        }
}
