/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-06 09:29:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002duser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,\r\n");
      out.write("        user-scalable=no\" />\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\" />\r\n");
      out.write("</head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"js/layui/css/layui.css\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class='sticky-header'>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navigation.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"main-content\">\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- page heading start-->\r\n");
      out.write("\t\t<div class=\"page-heading\">\r\n");
      out.write("\t\t\t<h3>Form Validation</h3>\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Form</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\">Form Validation</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- page heading end-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--body wrapper start-->\r\n");
      out.write("\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<section class=\"panel\"> <header class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t新增用户 </header>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"cmxform form-horizontal adminex-form\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"add-user-form\" method=\"POST\" action=\"/user/addSubmit.action\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"name\" class=\"control-label col-lg-1\">名称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\" form-control\" id=\"name\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"phone\" class=\"control-label col-lg-1\">电话</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\" form-control\" id=\"phone\" name=\"phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-lg-offset-1 col-lg-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonclick=\"addUserForm.addSubmit(this)\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"reset\">清空</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- Placed js at the end of the document so the pages load faster -->\r\n");
      out.write("<!-- Placed js at the end of the document so the pages load faster -->\r\n");
      out.write("<script src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-ui-1.9.2.custom.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/modernizr.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("<script src=\"js/layui/lay/dest/layui.all.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.validate.extend.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/form.ajax.plugin.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--common scripts for all pages-->\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar layer = layui.layer;\r\n");
      out.write("\tvar addUserForm = {\r\n");
      out.write("\t\tcheckInputs : function() {\r\n");
      out.write("\t\t\tvar name = $.trim($(\"#name\").val());\r\n");
      out.write("\t\t\tvar phone = $.trim($(\"#phone\").val());\r\n");
      out.write("\t\t\tif (name == '' || name == null || name == undefined) {\r\n");
      out.write("\t\t\t\tlayer.alert(\"名称不能为空\", {\r\n");
      out.write("\t\t\t\t\ticon : 0\r\n");
      out.write("\t\t\t\t}, function(index) {\r\n");
      out.write("\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(phone == '' || phone == null || phone == undefined){\r\n");
      out.write("\t\t\t\tlayer.alert(\"电话不能为空\", {\r\n");
      out.write("\t\t\t\t\ticon : 0\r\n");
      out.write("\t\t\t\t}, function(index) {\r\n");
      out.write("\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(!sazValidate.phone(phone)){\r\n");
      out.write("\t\t\t\tlayer.alert(\"电话格式错误\", {\r\n");
      out.write("\t\t\t\t\ticon : 0\r\n");
      out.write("\t\t\t\t}, function(index) {\r\n");
      out.write("\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\taddSubmit : function(submitBtn) {\r\n");
      out.write("\t\t\t$(\"#add-user-form\").ajaxSubmit({\r\n");
      out.write("\t\t\t\tbeforeSend : function() {\r\n");
      out.write("\t\t\t\t\t$(submitBtn).attr(\"disabled\", \"disabled\");\r\n");
      out.write("\t\t\t\t\t$(submitBtn).addClass(\"disabled\");\r\n");
      out.write("\t\t\t\t\treturn addUserForm.checkInputs();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\taddUserForm.submitSuccess(result);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcomplete : function() {\r\n");
      out.write("\t\t\t\t\t$(submitBtn).removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\t$(submitBtn).removeClass(\"disabled\")\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tsubmitSuccess:function(data){\r\n");
      out.write("\t\t\tif(data.status){\r\n");
      out.write("\t\t\t\tlayer.alert(\"新增用户成功\", {\r\n");
      out.write("\t\t\t\t\ticon : 0\r\n");
      out.write("\t\t\t\t}, function(index) {\r\n");
      out.write("\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t\tlocation.href=\"/user/list-user.html\";\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tlayer.alert(data.message, {\r\n");
      out.write("\t\t\t\t\ticon : 0\r\n");
      out.write("\t\t\t\t}, function(index) {\r\n");
      out.write("\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#add-user-form\").validate({\r\n");
      out.write("\t\t\trules : {\r\n");
      out.write("\t\t\t\tname : {\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tphone : {\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\tphone : true,\r\n");
      out.write("\t\t\t\t\tremote : {\r\n");
      out.write("\t\t\t\t\t\turl : \"/user/check/phone.action\",\r\n");
      out.write("\t\t\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\taccount : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar account = $(\"#phone\").val();\r\n");
      out.write("\t\t\t\t\t\t\t\tif (account == undefined) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\taccount = -1;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\treturn account;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\tname : {\r\n");
      out.write("\t\t\t\t\trequired : \"用户名不能为空\",\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tphone : {\r\n");
      out.write("\t\t\t\t\trequired : \"电话不能为空\",\r\n");
      out.write("\t\t\t\t\tremote : \"该电话已经被占用\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}