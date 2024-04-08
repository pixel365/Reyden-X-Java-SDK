package com.reydenx.impl;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reydenx.IClient;
import com.reydenx.models.DateAndQuantityModel;
import com.reydenx.models.DomainStatsModel;
import com.reydenx.models.IdAndQuantityModel;
import com.reydenx.models.OnlineStatsModel;
import com.reydenx.models.OrderModel;
import com.reydenx.models.OrderParametersModel;
import com.reydenx.models.PaymentModel;
import com.reydenx.models.ResultModel;
import com.reydenx.models.TaskModel;

/**
 * Class for obtaining information about one or more orders, including detailed statistics
 * 
 * @since 1.0
 */
public class Order {
    private IClient client;
    private String endpointPrefix = "/orders/";

    public Order(IClient client) {
        this.client = client;
    }

    private <T, P> T post(String endpoint, P payload, TypeReference<T> typeReference)
            throws Throwable {
        ObjectMapper mapper = new ObjectMapper();
        String jsoString = mapper.writeValueAsString(payload);

        return this.client.<T>post(endpoint, jsoString, typeReference);
    }

    /**
     * List of all orders
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<OrderModel>> result = client.getOrdersInstance().allOrders();
     * }</pre>
     * 
     * @param cursor Optional parameter pointing to the next page of the orders list
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.OrderModel>>}
     * @throws Throwable
     * 
     * @see <a href="https://api.reyden-x.com/docs#/Orders/orders_v1_orders__get">Schema</a>
     */
    public ResultModel<List<OrderModel>> allOrders(String cursor) throws Throwable {
        StringBuilder path = new StringBuilder();
        path.append(endpointPrefix);
        if (!cursor.isEmpty()) {
            path.append(URLEncoder.encode("?cursor=" + cursor, StandardCharsets.UTF_8));
        }
        return this.client.<ResultModel<List<OrderModel>>>get(path.toString(),
                new TypeReference<ResultModel<List<OrderModel>>>() {});
    }

    /**
     * Order details
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<OrderModel> result = client.getOrdersInstance().orderDetails(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<com.reydenx.models.OrderModel>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_details_v1_orders__order_id___get">Schema</a>
     */
    public ResultModel<OrderModel> orderDetails(Integer orderId) throws Throwable {
        return this.client.<ResultModel<OrderModel>>get(this.endpointPrefix + orderId + "/",
                new TypeReference<ResultModel<OrderModel>>() {});
    }

    /**
     * Order payments
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<PaymentModel>> result = client.getOrdersInstance().orderPayments(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param cursor Optional parameter pointing to the next page of the payments list
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.PaymentModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_payments_v1_orders__order_id__payments__get">Schema</a>
     */
    public ResultModel<List<PaymentModel>> orderPayments(Integer orderId, String cursor)
            throws Throwable {
        StringBuilder path = new StringBuilder();
        path.append(endpointPrefix + orderId + "/payments/");
        if (!cursor.isEmpty()) {
            path.append(URLEncoder.encode("?cursor=" + cursor, StandardCharsets.UTF_8));
        }

        return this.client.<ResultModel<List<PaymentModel>>>get(path.toString(),
                new TypeReference<ResultModel<List<PaymentModel>>>() {});
    }

    /**
     * Detailed information about clicks
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<DateAndQuantityModel>> result =
     *         client.getOrdersInstance().orderClicksStats(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.DateAndQuantityModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_stats_clicks_v1_orders__order_id__statistics_clicks__get">Schema</a>
     */
    public ResultModel<List<DateAndQuantityModel>> orderClicksStats(Integer orderId)
            throws Throwable {
        return this.client.<ResultModel<List<DateAndQuantityModel>>>get(
                endpointPrefix + orderId + "/statistics/clicks/",
                new TypeReference<ResultModel<List<DateAndQuantityModel>>>() {});
    }

    /**
     * Detailed information about views
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<DateAndQuantityModel>> result =
     *         client.getOrdersInstance().orderViewsStats(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.DateAndQuantityModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_stats_views_v1_orders__order_id__statistics_views__get">Schema</a>
     */
    public ResultModel<List<DateAndQuantityModel>> orderViewsStats(Integer orderId)
            throws Throwable {
        return this.client.<ResultModel<List<DateAndQuantityModel>>>get(
                endpointPrefix + orderId + "/statistics/views/",
                new TypeReference<ResultModel<List<DateAndQuantityModel>>>() {});
    }

    /**
     * Detailed information about users online
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<OnlineStatsModel>> result =
     *         client.getOrdersInstance().orderOnlineStats(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.OnlineStatsModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_stats_online_v1_orders__order_id__statistics_online__get">Schema</a>
     */
    public ResultModel<List<OnlineStatsModel>> orderOnlineStats(Integer orderId) throws Throwable {
        return this.client.<ResultModel<List<OnlineStatsModel>>>get(
                endpointPrefix + orderId + "/statistics/online/",
                new TypeReference<ResultModel<List<OnlineStatsModel>>>() {});
    }

    /**
     * Detailed information about sites
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<List<DomainStatsModel>> result =
     *         client.getOrdersInstance().orderDomainsStats(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.DomainStatsModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_stats_sites_v1_orders__order_id__statistics_sites__get">Schema</a>
     */
    public ResultModel<List<DomainStatsModel>> orderDomainsStats(Integer orderId) throws Throwable {
        return this.client.<ResultModel<List<DomainStatsModel>>>get(
                endpointPrefix + orderId + "/statistics/sites/",
                new TypeReference<ResultModel<List<DomainStatsModel>>>() {});
    }

    /**
     * View statistics for multiple orders
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * List<Integer> identifiers = new ArrayList<Integer>();
     * identifiers.add(12345);
     * identifiers.add(678910);
     * ResultModel<List<IdAndQuantityModel>> result =
     *         client.getOrdersInstance().multipleOrdersViewsStats(identifiers);
     * }</pre>
     * 
     * @param ordersIdentifiers One or more order IDs
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.IdAndQuantityModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/multiple_views_v1_orders_multiple_views__post">Schema</a>
     */
    public ResultModel<List<IdAndQuantityModel>> multipleOrdersViewsStats(
            List<Integer> ordersIdentifiers) throws Throwable {
        Map<String, List<Integer>> payload = new HashMap<String, List<Integer>>();
        payload.put("identifiers", ordersIdentifiers);

        return this.<ResultModel<List<IdAndQuantityModel>>, Map<String, List<Integer>>>post(
                endpointPrefix + "multiple/views/", payload,
                new TypeReference<ResultModel<List<IdAndQuantityModel>>>() {});
    }

    /**
     * Click-through statistics for multiple orders
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * List<Integer> identifiers = new ArrayList<Integer>();
     * identifiers.add(12345);
     * identifiers.add(678910);
     * ResultModel<List<IdAndQuantityModel>> result =
     *         client.getOrdersInstance().multipleOrdersClicksStats(identifiers);
     * }</pre>
     * 
     * @param ordersIdentifiers One or more order IDs
     * @return {@link com.reydenx.models.ResultModel<List<com.reydenx.models.IdAndQuantityModel>>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/multiple_clicks_v1_orders_multiple_clicks__post">Schema</a>
     */
    public ResultModel<List<IdAndQuantityModel>> multipleOrdersClicksStats(
            List<Integer> ordersIdentifiers) throws Throwable {
        Map<String, List<Integer>> payload = new HashMap<String, List<Integer>>();
        payload.put("identifiers", ordersIdentifiers);

        return this.<ResultModel<List<IdAndQuantityModel>>, Map<String, List<Integer>>>post(
                endpointPrefix + "multiple/clicks/", payload,
                new TypeReference<ResultModel<List<IdAndQuantityModel>>>() {});
    }

    /**
     * Create new order for Twitch or Youtube stream
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * TwitchOrderParametersModel params = new TwitchOrderParametersModel();
     * params.setTwitchId(123);
     * params.setPriceId(12345);
     * params.setNumberOfViews(1000);
     * params.setNumberOfViewers(100);
     * params.setLaunchMode("auto");
     * params.setSmoothGain(new SmoothGainModel(false, 0));
     * params.setDelayTime(0);
     * params.setTwitchId(123);
     * ResultModel<TaskModel> result = client.getOrdersInstance().createOrderForStream(params);
     * }</pre>
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * YouTubeOrderParametersModel params = new YouTubeOrderParametersModel();
     * params.setChannelUrl("https://youtube.com/some_channel");
     * params.setPriceId(12345);
     * params.setNumberOfViews(1000);
     * params.setNumberOfViewers(100);
     * params.setLaunchMode("auto");
     * params.setSmoothGain(new SmoothGainModel(false, 0));
     * params.setDelayTime(0);
     * ResultModel<TaskModel> result = client.getOrdersInstance().createOrderForStream(params);
     * }</pre>
     * 
     * @param parameters {@link com.reydenx.models.TwitchOrderParametersModel} or
     *        {@link com.reydenx.models.YouTubeOrderParametersModel} instance
     * @return {@link com.reydenx.models.ResultModel<TaskModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.models.TwitchOrderParametersModel
     * @see com.reydenx.models.YouTubeOrderParametersModel
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/twitch_stream_v1_orders_create_twitch_stream__post">Schema</a>
     */
    public ResultModel<TaskModel> createOrderForStream(OrderParametersModel parameters)
            throws Throwable {
        return this.<ResultModel<TaskModel>, OrderParametersModel>post(
                endpointPrefix + "create/" + parameters.toString() + "/stream/", parameters,
                new TypeReference<ResultModel<TaskModel>>() {});
    }
}
