/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-05-19 09:40:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.template.view.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/ANTi_study/springmvc-hibernate-mssql/Nhom15_DHKTPM15BTT_WWW/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Nhom15_DHKTPM15BTT_WWW/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1637058602870L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"form-bg\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\" \">\r\n");
      out.write("					<div class=\"form-container\">\r\n");
      out.write("						<div class=\"left-content\">\r\n");
      out.write("							<h3 class=\"title\">Site Name</h3>\r\n");
      out.write("							<h4 class=\"sub-title\">Lorem ipsum dolor sit amet.</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"right-content\">\r\n");
      out.write("							<h3 class=\"form-title\">Login</h3>\r\n");
      out.write("\r\n");
      out.write("							<form class=\"form-horizontal\" action=\"login\"\r\n");
      out.write("								method=\"post\">\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("									<label>Username / Email</label> <input type=\"text\"\r\n");
      out.write("										class=\"form-control\" name=\"name\"\r\n");
      out.write("										value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-group\">\r\n");
      out.write("									<label>Password</label> <input type=\"password\"\r\n");
      out.write("										class=\"form-control\" name=\"pass\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<button class=\"btn signin\" type=\"submit\">Login</button>\r\n");
      out.write("								<div class=\"remember-me\">\r\n");
      out.write("									<input type=\"checkbox\" class=\"checkbox\"> <span\r\n");
      out.write("										class=\"check-label\">Remember Me</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>\r\n");
      out.write("							<a href=\"\" class=\"forgot\">Forgot Password</a> <span\r\n");
      out.write("								class=\"separator\">OR</span>\r\n");
      out.write("							<ul class=\"social-links\">\r\n");
      out.write("								<fb:login-button scope=\"public_profile,email\"\r\n");
      out.write("									onlogin=\"checkLoginState();\">\r\n");
      out.write("								</fb:login-button>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<span class=\"signup-link\">Don't have an account? Sign up <a\r\n");
      out.write("								href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/registerform\">here</a>\r\n");
      out.write("							</span>\r\n");
      out.write("							<div id=\"status\"></div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- 				facebook -->\r\n");
      out.write("	<script>\r\n");
      out.write("		function statusChangeCallback(response) {\r\n");
      out.write("			console.log('statusChangeCallback');\r\n");
      out.write("			console.log(response);\r\n");
      out.write("			if (response.status === 'connected') {\r\n");
      out.write("				testAPI();\r\n");
      out.write("			} else {\r\n");
      out.write("				document.getElementById('status').innerHTML = 'Please log '\r\n");
      out.write("						+ 'into this app.';\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		function checkLoginState() {\r\n");
      out.write("			FB.getLoginStatus(function(response) {\r\n");
      out.write("				statusChangeCallback(response);\r\n");
      out.write("			});\r\n");
      out.write("			FB.api('/me', {\r\n");
      out.write("				fields : ' name, email, id'\r\n");
      out.write("			}, function(response) {\r\n");
      out.write("				console.log(response);\r\n");
      out.write("				/*  window.location.href = '/WebBanHangQuanAo/login?name='+response.name+'&id='+response.id; */\r\n");
      out.write("				window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/loginfb?name='\r\n");
      out.write("						+ response.name + '&id=' + response.id + '&email='\r\n");
      out.write("						+ response.email;\r\n");
      out.write("				// 					    	  USER-ID?fields=id,name,email,picture&access_token=ACCESS-TOKEN\r\n");
      out.write("				// 				window.location.href = '/WebBanHangQuanAo/login?name='+response.name;\r\n");
      out.write("				// 				window.location.href = '/WebBanHangQuanAo/login';\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		window.fbAsyncInit = function() {\r\n");
      out.write("			FB.init({\r\n");
      out.write("				appId : '395679735650428',\r\n");
      out.write("				cookie : true,\r\n");
      out.write("				xfbml : true,\r\n");
      out.write("				version : 'v12.0'\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("			FB.getLoginStatus(function(response) {\r\n");
      out.write("				statusChangeCallback(response);\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("		};\r\n");
      out.write("\r\n");
      out.write("		(function(d, s, id) {\r\n");
      out.write("			var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("			if (d.getElementById(id))\r\n");
      out.write("				return;\r\n");
      out.write("			js = d.createElement(s);\r\n");
      out.write("			js.id = id;\r\n");
      out.write("			js.src = \"//connect.facebook.net/en_US/sdk.js\";\r\n");
      out.write("			fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("		}(document, 'script', 'facebook-jssdk'));\r\n");
      out.write("\r\n");
      out.write("		function testAPI() {\r\n");
      out.write("			console.log('Welcome!  Fetching your information.... ');\r\n");
      out.write("			FB\r\n");
      out.write("					.api(\r\n");
      out.write("							'/me',\r\n");
      out.write("							function(response) {\r\n");
      out.write("								console.log('Successful login for: '\r\n");
      out.write("										+ response.name);\r\n");
      out.write("								document.getElementById('status').innerHTML = 'Thanks for logging in, '\r\n");
      out.write("										+ response.name + '!';\r\n");
      out.write("							});\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/template/view/customer/login.jsp(12,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/assets/css/login.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/template/view/customer/login.jsp(15,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/assets/css/bootstrap.min.css");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
