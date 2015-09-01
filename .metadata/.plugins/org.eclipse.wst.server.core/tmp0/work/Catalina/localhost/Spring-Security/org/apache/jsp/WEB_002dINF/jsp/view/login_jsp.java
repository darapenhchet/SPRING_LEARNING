/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2015-09-01 10:18:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html lang=\"en\" ng-app=\"StarterApp\">\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=RobotoDraft:300,400,500,700,400italic\">\r\n");
      out.write("<meta name=\"viewport\" content=\"initial-scale=1\" />\r\n");
      out.write("<style>\r\n");
      out.write(".md-toolbar-tools h1 {\r\n");
      out.write("\tfont-size: inherit;\r\n");
      out.write("\tfont-weight: inherit;\r\n");
      out.write("\tmargin: inherit;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body layout=\"column\" ng-controller=\"AppCtrl\">\r\n");
      out.write("\t<md-toolbar layout=\"row\">\r\n");
      out.write("\t<div class=\"md-toolbar-tools\">\r\n");
      out.write("\t\t<md-button ng-click=\"toggleSidenav('left')\" hide-gt-sm\r\n");
      out.write("\t\t\tclass=\"md-icon-button\"> <md-icon aria-label=\"Menu\"\r\n");
      out.write("\t\t\tmd-svg-icon=\"https://s3-us-west-2.amazonaws.com/s.cdpn.io/68133/menu.svg\"></md-icon>\r\n");
      out.write("\t\t</md-button>\r\n");
      out.write("\t\t<h1>Spring Security</h1>\r\n");
      out.write("\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</md-toolbar>\r\n");
      out.write("\t<div layout=\"row\" flex>\r\n");
      out.write("\t\t<md-sidenav layout=\"column\" class=\"md-sidenav-left md-whiteframe-z5\"\r\n");
      out.write("\t\t\tmd-component-id=\"left\" md-is-locked-open=\"$mdMedia('gt-sm')\">\r\n");
      out.write("\r\n");
      out.write("\t\t</md-sidenav>\r\n");
      out.write("\t\t<div layout=\"column\" flex id=\"content\">\r\n");
      out.write("\t\t\t<md-content layout=\"column\" flex class=\"md-padding\">\r\n");
      out.write("\t\t\t<form action=\"login\" method=\"POST\">\r\n");
      out.write("\t\t\t<h1>Sign In</h1>\r\n");
      out.write("\t\t\t\t<md-input-container> \r\n");
      out.write("\t\t\t\t\t<label>Username</label> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\"> \r\n");
      out.write("\t\t\t\t</md-input-container> \r\n");
      out.write("\t\t\t\t<md-input-container>\r\n");
      out.write("\t\t\t\t\t<label>Password</label> \r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\"> \r\n");
      out.write("\t\t\t\t</md-input-container>\r\n");
      out.write("\t\t\t\t<section layout=\"row\" layout-sm=\"column\" layout-align=\"center center\" layout-wrap>\r\n");
      out.write("\t\t\t\t\t<!-- <md-button class=\"md-raised\">Button</md-button> -->\r\n");
      out.write("\t\t\t\t\t<md-button class=\"md-raised md-primary\" type=\"submit\">Sign In</md-button>\r\n");
      out.write("\t\t\t\t\t<md-button class=\"md-raised md-primary\">Cancel</md-button>\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t<md-button ng-disabled=\"true\" class=\"md-raised md-primary\">Disabled</md-button>\r\n");
      out.write("\t\t\t\t\t<md-button class=\"md-raised md-warn\">Warn</md-button>\r\n");
      out.write("\t\t\t\t\t<div class=\"label\">Raised</div> -->\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t</md-content>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Angular Material Dependencies -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-animate.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular-aria.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/angular_material/0.9.4/angular-material.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar app = angular.module('StarterApp', [ 'ngMaterial' ]);\r\n");
      out.write("\r\n");
      out.write("\t\tapp.controller('AppCtrl', [ '$scope', '$mdSidenav',\r\n");
      out.write("\t\t\t\tfunction($scope, $mdSidenav) {\r\n");
      out.write("\t\t\t\t\t$scope.toggleSidenav = function(menuId) {\r\n");
      out.write("\t\t\t\t\t\t$mdSidenav(menuId).toggle();\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t} ])\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
