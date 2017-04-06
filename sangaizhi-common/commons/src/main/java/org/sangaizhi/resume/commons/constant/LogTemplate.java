/********************************************
 * 文件名称: LogTemplate
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
package org.sangaizhi.resume.commons.constant;

/**
 * 日志模板
 */
public class LogTemplate {


    /**
     * 错误日志模板 [resume][说明](参数json)
     */
    public final static String LOG_ERROR_MODEL = "[resume][{}]({})";

    /**
     * 业务异常日志模板 [resume][说明](参数json)
     */
    public final static String LOG_EXCEPTION_MODEL = "[resume][{}]({})";

    /**
     * 删除业务日志模板 [resume][说明](参数json)
     */
    public final static String LOG_EXCEPTION_MODEL_DELETE = "[resume][DELETE][{}]({})";

    /**
     * 新增业务日志模板 [resume][ADD][说明](参数json)
     */
    public final static String LOG_INFO_MODEL_ADD = "[resume][ADD][{}]({})";

    /**
     * 修改业务日志模板 [resume][UPDATE][说明](参数json)
     */
    public final static String LOG_INFO_MODEL_UPDATE = "[resume][UPDATE][{}][old]({})[new]({})";

    /**
     * 业务流日志模板 [resume][说明](参数json)
     */
    public final static String LOG_INFO_MODEL_BUSSINESS = "[resume][{}]({})";

    /**
     * 业务起始日志模板 [resume][说明][start](参数json)
     */
    public final static String LOG_INFO_MODEL_BUSSINESS_START = "[resume][{}][start]({})";

    /**
     * 业务结束日志模板 [resume][说明][end](参数json)
     */
    public final static String LOG_INFO_MODEL_BUSSINESS_END = "[resume][{}][end]({})";
}
