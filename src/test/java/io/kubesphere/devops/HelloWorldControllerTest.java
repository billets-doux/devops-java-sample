package io.kubesphere.devops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("恭喜你，完成了自动部署！！！", new HelloWorldController().sayHello());
    }
}
