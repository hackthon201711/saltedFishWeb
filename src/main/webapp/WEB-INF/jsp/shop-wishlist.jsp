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
            <li class="active">My Wish List</li>
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
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Home & Garden</a></li>
              <li class="list-group-item clearfix"><a href="shop-product-list.html"><i class="fa fa-angle-right"></i> Custom Link</a></li>
            </ul>
          </div>
          <!-- END SIDEBAR -->

          <!-- BEGIN CONTENT -->
          <div class="col-md-9 col-sm-7">
            <h1>我喜欢的商品</h1>
            <div class="goods-page">
              <div class="goods-data clearfix">
                <div class="table-wrapper-responsive">
                <table summary="Shopping cart">
                  <tr>
                    <th class="goods-page-image">缩略图</th>
                    <th class="goods-page-description">商品描述</th>
                    <th class="goods-page-stock">商品状态</th>
                    <th class="goods-page-price" colspan="2">价格</th>
                  </tr>
                  <tr>
                    <td class="goods-page-image">
                      <a href="javascript:;"><img src="${pageContext.request.contextPath}/assets/pages/img/products/model3.jpg" alt="Berry Lace Dress"></a>
                    </td>
                    <td class="goods-page-description">
                      <h3><a href="javascript:;">Cool green dress with red bell</a></h3>

                      <em>More info is here</em>
                    </td>
                    <td class="goods-page-stock">
                                                                 销售中...
                    </td>
                    <td class="goods-page-price">
                      <strong><span>$</span>47.00</strong>
                    </td>
                    <td class="del-goods-col">
                      <a class="del-goods" href="javascript:;">&nbsp;</a>

                    </td>
                  </tr>
                  <tr>
                    <td class="goods-page-image">
                      <a href="javascript:;"><img src="${pageContext.request.contextPath}/assets/pages/img/products/model4.jpg" alt="Berry Lace Dress"></a>
                    </td>
                    <td class="goods-page-description">
                      <h3><a href="javascript:;">Cool green dress with red bell</a></h3>

                      <em>More info is here</em>
                    </td>
                    <td class="goods-page-stock">
                                                                   已下架
                    </td>
                    <td class="goods-page-price">
                      <strong><span>$</span>47.00</strong>
                    </td>
                    <td class="del-goods-col">
                      <a class="del-goods" href="javascript:;">&nbsp;</a>

                    </td>
                  </tr>
                </table>
                </div>
              </div>
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