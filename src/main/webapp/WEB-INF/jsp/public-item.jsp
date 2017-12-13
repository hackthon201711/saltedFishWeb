<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
            <li class="active">发布商品</li>
        </ul>
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
        <jsp:include page="include/leftSide-include.jsp"></jsp:include>	  

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <h1>商品发布</h1>
            <div class="content-form-page">
              <form role="form" class="form-horizontal form-without-legend" action="addnewItem" method="post" enctype="multipart/form-data">
                <div class="form-group">
                  <label class="col-lg-2 control-label" for="first-name">商品名称 <span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="text" id="itemName" name="itemName" class="form-control">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-md-2 control-label">商品分类 <span class="require">*</span></label>
                  <div class="col-md-8">
                  <select name="typeid" id="typeid" style="width: 95%">
                            <c:forEach items="${ItemTypeList}" var="var1">
                                <option value="${var1.itemTypeId}">${var1.itemTypeName}</option>
                            </c:forEach>
                     </select>

                  </div>
                </div>
				
			    <div class="form-group">
                  <label class="col-md-2 control-label">发布地区 <span class="require">*</span></label>
                  <div class="col-md-8">
                  <select name="locationid" id="locationid" style="width: 95%">
                            <c:forEach items="${LocationList}" var="var">
                                <option value="${var.locationId}">${var.locationName}</option>
                            </c:forEach>
                     </select>
                  </div>
                </div>
				
				<div class="form-group">
					<label class="col-md-2 control-label">上传图片 </label>
					<div class="col-md-8">
						<input type="file" name="files" />
						<input type="file" name="files" />
						<input type="file" name="files" />


					</div>
				</div>
				 <div class="form-group">
                  <label class="col-lg-3 control-label" >原始价格</label>
                        <div class="col-lg-2">
                             <input type="text" id="preprice" name="preprice" class="form-control">
                        </div>
                  <label class="col-lg-3 control-label" >现在价格</label>
                       <div class="col-lg-2">
                             <input type="text" id="curprice" name="curprice" class="form-control">
                        </div>
                  </div>


                <div class="form-group">
                  <label class="col-lg-2 control-label" for="first-name">商品描述 </label>
                  <textarea class="col-lg-8" rows="8" id="dec" name="itemDec"></textarea>
                </div>


			
                <div class="row">
                  <div class="col-lg-8 col-md-offset-2 padding-left-0 padding-top-20">
                    <button class="btn btn-primary" type="submit">点我发布</button>
					<button class="btn btn-primary" type="reset">重新填写</button>
	

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