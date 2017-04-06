/********************************************
 * 文件名称: ResumeResult
 * 系统名称: sangaizhi
 * 模块名称:
 * 软件版权: 深圳中云创科技有限公司
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: saz
 * 开发时间: 2017/4/6
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 **/
package org.sangaizhi.resume.commons.vo;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自定义响应数据结构
 */
public class ResumeResult {
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Boolean status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static ResumeResult build(Boolean status, String msg, Object data) {
        return new ResumeResult(status, msg, data);
    }

    public static ResumeResult ok(Object data) {
        return new ResumeResult(data);
    }

    public static ResumeResult ok() {
        return new ResumeResult(null);
    }

    public ResumeResult() {

    }

    public static ResumeResult build(Boolean status, String msg) {
        return new ResumeResult(status, msg, null);
    }

    public ResumeResult(Boolean status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResumeResult(Object data) {
        this.status =true;
        this.msg = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为ResumeResult对象
     *
     * @param jsonData json数据
     * @param clazz ResumeResult中的object类型
     * @return
     */
    public static ResumeResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, ResumeResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").asBoolean(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static ResumeResult format(String json) {
        try {
            return MAPPER.readValue(json, ResumeResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    public static ResumeResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").asBoolean(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}
