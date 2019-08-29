package org.apache.dubbo.rpc.cluster.router;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.cluster.RouterFactory;
import org.junit.jupiter.api.Test;

/**
 * @author xufeng.deng dennisdxf@gmail.com
 * @since 2019/8/28
 */
public class RouterFactoryTest {

    @Test
    public void test() {
        final RouterFactory ROUTER_FACTORY = ExtensionLoader.getExtensionLoader(RouterFactory.class)
                .getAdaptiveExtension();
        System.out.println(ROUTER_FACTORY);
    }

}
