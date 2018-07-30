package com.account.plugin.activator;

import com.alipay.sofa.ark.exception.ArkException;
import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;

/**
 * @author gaoliang
 */
public class AccountPluginActivator implements PluginActivator {
    @Override
    public void start(PluginContext pluginContext) throws ArkException {
        //pluginContext.publishService(SamplePluginService.class, new SamplePluginServiceImpl());
        pluginContext.publishService(null,null);


    }

    @Override
    public void stop(PluginContext pluginContext) throws ArkException {


    }
}