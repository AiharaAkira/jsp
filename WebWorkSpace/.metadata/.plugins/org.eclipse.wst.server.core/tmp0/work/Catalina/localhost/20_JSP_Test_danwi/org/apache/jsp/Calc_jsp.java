/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-11-10 02:50:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


		public double inchCal(double cm){
		return Math.floor(cm * 0.393701*10)/10.0 ;
	}
	public double widthCal(double m){
		return Math.floor((m * 0.3025)*10)/10.0;
	}
	public double cCal(double f){
		return Math.ceil(((f -32)*5/9)*10)/10.0;
	}
	public double kmCal(double km){
		return Math.floor((km * 0.621371)*10)/10.0;
	}
	
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

	double uInput = Double.parseDouble(request.getParameter("uInput"));
	String unit = request.getParameter("unit");
	
      out.write("\r\n");
      out.write("	<!--  ⏬ -->\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		");
if(unit.equals("cm")){
			
      out.write("\r\n");
      out.write("		<div style=\"height: auto; width: 98%; border:5px solid black; margin:5px 5px; text-align:center; color:orange; font-weight:bold; font-size:25px;\"> \r\n");
      out.write("		<div id=\"title\" style=\"height: auto; width: 96%; border:5px solid black; margin:5px auto; background-color:orange; font-size:30px; color:white; \">변환결과</div>\r\n");
      out.write("		<div id=\"result\" style=\"width: 96%; font-size:30px; color:orange;\">\r\n");
      out.write("			");
      out.print(uInput);
      out.write(" cm\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			⏬⏬⏬\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			");
      out.print( inchCal(uInput) );
      out.write(" inch\r\n");
      out.write("			</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
 }
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		");
if(unit.equals("m")){
			
      out.write("\r\n");
      out.write("		<div style=\"height: auto; width: 98%; border:5px solid black; margin:5px 5px; text-align:center; color:red; font-weight:bold; font-size:25px;\"> \r\n");
      out.write("		<div id=\"title\" style=\"height: auto; width: 96%; border:5px solid black; margin:5px auto; background-color:red; font-size:30px; color:white; \">변환결과</div>\r\n");
      out.write("		<div id=\"result\" style=\"width: 96%; font-size:30px; color:red;\">\r\n");
      out.write("			");
      out.print(uInput);
      out.write(" m2\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			⏬⏬⏬\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			");
      out.print( widthCal(uInput) );
      out.write(" 평\r\n");
      out.write("			</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
 }
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		");
if(unit.equals("f")){
			
      out.write("\r\n");
      out.write("		<div style=\"height: auto; width: 98%; border:5px solid black; margin:5px 5px; text-align:center; color:blue; font-weight:bold; font-size:25px;\"> \r\n");
      out.write("		<div id=\"title\" style=\"height: auto; width: 96%; border:5px solid black; margin:5px auto; background-color:blue; font-size:30px; color:white; \">변환결과</div>\r\n");
      out.write("		<div id=\"result\" style=\"width: 96%; font-size:30px; color:blue;\">\r\n");
      out.write("			");
      out.print(uInput);
      out.write(" ℉\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			⏬⏬⏬\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			");
      out.print( cCal(uInput) );
      out.write(" ℃\r\n");
      out.write("			</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
 }
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		");
if(unit.equals("km")){
			
      out.write("\r\n");
      out.write("		<div style=\"height: auto; width: 98%; border:5px solid black; margin:5px 5px; text-align:center; color:green; font-weight:bold; font-size:25px;\"> \r\n");
      out.write("		<div id=\"title\" style=\"height: auto; width: 96%; border:5px solid black; margin:5px auto; background-color:green; font-size:30px; color:white; \">변환결과</div>\r\n");
      out.write("		<div id=\"result\" style=\"width: 96%; font-size:30px; color:green;\">\r\n");
      out.write("			");
      out.print(uInput);
      out.write(" km/h\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			⏬⏬⏬\r\n");
      out.write("			<br><br><br>\r\n");
      out.write("			");
      out.print( kmCal(uInput) );
      out.write(" mi/h\r\n");
      out.write("			</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		");
 }
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
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
