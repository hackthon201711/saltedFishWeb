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
            <li><a href="index.html">Home</a></li>
            <li><a href="">Store</a></li>
            <li class="active">Standart forms</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <jsp:include page="include/leftSide-include.jsp"></jsp:include>	

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <h1>个人信息修改</h1>
            <div class="content-form-page">
              <form role="form" class="form-horizontal form-without-legend">
			    <div class="form-group">
                  <label class="col-lg-2 control-label" for="fax">昵称</label>
                  <div class="col-lg-8">
                    <input type="text" id="nickname" class="form-control">
                  </div>
                </div>
				
		    <div class="form-group">
                  <label class="col-lg-2 control-label" for="email">E-Mail ></label>
                  <div class="col-lg-8">
                    <input type="text" id="email" class="form-control">
                  </div>
            </div>
            <div class="form-group">
                  <label class="col-lg-2 control-label" for="telephone">Telephone </label>
                  <div class="col-lg-8">
                    <input type="text" id="telephone" class="form-control">
                  </div>
            </div>	
				
            <div class="form-group">
                  <label class="col-md-2 control-label">性別 </label>
                  <div class="col-md-8">
                    <select class="form-control">
					  <option>---请选择---</option>
                      <option>男</option>
                      <option>女</option>
                      <option>保密</option>

                    </select>
                  </div>
            </div>
			
		    <div class="form-group">
                  <label class="col-md-2 control-label">所在地 </label>
                  <div class="col-md-8">
                    <select class="form-control">
					  <option>---请选择---</option>
                      <option>成都</option>
                      <option>大连</option>
                      <option>武汉</option>
					  <option>上海</option>

                    </select>
                  </div>
            </div>
			<div class="form-group" >
				<a  class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20" href = "user-psw-edit.html">修改密码</a>
            </div>


			
                <div class="row">
                  <div class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20">
                    <button class="btn btn-primary" type="submit">提交修改</button>
					<button class="btn btn-primary" type="reset">重新填寫</button>
	

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