/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.6.v20170531
 * Generated at: 2018-05-07 10:05:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/view/modal/modal-member-detail.jsp", Long.valueOf(1525687178000L));
    _jspx_dependants.put("file:/home/arrizaqu/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1523256551000L));
    _jspx_dependants.put("jar:file:/home/arrizaqu/.m2/repository/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098685890000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Form Member</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.css\"/>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t\n");
      out.write("\t\t$('#dt-member').DataTable();\n");
      out.write("\t\t\n");
      out.write("\t\t//add data even listener\n");
      out.write("\t\t$('#member-form').on('submit', function(evn){\n");
      out.write("\t\t\tevn.preventDefault();\n");
      out.write("\t\t\t//json -> javascript object notation\n");
      out.write("\t\t\tvar member = {\n");
      out.write("\t\t\t\tname : $('#name').val(),\n");
      out.write("\t\t\t\taddress : $('#address').val(),\n");
      out.write("\t\t\t\temail : $('#email').val()\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t//ajax (asyncronous javascript and xml)\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/save',\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\tcontentType : 'application/json',\n");
      out.write("\t\t\t\tdata : JSON.stringify(member),\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\twindow.location=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member\";\n");
      out.write("\t\t\t\t}, error: function(){\n");
      out.write("\t\t\t\t\talert('error');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//delete event function\n");
      out.write("\t\t$('.btn-del-member').on('click', function(){\n");
      out.write("\t\t\tvar id = $(this).attr('data-id');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar conf = confirm(\"Are you sure delete this data ?\");\n");
      out.write("\t\t\tif(conf){\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/delete?id=' + id,\n");
      out.write("\t\t\t\t\ttype : 'DELETE',\n");
      out.write("\t\t\t\t    success: function(data){\n");
      out.write("\t\t\t\t    \twindow.location='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member';\n");
      out.write("\t\t\t\t    }, error : function(){\n");
      out.write("\t\t\t\t    \talert('failed');\n");
      out.write("\t\t\t\t    }\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t} return false;\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//edit listener\n");
      out.write("\t\t$('.btn-edit').on('click', function(){\n");
      out.write("\t\t\tvar id = $(this).attr('data-id');\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/getmember?id='+id,\n");
      out.write("\t\t\t\ttype: 'GET',\n");
      out.write("\t\t\t\tsuccess : function(obj){\n");
      out.write("\t\t\t\t\t$('#idEdit').val(obj.id);\n");
      out.write("\t\t\t\t\t$('#nameEdit').val(obj.name);\n");
      out.write("\t\t\t\t\t$('#addressEdit').val(obj.address);\n");
      out.write("\t\t\t\t\t$('#emailEdit').val(obj.email);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#modalEdit\").modal();\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//submit edit\n");
      out.write("\t\t$('#btn-submit-edit').click(function(){\n");
      out.write("\t\t\tvar member = {\n");
      out.write("\t\t\t\tid : $('#idEdit').val(),\n");
      out.write("\t\t\t\tname : $('#nameEdit').val(),\n");
      out.write("\t\t\t\taddress : $('#addressEdit').val(),\n");
      out.write("\t\t\t\temail : $('#emailEdit').val()\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t//console.log(member);\n");
      out.write("\t\t\t//do ajax\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/update',\n");
      out.write("\t\t\t\ttype: 'PUT',\n");
      out.write("\t\t\t\tdata : JSON.stringify(member),\n");
      out.write("\t\t\t\tcontentType: 'application/json',\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\twindow.location=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member\";\n");
      out.write("\t\t\t\t}, error : function(){\n");
      out.write("\t\t\t\t\talert('failed');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//show detail\n");
      out.write("\t\t$('.btn-detail').click(function(){\n");
      out.write("\t\t\tvar id = $(this).attr('data-id');\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/getmember?id='+id,\n");
      out.write("\t\t\t\ttype: 'GET',\n");
      out.write("\t\t\t\tsuccess : function(obj){\n");
      out.write("\t\t\t\t\t$('#nameDetail').text(obj.name);\n");
      out.write("\t\t\t\t\t$('#addressDetail').text(obj.address);\n");
      out.write("\t\t\t\t\t$('#emailDetail').text(obj.email);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$('#modalViewDetail').modal();\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div id=\"container\" style=\"width: 1000px; margin: auto;\">\n");
      out.write("\t\t<form id=\"member-form\">\n");
      out.write("\t\t\t<input type=\"text\" id=\"name\"  placeholder=\"enter your name\" /><br/>\n");
      out.write("\t\t\t<input type=\"text\" id=\"address\" placeholder=\"enter your address\"/></br>\n");
      out.write("\t\t\t<input type=\"text\" id=\"email\" placeholder=\"enter your email\"/></br>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"save\" />\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<div id=\"data-mahasiswa\">\n");
      out.write("\t\t\t<table id=\"dt-member\" class=\"display\" style=\"width:100%\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t<th>Address</th>\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\n");
      out.write("\t\t\t\t\t\t<th>Action</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Modal -->\n");
      out.write("\t<div class=\"modal fade\" id=\"modalEdit\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t    <div class=\"modal-content\">\n");
      out.write("\t      <div class=\"modal-header\">\n");
      out.write("\t        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Edit Mahasiswa</h5>\n");
      out.write("\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("\t          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t        </button>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-body\">\n");
      out.write("\t       \t <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"name\">Name</label>\n");
      out.write("\t\t\t    <input type=\"hidden\" id=\"idEdit\"  />\n");
      out.write("\t\t\t    <input type=\"text\" class=\"form-control\" id=\"nameEdit\" aria-describedby=\"emailHelp\" placeholder=\"Enter your name\">\n");
      out.write("\t\t\t    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"address\">Address</label>\n");
      out.write("\t\t\t    <input type=\"text\" class=\"form-control\" id=\"addressEdit\" placeholder=\"Enter your address\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"email\">Email</label>\n");
      out.write("\t\t\t    <input type=\"email\" class=\"form-control\" id=\"emailEdit\" placeholder=\"Enter your email\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-footer\">\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t        <button type=\"button\" id=\"btn-submit-edit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write("<div class=\"modal fade\" id=\"modalViewDetail\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Detail member</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("       \t<table>\n");
      out.write("       \t\t<tr>\n");
      out.write("       \t\t\t<th>Name</th><td> : </td><td><span id=\"nameDetail\" /></td>\n");
      out.write("       \t\t</tr>\n");
      out.write("       \t\t<tr>\n");
      out.write("       \t\t\t<th>Address</th><td> : </td><td><span id=\"addressDetail\" /></td>\n");
      out.write("       \t\t</tr>\n");
      out.write("       \t\t<tr>\n");
      out.write("       \t\t\t<th>Email</th><td> : </td><td><span id=\"emailDetail\" /></td>\n");
      out.write("       \t\t</tr>\n");
      out.write("       \t</table>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction deleteById(id){\n");
      out.write("\t\tvar conf = confirm(\"are you sure delete data ?\");\n");
      out.write("\t\tif(conf){\n");
      out.write("\t\t\twindow.location=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mahasiswa/delete/\"+ id;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view/member.jsp(140,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listMember }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/view/member.jsp(140,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("member");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t\t<td>\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" data-id='");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("' class=\"btn btn-sm btn-danger btn-del-member\">Delete</a>\n");
            out.write("\t\t\t\t\t\t\t\t|\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" data-id='");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("' class=\"btn btn-sm btn-edit btn-warning\">Edit</a>\n");
            out.write("\t\t\t\t\t\t\t\t|\n");
            out.write("\t\t\t\t\t\t\t\t<a href=\"#\" data-id='");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("' class=\"btn btn-sm btn-detail btn-info\">Detail</a>\n");
            out.write("\t\t\t\t\t\t\t</td>\n");
            out.write("\t\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
