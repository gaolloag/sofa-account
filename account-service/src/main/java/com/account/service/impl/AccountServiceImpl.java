package com.account.service.impl;

import com.account.manager.AccountManager;
import com.account.service.AccountService;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gaoliang
 */
@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    AccountManager manager;


    @Override
    public void create() {
        //manager.create();
        System.out.println("创建用户");
    }
}