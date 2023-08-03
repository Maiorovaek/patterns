import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, PersonBean> dataDB = new HashMap<>();

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    private void initializeDatabase() {
       PersonBean joe = new PersonBeanImpl();
       joe.setName("Joe Storder");
       joe.setInterests("cars, computers, music");
       joe.setGender("m");
       joe.setHotOrNotRating(6);
       dataDB.put(joe.getName(), joe);

        PersonBean konor = new PersonBeanImpl();
        konor.setName("Konor Klosure");
        konor.setInterests("ebay, movies, sky");
        konor.setGender("m");
        konor.setHotOrNotRating(7);
        dataDB.put(konor.getName(), konor);


    }

    private void drive() {
        PersonBean joe = getPersonFromDatabase("Joe Storder");

        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is:  " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println(ownerProxy.getInterests());
        System.out.println("Interests set from owner proxy");
        System.out.println("--------------------------------");

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        System.out.println("--------------------------------");

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go!!!");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());


    }

    private PersonBean getPersonFromDatabase(String name) {
        return  (PersonBean) dataDB.get(name);
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        //Заместитель строится динамически вызовом метода Proxy.newProxyInstance()
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getOwnerProxy(PersonBean person) {
        //Заместитель строится динамически вызовом метода Proxy.newProxyInstance()
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }
}
