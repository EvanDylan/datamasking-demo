package org.rhine.datamasking.apache.dubbo.demo;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class Provider implements DemoService{

    @Override
    public Response sayHello(String name) {
        Response response = new Response();
        response.name = name;
        response.age = 18;
        response.phoneNum = "18188887777";
        response.idCard = "513436200004218136";
        response.comment = "FUCK这操蛋的世界";
        return response;
    }

    public static void main(String[] args) {
        ServiceConfig<Provider> service = new ServiceConfig<>();
        service.setInterface(DemoService.class);
        service.setRef(new Provider());

        DubboBootstrap bootstrap = DubboBootstrap.getInstance();
        bootstrap.application(new ApplicationConfig("provider"))
                .service(service)
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .start()
                .await();
    }
}
