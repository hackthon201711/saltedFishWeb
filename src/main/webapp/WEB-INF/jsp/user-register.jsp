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
          <!-- BEGIN SIDEBAR -->
          <div class="sidebar col-md-3 col-sm-5">
            <ul class="list-group margin-bottom-25 sidebar-menu">
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Ladies</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Kids</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Accessories</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Sports</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Brands</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Electronics</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Home &amp; Garden</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Custom Link</a></li>
            </ul>
          </div>
          <!-- END SIDEBAR -->

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <h1>用户注册</h1>
            <div class="content-form-page">
              <form role="form" class="form-horizontal form-without-legend">
                <div class="form-group">
                  <label class="col-lg-2 control-label" for="first-name">ID <span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="text" id="ID" class="form-control">
                  </div>
                </div>

                <div class="form-group">
                  <label class="col-lg-2 control-label" for="last-name">密码<span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="password" id="PSW1" class="form-control">
                  </div>
                </div>
				                <div class="form-group">
                  <label class="col-lg-2 control-label" for="last-name">密码确认<span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="password" id="PSW2" class="form-control">
                  </div>
                </div>
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

                <div class="row">
                  <div class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20">
                    <button class="btn btn-primary" type="submit">注册</button>
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