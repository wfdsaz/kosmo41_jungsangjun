/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.33
 * Generated at: 2018-09-12 04:07:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<script src=\"https://cdn.ckeditor.com/4.10.0/standard/ckeditor.js\"></script>\r\n");

	if (session.getAttribute("ValidMem") == null) {

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

	}

	String name = (String) session.getAttribute("name");
	String id = (String) session.getAttribute("id");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"write.do\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<table class=\"table table-sm\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"row\">이름</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"hidden\" name=\"bName\" value=\"");
      out.print(name);
      out.write('"');
      out.write('>');
      out.print(name);
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"row\">종류</th>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"food\">\r\n");
      out.write("\t\t\t\t\t\t\t<option selected>-선택-</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"카페/전통찻집\">카페/전통찻집</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"서양식\">서양식</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"채식전문점\">채식전문점</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"아시아식\">아시아식</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"한식\">한식</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"패밀리레스토랑\">패밀리레스토랑</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"이색음식점\">이색음식점</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"중식\">중식</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"일식\">일식</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"row\">지역</th>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"sido\"\r\n");
      out.write("\t\t\t\t\t\tonChange=\"cat1_change(this.value,gigungu)\">\r\n");
      out.write("\t\t\t\t\t\t\t<option selected>-선택-</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='서울'>서울</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='부산'>부산</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='대구'>대구</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='인천'>인천</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='광주'>광주</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='대전'>대전</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='울산'>울산</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='강원'>강원</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='경기'>경기</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='경남'>경남</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='경북'>경북</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='전남'>전남</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='전북'>전북</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='제주'>제주</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='충남'>충남</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value='충북'>충북</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"row\">시군구</th>\r\n");
      out.write("\t\t\t\t\t<td><select name=\"gigungu\">\r\n");
      out.write("\t\t\t\t\t\t\t<option selected>-선택-</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t <script language=javascript>\r\n");
      out.write("\t\t\t\t\t\tvar cat1_name = new Array('서울', '부산', '대구', '인천', '광주',\r\n");
      out.write("\t\t\t\t\t\t\t\t'대전', '울산', '강원', '경기', '경남', '경북', '전남', '전북',\r\n");
      out.write("\t\t\t\t\t\t\t\t'제주', '충남', '충북');\r\n");
      out.write("\t\t\t\t\t\tvar cat2_name = new Array();\r\n");
      out.write("\t\t\t\t\t\tcat2_name['서울'] = new Array('강남구', '강동구', '강북구', '강서구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'관악구', '광진구', '구로구', '금천구', '노원구', '도봉구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'동대문구', '동작구', '마포구', '서대문구', '서초구', '성동구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'성북구', '송파구', '양천구', '영등포구', '용산구', '은평구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'종로구', '중구', '중랑구');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['부산'] = new Array('강서구', '금정구', '남구', '동구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'동래구', '부산진구', '북구', '사상구', '사하구', '서구', '수영구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'연제구', '영도구', '중구', '해운대구', '기장군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['대구'] = new Array('남구', '달서구', '동구', '북구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'서구', '수성구', '중구', '달성군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['인천'] = new Array('계양구', '남구', '남동구', '동구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'부평구', '서구', '연수구', '중구', '강화군', '옹진군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['광주'] = new Array('광산구', '남구', '동구', '북구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'서구');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['대전'] = new Array('대덕구', '동구', '서구', '유성구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'중구');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['울산'] = new Array('남구', '동구', '북구', '중구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'울주군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['강원'] = new Array('강릉시', '동해시', '삼척시', '속초시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'원주시', '춘천시', '태백시', '고성군', '양구군', '양양군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'영월군', '인제군', '정선군', '철원군', '평창군', '홍천군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'화천군', '횡성군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['경기'] = new Array('고양시 덕양구', '고양시 일산구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'과천시', '광명시', '광주시', '구리시', '군포시', '김포시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'남양주시', '동두천시', '부천시 소사구', '부천시 오정구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'부천시 원미구', '성남시 분당구', '성남시 수정구', '성남시 중원구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'수원시 권선구', '수원시 장안구', '수원시 팔달구', '시흥시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'안산시 단원구', '안산시 상록구', '안성시', '안양시 동안구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'안양시 만안구', '오산시', '용인시', '의왕시', '의정부시', '이천시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'파주시', '평택시', '하남시', '화성시', '가평군', '양주군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'양평군', '여주군', '연천군', '포천군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['경남'] = new Array('거제시', '김해시', '마산시', '밀양시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'사천시', '양산시', '진주시', '진해시', '창원시', '통영시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'거창군', '고성군', '남해군', '산청군', '의령군', '창녕군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'하동군', '함안군', '함양군', '합천군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['경북'] = new Array('경산시', '경주시', '구미시', '김천시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'문경시', '상주시', '안동시', '영주시', '영천시', '포항시 남구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'포항시 북구', '고령군', '군위군', '봉화군', '성주군', '영덕군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'영양군', '예천군', '울릉군', '울진군', '의성군', '청도군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'청송군', '칠곡군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['전남'] = new Array('광양시', '나주시', '목포시', '순천시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'여수시', '강진군', '고흥군', '곡성군', '구례군', '담양군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'무안군', '보성군', '신안군', '영광군', '영암군', '완도군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'장성군', '장흥군', '진도군', '함평군', '해남군', '화순군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['전북'] = new Array('군산시', '김제시', '남원시', '익산시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'전주시 덕진구', '전주시 완산구', '정읍시', '고창군', '무주군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'부안군', '순창군', '완주군', '임실군', '장수군', '진안군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['제주'] = new Array('서귀포시', '제주시', '남제주군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'북제주군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['충남'] = new Array('공주시', '논산시', '보령시', '서산시',\r\n");
      out.write("\t\t\t\t\t\t\t\t'아산시', '천안시', '금산군', '당진군', '부여군', '서천군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'연기군', '예산군', '청양군', '태안군', '홍성군');\r\n");
      out.write("\t\t\t\t\t\tcat2_name['충북'] = new Array('제천시', '청주시 상당구',\r\n");
      out.write("\t\t\t\t\t\t\t\t'청주시 흥덕구', '충주시', '괴산군', '단양군', '보은군', '영동군',\r\n");
      out.write("\t\t\t\t\t\t\t\t'옥천군', '음성군', '진천군', '청원군');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfunction cat1_change(key, sel) {\r\n");
      out.write("\t\t\t\t\t\t\tif (key == '')\r\n");
      out.write("\t\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t\tvar name = cat2_name[key];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tfor (i = sel.length - 1; i >= 0; i--)\r\n");
      out.write("\t\t\t\t\t\t\t\tsel.options[i] = null;\r\n");
      out.write("\t\t\t\t\t\t\tsel.options[0] = new Option('-선택-', '', '', 'true');\r\n");
      out.write("\t\t\t\t\t\t\tfor (i = 0; i < name.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\tsel.options[i + 1] = new Option(name[i]);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t</script></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"row\">제목</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"bTitle\" size=\"50\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"row\">내용</th>\r\n");
      out.write("\t\t\t\t\t<td><textarea name=\"bContent\" rows=\"10\" id=\"editor1\" cols=\"80\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tCKEDITOR.replace('editor1');\r\n");
      out.write("\t\t\t\t\t\t</script></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<th scope=\"row\">업로드 파일</th>\r\n");
      out.write("\t\t\t\t<td><input type=\"file\" accept=\"image/*\" name=\"filename\"></td>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input class=\"btn btn-primary\" type=\"submit\" value=\"작성\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-outline-primary\" href=\"list.do\" role=\"button\">취소</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
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
}