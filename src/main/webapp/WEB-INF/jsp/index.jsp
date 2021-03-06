<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <!-- BEGIN NEW ARRIVALS -->
        <div class="row margin-bottom-40">
          <!-- BEGIN SALE PRODUCT -->
          <div class="col-md-12 sale-product">
            <h2>新货上架</h2>
            <div class="owl-carousel owl-carousel5">
			  <c:forEach items="${ newItemList}" var="item" begin="0" end="5">
	              <div>
	                <div class="product-item">
	                  <div class="pi-img-wrapper">
	                    <img src="${item.picPath}" class="img-responsive" alt="${item.itemName}">
	   
	                    <div>
	                      <a href="${item.picPath}" class="btn btn-default fancybox-button">Zoom</a>
	                      <!-- a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a> -->
	                    </div>
	                  </div>
	                  <h3><a href="${pageContext.request.contextPath}/itemD/ItemDetail?itemid=${item.id}">${item.itemName }</a></h3>
	                  <div class="pi-price">￥${item.currentPrice }</div>
	                  <c:if test="${sessionScope.uId!=null }">
		                  <a href="javascript:;" class="btn btn-default add2cart">
			                  Like
			                  <input type="hidden" value="${item.id }"/>
		                  </a>
	                  </c:if>
	                  
	 
	                </div>
	              </div>
			  </c:forEach>
              
            </div>
			
            <div class="owl-carousel owl-carousel5">
			  <c:forEach items="${ newItemList}" var="item" begin="5" end="10">
	              <div>
	                <div class="product-item">
	                  <div class="pi-img-wrapper">
	                    <img src="${item.picPath}" class="img-responsive" alt="${item.itemName}">
	                    <div>
	                      <a href="${item.picPath}" class="btn btn-default fancybox-button">Zoom</a>
	                      <!-- a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a> -->
	                    </div>
	                  </div>
	                  <h3><a href="${pageContext.request.contextPath}/itemD/ItemDetail?itemid=${item.id}">${item.itemName }</a></h3>
	                  <div class="pi-price">￥${item.currentPrice }</div>
	                  <c:if test="${sessionScope.uId!=null }">
		                  <a href="javascript:;" class="btn btn-default add2cart">
			                  Like
			                  <input type="hidden" value="${item.id }"/>
		                  </a>
	                  </c:if>
	 
	                </div>
	              </div>
			  </c:forEach>
              
            </div>
          </div>
          <!-- END SALE PRODUCT -->
        </div>
        <!-- END SALE PRODUCT & NEW ARRIVALS -->

        <!-- BEGIN HOT ITEM -->
        <div class="row margin-bottom-40 ">
          <!-- BEGIN SIDEBAR -->
          <!-- END SIDEBAR -->
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-8">
            <h2>热门商品</h2>
			
            <div class="owl-carousel owl-carousel5">
            
			  <c:forEach items="${hotItemList }" var="it">
	              <div>
	                <div class="product-item">
	                  <div class="pi-img-wrapper">
	                    <img src="${it.picPath}" class="img-responsive" alt="${item.itemName}">
	                    <div>
	                      <a href="${it.picPath}" class="btn btn-default fancybox-button">Zoom</a>
	                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
	                    </div>
	                  </div>
	                  <h3><a href="${pageContext.request.contextPath}/itemD/ItemDetail?itemid=${it.id}">${it.itemName }</a></h3>
	                  <div class="pi-price">￥${it.currentPrice }</div>
	                  <c:if test="${sessionScope.uId!=null }">
		                  <a href="javascript:;" class="btn btn-default add2cart">
			                  Like
			                  <input type="hidden" value="${it.id }"/>
		                  </a>
	                  </c:if>
	                </div>
	              </div>
			  </c:forEach>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- BEGIN Recommend ITEM -->
        <c:if test="${recommendItemList!=null }">
        
	        <div class="row margin-bottom-40 ">
	          <!-- BEGIN CONTENT -->
	          <div class="col-md-12 col-sm-8">
	            <h2>猜你喜欢</h2>
				
	            <div class="owl-carousel owl-carousel5">
	            
				  <c:forEach items="${recommendItemList }" var="it">
		              <div>
		                <div class="product-item">
		                  <div class="pi-img-wrapper">
		                    <img src="${it.picPath}" class="img-responsive" alt="${item.itemName}">
		                    <div>
		                      <a href="${it.picPath}" class="btn btn-default fancybox-button">Zoom</a>
		                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
		                    </div>
		                  </div>
		                  <h3><a href="${pageContext.request.contextPath}/itemD/ItemDetail?itemid=${it.id}">${it.itemName }</a></h3>
		                  <div class="pi-price">￥${it.currentPrice }</div>
		                  <c:if test="${sessionScope.uId }!=null">
			                  <a href="javascript:;" class="btn btn-default add2cart">
				                  Like
				                  <input type="hidden" value="${it.id }"/>
			                  </a>
		                  </c:if>
		                </div>
		              </div>
				  </c:forEach>
	            </div>
	          </div>
	          <!-- END CONTENT -->
	        </div>
        
        </c:if>
        <!-- END SIDEBAR & CONTENT -->

      </div>
    </div>

<jsp:include page="include/footer-include.jsp"></jsp:include>    
 
</body>
<!-- END BODY -->
<script type="text/javascript">
$(document).ready(function(){
	  $("#a,.btn.btn-default.add2cart").click(function(){
	  	var itemId = $(this).children("input")[0].value;
	  	var htmlobj=$.ajax(
	  			{
	  				url:"interest",
	  				type:"GET",
	  				dataType: "json",
	  				data:{"itemId":itemId},
 				async:false
				});
	  	var re =  htmlobj.responseText;
	  	if(re=="0"){
	  		alert('已加关注！');
	  		
	  	}else if(re=="1"){
	  		alert('你已经关注过该商品！');
	  	}else{
	  		alert('可能出现异常！');
	  	}
	  		
	  	}
	  	);
	}
	);
</script>
</html>