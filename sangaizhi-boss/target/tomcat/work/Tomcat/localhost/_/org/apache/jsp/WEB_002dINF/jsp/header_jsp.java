/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-06 09:25:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"header-section\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!--toggle button start-->\r\n");
      out.write("\t\t<a class=\"toggle-btn\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("\t\t<!--toggle button end-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--search start-->\r\n");
      out.write("\t\t<form class=\"searchform\"\r\n");
      out.write("\t\t\taction=\"http://view.jqueryfuns.com/2014/4/10/7_df25ceea231ba5f44f0fc060c943cdae/index.html\"\r\n");
      out.write("\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t<input type=\"text\" class=\"form-control\" name=\"keyword\"\r\n");
      out.write("\t\t\t\tplaceholder=\"Search here...\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!--search end-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--notification menu start -->\r\n");
      out.write("\t\t<div class=\"menu-right\">\r\n");
      out.write("\t\t\t<ul class=\"notification-menu\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-default dropdown-toggle info-number\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"> <i class=\"fa fa-tasks\"></i> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"badge\">8</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-head pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"title\">You have 8 pending task</h5>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-list user-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Database update</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width: 40%\" aria-valuemax=\"100\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"40\" role=\"progressbar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"progress-bar progress-bar-warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"\">40%</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Dashboard done</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width: 90%\" aria-valuemax=\"100\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"90\" role=\"progressbar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"progress-bar progress-bar-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"\">90%</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Web Development</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width: 66%\" aria-valuemax=\"100\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"66\" role=\"progressbar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"progress-bar progress-bar-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"\">66% </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Mobile App</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width: 33%\" aria-valuemax=\"100\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"33\" role=\"progressbar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"progress-bar progress-bar-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"\">33% </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"task-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>Issues fixed</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width: 80%\" aria-valuemax=\"100\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"80\" role=\"progressbar\" class=\"progress-bar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"\">80% </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\">See All Pending Task</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-default dropdown-toggle info-number\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"> <i class=\"fa fa-envelope-o\"></i> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"badge\">5</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-head pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"title\">You have 5 Mails</h5>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-list normal-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\"> <span class=\"thumb\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/photos/user1.png\" alt=\"\" /></span> <span class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"name\">John Doe <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"badge badge-success\">new</span></span> <span class=\"msg\">Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet...</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"> <span class=\"thumb\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/photos/user2.png\" alt=\"\" /></span> <span class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"name\">Jonathan Smith</span> <span class=\"msg\">Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet...</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"> <span class=\"thumb\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/photos/user3.png\" alt=\"\" /></span> <span class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"name\">Jane Doe</span> <span class=\"msg\">Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet...</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"> <span class=\"thumb\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/photos/user4.png\" alt=\"\" /></span> <span class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"name\">Mark Henry</span> <span class=\"msg\">Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet...</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\"> <span class=\"thumb\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"../images/photos/user5.png\" alt=\"\" /></span> <span class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"name\">Jim Doe</span> <span class=\"msg\">Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet...</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\">Read All Mails</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-default dropdown-toggle info-number\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"> <i class=\"fa fa-bell-o\"></i> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"badge\">4</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-head pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"title\">Notifications</h5>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-list normal-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label label-danger\"><i class=\"fa fa-bolt\"></i></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"name\">Server #1 overloaded. </span> <em class=\"small\">34\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmins</em>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label label-danger\"><i class=\"fa fa-bolt\"></i></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"name\">Server #3 overloaded. </span> <em class=\"small\">1\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thrs</em>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label label-danger\"><i class=\"fa fa-bolt\"></i></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"name\">Server #5 overloaded. </span> <em class=\"small\">4\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thrs</em>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"label label-danger\"><i class=\"fa fa-bolt\"></i></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"name\">Server #31 overloaded. </span> <em class=\"small\">4\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thrs</em>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"new\"><a href=\"\">See All Notifications</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"btn btn-default dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"../images/photos/user-avatar.png\" alt=\"\" /> John Doe <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-usermenu pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-cog\"></i> Settings</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-sign-out\"></i> Log Out</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--notification menu end -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
