/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.4.v20170414
 * Generated at: 2017-05-09 16:57:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.enigio.tbf.DataTruck;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.HttpResponse;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.mashape.unirest.http.HttpResponse");
    _jspx_imports_classes.add("com.mashape.unirest.http.JsonNode");
    _jspx_imports_classes.add("com.enigio.tbf.DataTruck");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
DataTruck.run();
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("        <!-- If IE use the latest rendering engine -->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Set the page to the width of the device and set the zoom level -->\n");
      out.write("        <meta name=\"viewport\" content=\"width = device-width, initial-scale = 1\">\n");
      out.write("        \n");
      out.write("        <title>DataTruck</title>\n");
      out.write("        \n");
      out.write("        <!-- Bootstrap Script Requirements -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <!-- Font Links -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <!-- Our CSS -->\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            footer {\n");
      out.write("                \n");
      out.write("                color: #fff;\n");
      out.write("                width: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #204060;\n");
      out.write("                font-size: 12px;\n");
      out.write("                font-family: \"Open Sans\", Arial;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("    \n");
      out.write("            \n");
      out.write("            .page-header h1, .page-header h2, .page-header h3, .page-header h4, .page-header h5   {\n");
      out.write("               \n");
      out.write("                font-family: \"Oswald\";\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .page-header {\n");
      out.write("            \n");
      out.write("                border-bottom: none;\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn-primary {\n");
      out.write("                \n");
      out.write("                background-color: #204060;\n");
      out.write("                border: 1px solid #19334d;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1, h2, h3, h4, h5 {\n");
      out.write("                \n");
      out.write("                font-family: \"Open Sans\";\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #pageHeader {\n");
      out.write("                \n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #204060;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #icons {\n");
      out.write("                \n");
      out.write("                color: #204060;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #icons h1 {\n");
      out.write("                \n");
      out.write("                text-align:center;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #icons h4 {\n");
      out.write("                \n");
      out.write("                font-family: \"Oswald\", Helvetica;\n");
      out.write("                text-align:center;\n");
      out.write("                color: #000;\n");
      out.write("                font-size: 16px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <!-- Our Scripts -->\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            // JSON Button Selection Script.\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                \n");
      out.write("                var clickCheck = 0;\n");
      out.write("                \n");
      out.write("                /**\n");
      out.write("                * Shows and hides the \"allJson\" div. Changes button text.\n");
      out.write("                **/\n");
      out.write("                $(\"#toggleJson\").click(function(){\n");
      out.write("                \n");
      out.write("                    $(\".allJson\").toggleClass(\"hidden\");\n");
      out.write("                    \n");
      out.write("                    if (!clickCheck) {\n");
      out.write("                        \n");
      out.write("                        $(\"#viewJsonBtn\").text(\"Show Table\");\n");
      out.write("                        clickCheck = 1;\n");
      out.write("                        \n");
      out.write("                    } else {\n");
      out.write("                        \n");
      out.write("                        $(\"#viewJsonBtn\").text(\"View Raw JSON\");\n");
      out.write("                        clickCheck = 0;\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                \n");
      out.write("                }) \n");
      out.write("                \n");
      out.write("                /**\n");
      out.write("                * Toggle \"active\" class on all primary buttons.\n");
      out.write("                **/\n");
      out.write("                $(\".btn-primary\").click(function(){\n");
      out.write("                \n");
      out.write("                    $(\".btn-primary\").removeClass(\"active\");\n");
      out.write("                \n");
      out.write("                }) \n");
      out.write("                \n");
      out.write("                //Hiding all JSON containers.\n");
      out.write("                $(\".allJsonContainers\").hide();\n");
      out.write("                \n");
      out.write("                //Showing active:\n");
      out.write("                $(\"#showingJson\").show();\n");
      out.write("                \n");
      out.write("                /**\n");
      out.write("                * Showing and hiding individual JSON divs connected to their buttons.\n");
      out.write("                **/\n");
      out.write("                $(\".allJsonButtons\").click(function(){\n");
      out.write("                    \n");
      out.write("                    $(\".allJsonContainers\").hide();\n");
      out.write("                    $(\".\"+this.name).fadeIn();\n");
      out.write("                \n");
      out.write("                }) \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div id=\"pageHeader\">\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"page-header\" style=\"text-align: center;\">\n");
      out.write("\n");
      out.write("                    <h1> DataTruck <br><small style=\"color: #fff;\">Display info from the stock market, football games or the weather.</small></h1>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <!-- Home Icons -->\n");
      out.write("                <div id=\"icons\" class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("                        \n");
      out.write("                        <h1 style=\"text-align:center;\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-search\"></span> <br> \n");
      out.write("                            <h4>Inspect</h4>\n");
      out.write("                        </h1>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-1\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("                        \n");
      out.write("                        <h1>\n");
      out.write("                            <span class=\"glyphicon glyphicon-stats\"></span>\n");
      out.write("                            <h4>Graph</h4>\n");
      out.write("                        </h1>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-1\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("                        \n");
      out.write("                        <h1>\n");
      out.write("                            <span class=\"glyphicon glyphicon-eye-open\"></span>\n");
      out.write("                            <h4>Analyze</h4>\n");
      out.write("                        </h1>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-1\"></div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>    \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <div class=\"row jumbotron\">\n");
      out.write("                \n");
      out.write("                <!-- DUMMY ELEMENT -->\n");
      out.write("                <div class=\"col-lg-7 col-md-7 col-sm-5 col-xs-4\"></div>\n");
      out.write("                \n");
      out.write("                <!-- Add Data -->\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-8\">\n");
      out.write("                \n");
      out.write("                    <button id=\"toggleJson\" style=\"margin-left: 5px;\" type=\"button\" class=\"btn btn-sm btn-primary pull-right\" role=\"button\">\n");
      out.write("                        <b id=\"viewJsonBtn\" style=\"font-weight: 500;\">View Raw JSON</b>\n");
      out.write("                    </button>\n");
      out.write("                    \n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm btn-primary pull-right\" role=\"button\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-plus\"></span> / <span class=\"glyphicon glyphicon-minus\"></span> &nbsp; Manage Data\n");
      out.write("                    </button>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- DUMMY ELEMENT -->\n");
      out.write("                <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-0\"></div>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("            \n");
      out.write("                <!-- HIDDEN TABLE: Data Numbers -->\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 allJson\">\n");
      out.write("                \n");
      out.write("                    <!-- You can constrain the columns if you want -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <!-- DUMMY ELEMENT -->\n");
      out.write("                        <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-0\"></div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-lg-10 col-md-10 col-sm-10\">\n");
      out.write("\n");
      out.write("                            <!-- \n");
      out.write("\n");
      out.write("                                The table class adds nice spacing and the other classes add additional style:\n");
      out.write("\n");
      out.write("                                table-striped           - Variate the color for every other <td>\n");
      out.write("                                table-border            - Add a border to the table.\n");
      out.write("                                table-hover             - Change color when hovering a <td> \n");
      out.write("\n");
      out.write("                            -->\n");
      out.write("                            ");

                            int s = DataTruck.feeders.size();
                            for (int i = 0; i < s ; i++) {
                                int jsonArrSize = DataTruck.feeders.get(i).htmlJsonArray.length-2;
                                if ( i == 0 ) {
                            
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                                <table id=\"showingJson\" class=\"");
      out.print(DataTruck.feeders.get(i).nameOfFeeder);
      out.write(" table table-bordered table-striped table-hover allJsonContainers\">\n");
      out.write("\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                        <td colspan=\"2\">Exchange Rates, Updated ");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[1]);
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("\n");
      out.write("                                            <!-- You can adjust the width of table columns as well -->\n");
      out.write("                                            <th class=\"col-md-2\"></th>\n");
      out.write("\n");
      out.write("                                            <!-- Use text alignment like text-center or text-right -->\n");
      out.write("                                            <th class=\"text-center\">\n");
      out.write("                                                ");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[DataTruck.feeders.get(i).htmlJsonArray.length-1]);
      out.write("\n");
      out.write("                                            </th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        ");
 
                                           
                                           for (int j = 3; j < jsonArrSize; j++) { 
                                        
                                            if ( j%2 != 0) {
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                \n");
      out.write("                                                <a href=\"https://www.google.se/search?q=");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[i]);
      out.write("+Currency\">\n");
      out.write("                                                    \n");
      out.write("                                                    ");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[j]);
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                </a>\n");
      out.write("                                                    \n");
      out.write("                                            </td>  \n");
      out.write("                                        ");
 
                                           } else  {
                                           
                                           
      out.write("        \n");
      out.write("                                                \n");
      out.write("                                            <td>");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[j]);
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                                \n");
      out.write("                                        ");
 
                                           
                                           } 
                                           
                                        }
                                           
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                            ");

                               } else { 
      out.write("\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                <table class=\"");
      out.print(DataTruck.feeders.get(i).nameOfFeeder);
      out.write(" table table-bordered table-striped table-hover allJsonContainers\">\n");
      out.write("\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                        <td colspan=\"2\">Exchange Rates, Updated ");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[1]);
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("\n");
      out.write("                                            <!-- You can adjust the width of table columns as well -->\n");
      out.write("                                            <th class=\"col-md-2\"></th>\n");
      out.write("\n");
      out.write("                                            <!-- Use text alignment like text-center or text-right -->\n");
      out.write("                                            <th class=\"text-center\">\n");
      out.write("                                                ");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[DataTruck.feeders.get(i).htmlJsonArray.length-1]);
      out.write("\n");
      out.write("                                            </th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        ");
 
                                           for (int j = 3; j < jsonArrSize; j++) { 
                                        
                                            if ( j%2 != 0) {
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                \n");
      out.write("                                                <a href=\"https://www.google.se/search?q=");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[i]);
      out.write("+Currency\">\n");
      out.write("                                                    \n");
      out.write("                                                    ");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[j]);
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                </a>\n");
      out.write("                                                    \n");
      out.write("                                            </td>  \n");
      out.write("                                        ");
 
                                           } else  {
                                           
                                           
      out.write("        \n");
      out.write("                                                \n");
      out.write("                                            <td>");
      out.print(DataTruck.feeders.get(i).htmlJsonArray[j]);
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                                \n");
      out.write("                                        ");
 
                                           
                                           } 
                                           
                                        }
                                           
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                \n");
      out.write("                                ");

                               }
                                            
                            }
                            
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <!-- DUMMY ELEMENT -->\n");
      out.write("                        <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-0\"></div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <!-- SHOWING: Raw JSON Container -->    \n");
      out.write("                <div class=\"container allJson hidden\">\n");
      out.write("                \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                        <!-- DUMMY ELEMENT -->\n");
      out.write("                        <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-0\"></div>\n");
      out.write("                        \n");
      out.write("                        <!-- JSON Displayer -->\n");
      out.write("                        <div id=\"jsonLoopDisplayer\" class=\"col-lg-10 col-md-10 col-sm-10 col-xs-12\">\n");
      out.write("                        \n");
      out.write("                            ");

                              
                               for (int i = 0; i < s; i++ ){
                            
                                    if( i == 0 ) {
                            
                                       
      out.write("<div id=\"showingJson\" class=\"");
      out.print(DataTruck.feeders.get(i).nameOfFeeder);
      out.write(" well allJsonContainers\">\n");
      out.write("                                        ");
      out.print(DataTruck.feeders.get(i).prettyJsonString);
      out.write("\n");
      out.write("                                            </div>");

                                                 
                                    } else {
                                                 
                                        
      out.write("<div class=\"");
      out.print(DataTruck.feeders.get(i).nameOfFeeder);
      out.write(" well allJsonContainers\">\n");
      out.write("                                        ");
      out.print(DataTruck.feeders.get(i).prettyJsonString);
      out.write("\n");
      out.write("                                            </div>");

                                            
                                    }
                                    
                            
                                }
                               
                            
      out.write("\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <!-- DUMMY ELEMENT -->\n");
      out.write("                        <div class=\"col-lg-1 col-md-1 col-sm-1 col-xs-0\"></div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- DUMMY ELEMENT -->\n");
      out.write("                <div class=\"col-lg-3 col-md-2 col-sm-1 col-xs-0\"></div>\n");
      out.write("                \n");
      out.write("                <!-- Button Holder -->\n");
      out.write("                <div class=\"col-lg-6 col-md-8 col-sm-10 col-xs-6\">\n");
      out.write("\n");
      out.write("                    <!-- Button Group! -->\n");
      out.write("                    <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        ");

                               for (int i = 0; i < s; i++ ){
                            
                                   
      out.write("<button type=\"button\" name=\"");
      out.print(DataTruck.feeders.get(i).nameOfFeeder);
      out.write("\" class=\" btn btn-primary active allJsonButtons\" role=\"button\">\n");
      out.write("                                    ");
      out.print(DataTruck.feeders.get(i).nameOfFeeder);
      out.write("\n");
      out.write("                                    </button>");

                            
                                }
                               
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- DUMMY ELEMENT -->\n");
      out.write("                <div class=\"col-lg-3 col-md-2 col-sm-1 col-xs-0\"></div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            \n");
      out.write("            \t&copy; Copyright Mattias Bergstrom &amp; Love Almgren 2017\n");
      out.write("        \n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
