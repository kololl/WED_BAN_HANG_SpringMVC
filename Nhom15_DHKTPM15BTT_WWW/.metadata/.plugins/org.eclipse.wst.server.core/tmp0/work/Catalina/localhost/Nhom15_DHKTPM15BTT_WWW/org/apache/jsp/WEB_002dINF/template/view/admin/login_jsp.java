/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-19 16:06:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.template.view.admin;

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
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1650695708703L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Downloads/springmvc-hibernate-mssql-main/Nhom15_DHKTPM15BTT_WWW/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Nhom15_DHKTPM15BTT_WWW/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Document</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"form-bg\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<div class=\" \">\n");
      out.write("					<div class=\"form-container\">\n");
      out.write("						<div class=\"left-content\">\n");
      out.write("							<h3 class=\"title\">Site Name</h3>\n");
      out.write("							<h4 class=\"sub-title\">Lorem ipsum dolor sit amet.</h4>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"right-content\">\n");
      out.write("							<h3 class=\"form-title\">Login</h3>\n");
      out.write("\n");
      out.write("							<form class=\"form-horizontal\" action=\"adlogin\"\n");
      out.write("								method=\"post\">\n");
      out.write("								<div class=\"form-group\">\n");
      out.write("									<label>Username / Email</label> <input type=\"text\"\n");
      out.write("										class=\"form-control\" name=\"name\"\n");
      out.write("										value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("								</div>\n");
      out.write("								<div class=\"form-group\">\n");
      out.write("									<label>Password</label> <input type=\"password\"\n");
      out.write("										class=\"form-control\" name=\"pass\">\n");
      out.write("								</div>\n");
      out.write("								<button class=\"btn signin\" type=\"submit\">Login</button>\n");
      out.write("								<div class=\"remember-me\">\n");
      out.write("									<input type=\"checkbox\" class=\"checkbox\"> <span\n");
      out.write("										class=\"check-label\">Remember Me</span>\n");
      out.write("								</div>\n");
      out.write("							</form>\n");
      out.write("							<a href=\"\" class=\"forgot\">Forgot Password</a> <span\n");
      out.write("								class=\"separator\">OR</span>\n");
      out.write("							<ul class=\"social-links\">\n");
      out.write("								<li><a\n");
      out.write("									href=\"https://accounts.google.com/o/oauth2/auth?scope=profile&redirect_uri=http://localhost:8080/WebBanHangQuanAo/home&response_type=code\n");
      out.write("		   &client_id=705228605852-mro77dumg7js0i3t3lmo80rcbjf0ci2c.apps.googleusercontent.com&approval_prompt=force\"\n");
      out.write("									onclick=\"onSignIn()\"><i class=\"fab fa-google\"></i> Login\n");
      out.write("										with Google</a></li>\n");
      out.write("								<fb:login-button scope=\"public_profile,email\"\n");
      out.write("									onlogin=\"checkLoginState();\">\n");
      out.write("								</fb:login-button>\n");
      out.write("							</ul>\n");
      out.write("							<span class=\"signup-link\">Don't have an account? Sign up <a\n");
      out.write("								href=\"register.jsp\">here</a>\n");
      out.write("							</span>\n");
      out.write("							<div id=\"status\"></div>\n");
      out.write("\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<!-- 				facebook -->\n");
      out.write("	<script>\n");
      out.write("		function statusChangeCallback(response) {\n");
      out.write("			console.log('statusChangeCallback');\n");
      out.write("			console.log(response);\n");
      out.write("			if (response.status === 'connected') {\n");
      out.write("				testAPI();\n");
      out.write("			} else {\n");
      out.write("				document.getElementById('status').innerHTML = 'Please log '\n");
      out.write("						+ 'into this app.';\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		function checkLoginState() {\n");
      out.write("			FB.getLoginStatus(function(response) {\n");
      out.write("				statusChangeCallback(response);\n");
      out.write("			});\n");
      out.write("			FB.api('/me', {\n");
      out.write("				fields : ' name, email, id'\n");
      out.write("			}, function(response) {\n");
      out.write("				console.log(response);\n");
      out.write("				/*  window.location.href = '/WebBanHangQuanAo/login?name='+response.name+'&id='+response.id; */\n");
      out.write("				window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/loginfb?name='\n");
      out.write("						+ response.name + '&id=' + response.id + '&email='\n");
      out.write("						+ response.email;\n");
      out.write("				// 					    	  USER-ID?fields=id,name,email,picture&access_token=ACCESS-TOKEN\n");
      out.write("				// 				window.location.href = '/WebBanHangQuanAo/login?name='+response.name;\n");
      out.write("				// 				window.location.href = '/WebBanHangQuanAo/login';\n");
      out.write("			});\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		window.fbAsyncInit = function() {\n");
      out.write("			FB.init({\n");
      out.write("				appId : '395679735650428',\n");
      out.write("				cookie : true,\n");
      out.write("				xfbml : true,\n");
      out.write("				version : 'v12.0'\n");
      out.write("			});\n");
      out.write("\n");
      out.write("			FB.getLoginStatus(function(response) {\n");
      out.write("				statusChangeCallback(response);\n");
      out.write("			});\n");
      out.write("\n");
      out.write("		};\n");
      out.write("\n");
      out.write("		(function(d, s, id) {\n");
      out.write("			var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("			if (d.getElementById(id))\n");
      out.write("				return;\n");
      out.write("			js = d.createElement(s);\n");
      out.write("			js.id = id;\n");
      out.write("			js.src = \"//connect.facebook.net/en_US/sdk.js\";\n");
      out.write("			fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("		}(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("		function testAPI() {\n");
      out.write("			console.log('Welcome!  Fetching your information.... ');\n");
      out.write("			FB\n");
      out.write("					.api(\n");
      out.write("							'/me',\n");
      out.write("							function(response) {\n");
      out.write("								console.log('Successful login for: '\n");
      out.write("										+ response.name);\n");
      out.write("								document.getElementById('status').innerHTML = 'Thanks for logging in, '\n");
      out.write("										+ response.name + '!';\n");
      out.write("							});\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("	<!-- 				google -->\n");
      out.write("	<script>\n");
      out.write("		function onSignIn(googleUser) {\n");
      out.write("			// Useful data for your client-side scripts:\n");
      out.write("			var profile = googleUser.getBasicProfile();\n");
      out.write("			console.log(\"ID: \" + profile.getId()); // Don't send this directly to your server!\n");
      out.write("			console.log('Full Name: ' + profile.getName());\n");
      out.write("			console.log('Given Name: ' + profile.getGivenName());\n");
      out.write("			console.log('Family Name: ' + profile.getFamilyName());\n");
      out.write("			console.log(\"Image URL: \" + profile.getImageUrl());\n");
      out.write("			console.log(\"Email: \" + profile.getEmail());\n");
      out.write("\n");
      out.write("			// The ID token you need to pass to your backend:\n");
      out.write("			var id_token = googleUser.getAuthResponse().id_token;\n");
      out.write("			console.log(\"ID Token: \" + id_token);\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		function loginCallback(result) {\n");
      out.write("			if (result['status']['signed_in']) {\n");
      out.write("				var request = gapi.client.plus.people.get({\n");
      out.write("					'userId' : 'me'\n");
      out.write("				});\n");
      out.write("				request.execute(function(resp) {\n");
      out.write("					console.log(resp.emails[0].value);\n");
      out.write("					console.log(resp.displayName);\n");
      out.write("					console.log(resp.name.givenName);\n");
      out.write("					console.log(resp.image.url);\n");
      out.write("					console.log(resp.ageRange.max);\n");
      out.write("					console.log(resp.id);\n");
      out.write("					console.log(resp.etag);\n");
      out.write("					console.log(resp);\n");
      out.write("					if (resp != null) {\n");
      out.write("						window.location.href = 'Login?action=Google&name='\n");
      out.write("								+ resp.name.givenName + '&email='\n");
      out.write("								+ resp.emails[0].value + '&id=' + resp.id\n");
      out.write("								+ '&fullName=' + resp.displayName + '&image='\n");
      out.write("								+ resp.image.url + '&age=' + resp.ageRange.max\n");
      out.write("								+ '&etag=' + resp.etag;\n");
      out.write("					}\n");
      out.write("					var email = '';\n");
      out.write("					if (resp['emails']) {\n");
      out.write("						for (i = 0; i < resp['emails'].length; i++) {\n");
      out.write("							if (resp['emails'][i]['type'] == 'account') {\n");
      out.write("								email = resp['emails'][i]['value'];//here is required email id\n");
      out.write("							}\n");
      out.write("						}\n");
      out.write("					}\n");
      out.write("					var usersname = resp['displayName'];//required name\n");
      out.write("				});\n");
      out.write("			}\n");
      out.write("		}\n");
      out.write("		function onLoadCallback() {\n");
      out.write("			gapi.client.setApiKey('AIzaSyAugrM0yLLyoXkNTJJ-WpZe5NtrWvMCqTA');\n");
      out.write("			gapi.client.load('plus', 'v1', function() {\n");
      out.write("			});\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("	<script type=\"text/javascript\">\n");
      out.write("		(function() {\n");
      out.write("			var po = document.createElement('script');\n");
      out.write("			po.type = 'text/javascript';\n");
      out.write("			po.async = true;\n");
      out.write("			po.src = 'https://apis.google.com/js/client.js?onload=onLoadCallback';\n");
      out.write("			var s = document.getElementsByTagName('script')[0];\n");
      out.write("			s.parentNode.insertBefore(po, s);\n");
      out.write("		})();\n");
      out.write("	</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
      // /WEB-INF/template/view/admin/login.jsp(12,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      // /WEB-INF/template/view/admin/login.jsp(15,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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