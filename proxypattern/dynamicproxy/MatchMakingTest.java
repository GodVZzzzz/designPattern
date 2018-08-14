package designpattern.proxypattern.dynamicproxy;

/**
 * @author Zhang
 * @date 2018/8/14
 * @Description
 */
public class MatchMakingTest {

    public static void main(String[] args) {
        MatchMakingTest test = new MatchMakingTest();
        test.drive();
    }

    public void drive(){
        PersonBean joe = new PersonBeanImpl("Joe","male","play game",0,0);
        PersonBean ownerProxy = PersonProxy.getOwnerProxy(joe);
        System.out.println("Name is "+ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is "+ownerProxy.getHotOrNotRating());


        PersonBean nonOwnerProxy = PersonProxy.getNonOwnerProxy(joe);
        System.out.println("Name is "+nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("watch TV");
        }catch (Exception e){
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is "+nonOwnerProxy.getHotOrNotRating());
    }
}
