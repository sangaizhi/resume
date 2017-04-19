/********************************************
 * 文件名称: EncryptUtil
 * 系统名称: sangaizhi
 * 模块名称:
 * 软件版权: 深圳中云创科技有限公司
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: saz
 * 开发时间: 2017/4/19
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 **/
package org.sangaizhi.resume.commons.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 加密工具
 */
public class EncryptUtil {


    /**
     * MD5加密
     * @param source 原字符串
     * @param iterations 加密次数 ,默认为1
     */
    public static String md5Hex(String source, Integer iterations){
        if (source == null) {
            return null;
        }
        if(null == iterations){
            iterations = 1;
        }
        String result = DigestUtils.md5Hex(source).toUpperCase();
        for(int i=1;i<iterations;i++){
            result = DigestUtils.md5Hex(result).toUpperCase();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(md5Hex("123456C9x1q5&$", 2));
    }
}
