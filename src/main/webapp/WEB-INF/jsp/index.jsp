<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="include/Header-include.jsp"></jsp:include>

<!-- Body BEGIN -->
<body class="ecommerce">
<jsp:include page="include/topSide-include.jsp"></jsp:include>

    <!-- BEGIN SLIDER -->
    <div class="page-slider margin-bottom-35">
        <div id="carousel-example-generic" class="carousel slide carousel-slider">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                <li data-target="#carousel-example-generic" data-slide-to="3"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <!-- First slide -->
                <div class="item carousel-item-four active">
 
                </div>
                
                <!-- Second slide -->
                <div class="item carousel-item-five">
                    
                </div>

                <!-- Third slide -->
                <div class="item carousel-item-six">
                    
                </div>

                <!-- Fourth slide -->
                <div class="item carousel-item-seven">
                   
                </div>
            </div>

            <!-- Controls -->
            <a class="left carousel-control carousel-control-shop" href="#carousel-example-generic" role="button" data-slide="prev">
                <i class="fa fa-angle-left" aria-hidden="true"></i>
            </a>
            <a class="right carousel-control carousel-control-shop" href="#carousel-example-generic" role="button" data-slide="next">
                <i class="fa fa-angle-right" aria-hidden="true"></i>
            </a>
        </div>
    </div>
    <!-- END SLIDER -->

    <div class="main">
      <div class="container">
        <!-- BEGIN SALE PRODUCT & NEW ARRIVALS -->
        <div class="row margin-bottom-40">
          <!-- BEGIN SALE PRODUCT -->
          <div class="col-md-12 sale-product">
            <h2>新货上架</h2>
            <div class="owl-carousel owl-carousel5">

              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model1.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
 
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model2.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model6.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model6.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                    <div class="pi-img-wrapper">
                      <img src="${pageContext.request.contextPath}/assets/pages/img/products/model4.jpg" class="img-responsive" alt="Berry Lace Dress">
                      <div>
                        <a href="${pageContext.request.contextPath}/assets/pages/img/products/model4.jpg" class="btn btn-default fancybox-button">Zoom</a>
                        <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                      </div>
                    </div>
                    <h3><a href="javascript:;">Berry Lace Dress4</a></h3>
                    <div class="pi-price">$29.00</div>
                    <a href="javascript:;" class="btn btn-default add2cart">Like</a>

                  </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model5.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model5.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress5</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model3.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model3.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model7.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model7.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
            </div>
		    <div class="owl-carousel owl-carousel5">

              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model1.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
 
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model2.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model6.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model6.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                    <div class="pi-img-wrapper">
                      <img src="${pageContext.request.contextPath}/assets/pages/img/products/model4.jpg" class="img-responsive" alt="Berry Lace Dress">
                      <div>
                        <a href="${pageContext.request.contextPath}/assets/pages/img/products/model4.jpg" class="btn btn-default fancybox-button">Zoom</a>
                        <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                      </div>
                    </div>
                    <h3><a href="javascript:;">Berry Lace Dress4</a></h3>
                    <div class="pi-price">$29.00</div>
                    <a href="javascript:;" class="btn btn-default add2cart">Like</a>

                  </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model5.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model5.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress5</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model3.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model3.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/model7.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/model7.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
            </div>
			
          </div>
          <!-- END SALE PRODUCT -->
        </div>
        <!-- END SALE PRODUCT & NEW ARRIVALS -->

        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40 ">
          <!-- BEGIN SIDEBAR -->
          <!-- END SIDEBAR -->
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-8">
            <h2>热门商品</h2>
			
            <div class="owl-carousel owl-carousel5">
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/k1.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/k1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>

                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/k2.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/k2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/k3.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/k3.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/k4.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/k4.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress4</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
 
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/k1.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/k1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress5</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${pageContext.request.contextPath}/assets/pages/img/products/k2.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${pageContext.request.contextPath}/assets/pages/img/products/k2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress6</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="javascript:;" class="btn btn-default add2cart">Like</a>
                </div>
              </div>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->

      </div>
    </div>

<jsp:include page="include/footer-include.jsp"></jsp:include>    
</body>
<!-- END BODY -->
</html>