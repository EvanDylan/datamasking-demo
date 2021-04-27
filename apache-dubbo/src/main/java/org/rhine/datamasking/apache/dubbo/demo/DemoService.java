package org.rhine.datamasking.apache.dubbo.demo;

import org.rhine.datamasking.annotation.Sensitive;

public interface DemoService {

   @Sensitive
   Response sayHello(String name);

}
