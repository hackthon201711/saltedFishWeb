<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="include/Header-include.jsp"></jsp:include>
 
<!-- Body BEGIN -->
<body class="ecommerce">
    <jsp:include page="include/topSide-include.jsp"></jsp:include>
    
    <div class="main">
      <div class="container">
        <ul class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}/page_index">首页</a></li>
            <li class="active">用户登录</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <jsp:include page="include/leftSide-include.jsp"></jsp:include>

          <!-- BEGIN CONTENT -->
          
          <div class="col-md-9 col-sm-7">
             <div>${msg} </div>
            <h1>用户登录</h1>
            <div class="content-form-page">
              <form role="form" class="form-horizontal form-without-legend" action="login" method="post">
              <div style="color:red">
              	${errMsg }
              </div>
                <div class="form-group">
                  <label class="col-lg-2 control-label" for="ID">账户名 <span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="text" id="ID" name = "userID" class="form-control">
                  </div>
                </div>

                <div class="form-group">
                  <label class="col-lg-2 control-label" for="PSW">密码 <span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="password" id="PSW" name = "passWord" class="form-control">
                  </div>
                </div>
			
                <div class="row">
                  <div class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20">
                    <button class="btn btn-primary" type="submit">登录</button>
					<a  href="${pageContext.request.contextPath}/FWregister">还未注册？注册</a> 

                  </div>
                </div>
              </form>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->
      </div>
    </div>

    <!-- BEGIN BRANDS -->

    <!-- END BRANDS -->

    <!-- BEGIN STEPS -->
    
    <!-- END STEPS -->

    <jsp:include page="include/footer-include.jsp"></jsp:include>
</body>
<!-- END BODY -->
</html>