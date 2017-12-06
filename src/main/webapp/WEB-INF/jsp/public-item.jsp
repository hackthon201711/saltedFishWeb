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
            <h1>商品发布</h1>
            <div class="content-form-page">
              <form role="form" class="form-horizontal form-without-legend">
                <div class="form-group">
                  <label class="col-lg-2 control-label" for="first-name">商品名称 <span class="require">*</span></label>
                  <div class="col-lg-8">
                    <input type="text" id="ID" class="form-control">
                  </div>
                </div>
                <div class="form-group">
                  <label class="col-md-2 control-label">商品分类 <span class="require">*</span></label>
                  <div class="col-md-8">
                    <select class="form-control">
					  <option>---请选择---</option>
                      <option>电器</option>
                      <option>母婴</option>
                      <option>其他</option>

                    </select>
                  </div>
                </div>
				
			    <div class="form-group">
                  <label class="col-md-2 control-label">发布地区 <span class="require">*</span></label>
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
				
				<div class="form-group">
					<label class="col-md-2 control-label">上传图片 </label>
					<div class="col-md-8">
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />
						<input type="file" name="uploadFile" />

					<div/>
				<div/>
				
                <div class="form-group">
                  <label class="col-lg-2 control-label" for="first-name">商品描述 </label>
                  <textarea class="form-control" rows="8" id="review"></textarea>
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