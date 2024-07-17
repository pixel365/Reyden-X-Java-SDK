package com.reydenx.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.reydenx.IClient;
import com.reydenx.models.ActionModel;
import com.reydenx.models.IdAndQuantityModel;
import com.reydenx.models.ResultModel;
import com.reydenx.models.TaskStatusModel;

/**
 * Class for managing an existing order and checking the status of an order
 * operation
 * 
 * @since 1.0
 */
public class Action {
    private IClient client;
    private String endpointPrefix = "/orders/";
    private TypeReference<ResultModel<ActionModel>> typeRef;

    public Action(IClient client) {
        this.client = client;
        this.typeRef = new TypeReference<ResultModel<ActionModel>>() {
        };
    }

    /**
     * @param path API endpoint relative path
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     */
    protected ResultModel<ActionModel> r(String path) throws Throwable {
        return this.client.<ResultModel<ActionModel>>patch(path, null, typeRef);
    }

    protected ResultModel<ActionModel> r(String path, Map<String, String> payload) throws Throwable {
        return this.client.<ResultModel<ActionModel>>patch(path, payload.toString(), typeRef);
    }

    protected Map<String, String> launchModeParams(String mode, Integer delayTime) {
        Map<String, String> payload = new HashMap<String, String>();
        payload.put("mode", mode);
        payload.put("delay_time", delayTime.toString());
        return payload;
    }

    /**
     * Run the order
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionInstance().launchOrder(123456);
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
     * ResultModel<ActionModel> result = client.getActionInstance().stopOrder(123456);
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
     * ResultModel<ActionModel> result = client.getActionInstance().cancelOrder(123456);
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
     * ResultModel<ActionModel> result = client.getActionInstance().increaseOff(123456);
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
     * ResultModel<ActionModel> result = client.getActionInstance().changeOnlineValue(123456, 100);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value   The value to be set for this operation
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
     * ResultModel<ActionModel> result = client.getActionInstance().changeIncreaseValue(123456, 100);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value   The value to be set for this operation
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
     * ResultModel<ActionModel> result = client.getActionInstance().increaseOn(123456, 100);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value   The value to be set for this operation
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
     * ResultModel<ActionModel> result = client.getActionInstance().addViews(123456, 10000);
     * }</pre>
     * 
     * @param orderId Order Id
     * @param value   The value to be set for this operation
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
     * ResultModel<ActionModel> result = client.getActionInstance().taskStatus(123456, "TASK_ID");
     * }</pre>
     * 
     * @param orderId Order Id
     * @param taskId  Task Id
     * @return {@link com.reydenx.models.TaskStatusModel}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/order_get_task_status_v1_orders__order_id__task__task_id__status__get">Schema</a>
     */
    public TaskStatusModel taskStatus(Integer orderId, String taskId) throws Throwable {
        return this.client.<TaskStatusModel>get(
                endpointPrefix + orderId + "/task/" + taskId + "/status/",
                new TypeReference<TaskStatusModel>() {
                });
    }

    /**
     * Change Order launch mode to AUTO
     * 
     * <br/>
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionInstance().changeLaunchModeToAuto(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/change_launch_params_v1_orders__order_id__action_change_launch__patch">Schema</a>
     */
    public ResultModel<ActionModel> changeLaunchModeToAuto(Integer orderId) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/change/launch/",
                this.launchModeParams("auto", 0));
    }

    /**
     * Change Order launch mode to MANUAL
     * 
     * <br/>
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionInstance().changeLaunchModeToManual(123456);
     * }</pre>
     * 
     * @param orderId Order Id
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/change_launch_params_v1_orders__order_id__action_change_launch__patch">Schema</a>
     */
    public ResultModel<ActionModel> changeLaunchModeToManual(Integer orderId) throws Throwable {
        return this.r(endpointPrefix + orderId + "/action/change/launch/",
                this.launchModeParams("manual", 0));
    }

    /**
     * Change Order launch mode to DELAY
     * 
     * <br/>
     * 
     * <pre>
     * <b>Example:</b>{@code
     * Client client = new Client("USERNAME", "PASSWORD");
     * ResultModel<ActionModel> result = client.getActionInstance().changeLaunchModeToDelay(123456, 15);
     * }</pre>
     * 
     * @param orderId   Order Id
     * @param delayTime Delay Time in minutes
     * @return {@link com.reydenx.models.ResultModel<ActionModel>}
     * @throws Throwable
     * 
     * @see <a href=
     *      "https://api.reyden-x.com/docs#/Orders/change_launch_params_v1_orders__order_id__action_change_launch__patch">Schema</a>
     */
    public ResultModel<ActionModel> changeLaunchModeToDelay(Integer orderId, Integer delayTime) throws Throwable {
        if (delayTime < 5 || delayTime > 240) {
            throw new IllegalArgumentException("The number of minutes for delayed start should be from 5 to 240");
        }

        return this.r(endpointPrefix + orderId + "/action/change/launch/",
                this.launchModeParams("delay", delayTime));
    }
}
