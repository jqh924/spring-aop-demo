import delegate.ServiceDelegate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Service;

/**
 * Created by jinqinghua on 16/1/23.
 */
public class StartUp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        Service service = (Service) context.getBean("service6");
        d(service);


    }


    private static void d(Service service) {
        service.adviced("jinqinghua");
        service.adviced("fengfeng");
        service.adviced("jinqinghua");
        service.adviced("fengfeng");
        service.adviced2("jinqinghua");
        service.aadviced("jinqinghua");
        service.unadviced("suzhizhi");

        try {
            service.throwException();
        } catch (Exception e) {

        }

        ServiceDelegate sd = new ServiceDelegate();
        sd.setService(service);
        sd.service("jinqinghua");
        sd.service("fengfeng");


    }
}
