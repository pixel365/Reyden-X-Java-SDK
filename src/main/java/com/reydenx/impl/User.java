package com.reydenx.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.reydenx.IClient;
import com.reydenx.models.BalanceModel;
import com.reydenx.models.UserModel;

/**
 * Class for obtaining information about the user's account status and his account
 * 
 * @since 1.0
 */
public class User {
    private IClient client;

    public User(IClient client) {
        this.client = client;
    }

    /**
     * User Account
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * UserModel result = client.getUserInstance().account();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.UserModel}
     * @throws Throwable
     * 
     * @see <a href="https://api.reyden-x.com/docs#/User/get_user_v1_user__get">Schema</a>
     */
    public UserModel account() throws Throwable {
        return this.client.<UserModel>get("/user/", new TypeReference<UserModel>() {});
    }

    /**
     * User Balance
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * BalanceModel result = client.getUserInstance().balance();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.BalanceModel}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/User/get_balance_v1_user_balance__get">Schema</a>
     */
    public BalanceModel balance() throws Throwable {
        return this.client.<BalanceModel>get("/user/balance/",
                new TypeReference<BalanceModel>() {});
    }
}
