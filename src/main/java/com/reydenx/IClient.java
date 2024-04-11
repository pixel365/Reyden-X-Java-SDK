package com.reydenx;

import com.fasterxml.jackson.core.type.TypeReference;
import com.reydenx.exceptions.ReydenXException;
import com.reydenx.impl.Action;
import com.reydenx.impl.Order;
import com.reydenx.impl.Price;
import com.reydenx.impl.Traffic;
import com.reydenx.impl.User;

/**
 * API Client Interface
 * 
 * @since 1.0
 */
public interface IClient {
        /**
         * Implements a GET request to the API
         * 
         * @param <T> Any Model
         * @param endpoint API endpoint relative path
         * @param typeReference {@link com.fasterxml.jackson.core.type.TypeReference} of model
         * @return Any Model
         * @throws ReydenXException
         */
        <T> T get(String endpoint, TypeReference<T> typeReference) throws ReydenXException;

        /**
         * Implements a POST request to the API
         * 
         * @param <T> Any Model
         * @param endpoint API endpoint relative path
         * @param payload Request data
         * @param typeReference {@link com.fasterxml.jackson.core.type.TypeReference} of model
         * @return Any Model
         * @throws ReydenXException
         */
        <T> T post(String endpoint, String payload, TypeReference<T> typeReference)
                        throws ReydenXException;

        /**
         * Implements a PATCH request to the API
         * 
         * @param <T> Any Model
         * @param endpoint API endpoint relative path
         * @param payload Request data
         * @param typeReference {@link com.fasterxml.jackson.core.type.TypeReference} of model
         * @return Any Model
         * @throws ReydenXException
         */
        <T> T patch(String endpoint, String payload, TypeReference<T> typeReference)
                        throws ReydenXException;

        /**
         * Implements a DELETE request to the API
         * 
         * @param endpoint API endpoint relative path
         * @throws ReydenXException
         */
        void delete(String endpoint) throws ReydenXException;

        /**
         * @return Is {@link com.reydenx.models.TokenModel} valid and not expired?
         */
        boolean isAuthenticated();

        /**
         * Updates the currently valid token
         * 
         * @throws ReydenXException
         */
        void refreshToken() throws ReydenXException;

        /**
         * Revokes the currently valid token
         * 
         * @throws ReydenXException
         */
        void revokeToken() throws ReydenXException;

        /**
         * Obtaining a {@link com.reydenx.models.TokenModel} for working with the API
         * 
         * @throws ReydenXException
         */
        void authentication() throws ReydenXException;

        /**
         * @return {@link com.reydenx.impl.Action} instance
         */
        Action getActionInstance();

        /**
         * @return {@link com.reydenx.impl.Order} instance
         */
        Order getOrderInstance();

        /**
         * @return {@link com.reydenx.impl.Price} instance
         */
        Price getPriceInstance();

        /**
         * @return {@link com.reydenx.impl.Traffic} instance
         */
        Traffic getTrafficInstance();

        /**
         * @return {@link com.reydenx.impl.User} instance
         */
        User getUserInstance();
}
