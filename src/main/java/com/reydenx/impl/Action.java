package com.reydenx.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.reydenx.IClient;
import com.reydenx.models.ActionModel;
import com.reydenx.models.ResultModel;
import com.reydenx.models.TaskStatusModel;

/**
 * Class for managing an existing order and checking the status of an order operation
 * 
 * @since 1.0
 */
public class Action {
    private IClient client;
    private String endpointPrefix = "/orders/";
    private TypeReference<ResultModel<ActionModel>> typeRef;

    public Action(IClient client) {
        this.client = client;
        this.typeRef = new TypeReference<ResultModel<ActionModel>>() {};
    }

    private ResultModel<ActionModel> r(String path) throws Throwable {
        return this.client.<ResultModel<ActionModel>>patch(path, null, typeRef);
    }

    /**
     * Run the order
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().launchOrder(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_run_v1_orders__order_id__action_run__patch">Schema</a>
     */
    public ResultModel<ActionModel> launchOrder(Integer orderId) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/run/");
    }

    /**
     * Stop the order
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().stopOrder(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_stop_v1_orders__order_id__action_stop__patch">Schema</a>
     */
    public ResultModel<ActionModel> stopOrder(Integer orderId) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/stop/");
    }

    /**
     * Cancel the order
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().cancelOrder(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_cancel_v1_orders__order_id__action_cancel__patch">Schema</a>
     */
    public ResultModel<ActionModel> cancelOrder(Integer orderId) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/cancel/");
    }

    /**
     * Disable smooth increase of viewers
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().increaseOff(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/increase_off_v1_orders__order_id__action_increase_off__patch">Schema</a>
     */
    public ResultModel<ActionModel> increaseOff(Integer orderId) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/increase/off/");
    }

    /**
     * Change the number of viewers
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().changeOnlineValue(123456, 100);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value The value to be set for this operation
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_change_online_v1_orders__order_id__action_change_online__value___patch">Schema</a>
     */
    public ResultModel<ActionModel> changeOnlineValue(Integer orderId, Integer value)
            throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/change/online/" + value + "/");
    }

    /**
     * Change the time of the smooth set of viewers
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result =
     *         client.getActionsInstance().changeIncreaseValue(123456, 100);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value The value to be set for this operation
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/change_increase_value_v1_orders__order_id__action_increase_change__value___patch">Schema</a>
     */
    public ResultModel<ActionModel> changeIncreaseValue(Integer orderId, Integer value)
            throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/increase/change/" + value + "/");
    }

    /**
     * Enable smooth increase of viewers
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().increaseOn(123456, 100);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value The value to be set for this operation
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/increase_on_v1_orders__order_id__action_increase_on__value___patch">Schema</a>
     */
    public ResultModel<ActionModel> increaseOn(Integer orderId, Integer value) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/increase/on/" + value + "/");
    }

    /**
     * Add views to order
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().addViews(123456, 10000);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value The value to be set for this operation
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see com.reydenx.impl.Action#taskStatus(Integer, String)
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/add_views_v1_orders__order_id__action_add_views__value___patch">Schema</a>
     */
    public ResultModel<ActionModel> addViews(Integer orderId, Integer value) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/add/views/" + value + "/");
    }

    /**
     * Check the task status
     * 
     * <br/>
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionsInstance().taskStatus(123456, "TASK_ID"");
     * }</pre>
     * 
     * @param orderId Order Id
     * @param taskId Task Id
     * @return {@link com.reydenx.models.TaskStatusModel}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_get_task_status_v1_orders__order_id__task__task_id__status__get">Schema</a>
     */
    public TaskStatusModel taskStatus(Integer orderId, String taskId) throws Throwable {
        return this.client.<TaskStatusModel>get(
                endpointPrefix + orderId + "/task/" + taskId + "/status/",
                new TypeReference<TaskStatusModel>() {});
    }
}
