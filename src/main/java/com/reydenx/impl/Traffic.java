package com.reydenx.impl;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.reydenx.IClient;
import com.reydenx.models.ResultModel;
import com.reydenx.models.TrafficModel;

/**
 * Class for obtaining statistics on the current traffic volume
 * 
 * @since 1.0
 */
public class Traffic {
    private IClient client;
    private TypeReference<ResultModel<List<TrafficModel>>> typeRef;

    public Traffic(IClient client) {
        this.client = client;
        this.typeRef = new TypeReference<ResultModel<List<TrafficModel>>>() {};
    }

    private ResultModel<List<TrafficModel>> r(String code) throws Throwable {
        return this.client.<ResultModel<List<TrafficModel>>>get("/traffic/" + code + "/", typeRef);
    }

    /**
     * Traffic statistics by country
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<TrafficModel>> result = client.getTrafficInstance().countries();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<TrafficModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Traffic/Traffic_statistics_by_country_v1_traffic_countries__get">Schema</a>
     */
    public ResultModel<List<TrafficModel>> countries() throws Throwable {
        return this.r("countries");
    }

    /**
     * Traffic statistics by language
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<TrafficModel>> result = client.getTrafficInstance().languages();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<TrafficModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Traffic/Traffic_statistics_by_country_v1_traffic_languages__get">Schema</a>
     */
    public ResultModel<List<TrafficModel>> languages() throws Throwable {
        return this.r("languages");
    }

    /**
     * Traffic statistics by device type
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<TrafficModel>> result = client.getTrafficInstance().devices();
     * }</pre>
     * 
     * @return {@link com.reydenx.models.ResultModel<List<TrafficModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Traffic/Traffic_statistics_by_country_v1_traffic_devices__get">Schema</a>
     */
    public ResultModel<List<TrafficModel>> devices() throws Throwable {
        return this.r("devices");
    }
}
