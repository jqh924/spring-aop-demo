package service.impl;

import service.Service;

/**
 * Created by jinqinghua on 16/1/23.
 */

@org.springframework.stereotype.Service("serviceImpl") public class Serviceimpl implements Service {
    public void adviced(String name) {
        System.out.println("adviced: [" + name + "]");
    }

    public void adviced2(String name) {
        System.out.println("adviced2: [" + name + "]");
    }

    public void aadviced(String name) {
        System.out.println("aadviced2: [" + name + "]");
    }

    public void unadviced(String name) {
        System.out.println("unadviced: [" + name + "]");
    }

    public void throwException() {
        throw new RuntimeException();
    }
}
