/********************************************
 * 文件名称: AccountTypeEnum
 * 系统名称: sangaizhi
 * 模块名称:
 * 软件版权: 深圳中云创科技有限公司
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: saz
 * 开发时间: 2017/4/18
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 **/
package org.sangaizhi.resume.commons.constant;

/**
 * 账号类型
 */
public enum AccountTypeEnum {

    NAME((short) 1, "用户名"),
    PHONE((short) 2, "电话"),
    EMAIL((short) 3, "邮箱");

    private Short value;
    private String label;

    AccountTypeEnum(Short value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Short getValue() {
        return value;
    }

    public void setValue(Short value) {
        this.value = value;
    }
}
