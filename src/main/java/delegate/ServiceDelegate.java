package delegate;


import org.springframework.beans.factory.annotation.Autowired;
import service.Service;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class ServiceDelegate {
    @Autowired private Service service;

    public void service(String name) {
        service.adviced(name);
        service.adviced2(name);
    }

    public void setService(Service service) {
        this.service = service;
    }
}
