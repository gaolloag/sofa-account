package com.account.manager.impl;

import com.account.manager.AccountManager;

import org.springframework.stereotype.Service;


/**
 * @author gaoliang
 */
@Service
public class AccountManagerImpl implements AccountManager {


    @Override
    public void create() {

        System.out.println("创建用户Manager");
    }
}