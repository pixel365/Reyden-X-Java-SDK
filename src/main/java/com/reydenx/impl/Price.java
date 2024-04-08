package com.reydenx.impl;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.reydenx.IClient;
import com.reydenx.models.PlatformEnum;
import com.reydenx.models.PriceModel;
import com.reydenx.models.ResultModel;

/**
 * Class for obtaining current tariffs for creating new orders
 * 
 * @since 1.0
 */
public class Price {
    private IClient client;
    private TypeReference<ResultModel<List<PriceModel>>> typeRef;

    public Price(IClient client) {
        this.client = client;
        this.typeRef = new TypeReference<ResultModel<List<PriceModel>>>() {};
    }

    private ResultModel<List<PriceModel>> r(String code) throws Throwable {
        return this.client.<ResultModel<List<PriceModel>>>get("/prices/" + code + "/", typeRef);
    }

    /**
     * All prices for Twitch
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<PriceModel>> result = client.getPricesInstance().twitch();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<PriceModel>>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Order#createOrderForStream(com.reydenx.models.OrderParametersModel)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Prices/prices_v1_prices__platform_code___get">Schema</a>
     */
    public ResultModel<List<PriceModel>> twitch() throws Throwable {
        return this.r(PlatformEnum.TWITCH.toString());
    }

    /**
     * All prices for YouTube
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<PriceModel>> result = client.getPricesInstance().youtube();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<PriceModel>>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Order#createOrderForStream(com.reydenx.models.OrderParametersModel)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Prices/prices_v1_prices__platform_code___get">Schema</a>
     */
    public ResultModel<List<PriceModel>> youTube() throws Throwable {
        return this.r(PlatformEnum.YOUTUBE.toString());
    }

    /**
     * All prices for GoodGame
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<PriceModel>> result = client.getPricesInstance().goodgame();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<PriceModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Prices/prices_v1_prices__platform_code___get">Schema</a>
     */
    public ResultModel<List<PriceModel>> goodGame() throws Throwable {
        return this.r(PlatformEnum.GOODGAME.toString());
    }

    /**
     * All prices for Trovo
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<PriceModel>> result = client.getPricesInstance().trovo();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<PriceModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Prices/prices_v1_prices__platform_code___get">Schema</a>
     */
    public ResultModel<List<PriceModel>> trovo() throws Throwable {
        return this.r(PlatformEnum.TROVO.toString());
    }

    /**
     * All prices for VK Play
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<PriceModel>> result = client.getPricesInstance().vkPlay();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<PriceModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Prices/prices_v1_prices__platform_code___get">Schema</a>
     */
    public ResultModel<List<PriceModel>> vkPlay() throws Throwable {
        return this.r(PlatformEnum.VKPLAY.toString());
    }
}
