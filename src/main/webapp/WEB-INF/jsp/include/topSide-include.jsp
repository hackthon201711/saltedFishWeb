<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    <!-- BEGIN STYLE CUSTOMIZER -->
    <div class="color-panel hidden-sm">
      <div class="color-mode-icons icon-color"></div>
      <div class="color-mode-icons icon-color-close"></div>
      <div class="color-mode">
        <p>THEME COLOR</p>
        <ul class="inline">
          <li class="color-red current color-default" data-style="red"></li>
          <li class="color-blue" data-style="blue"></li>
          <li class="color-green" data-style="green"></li>
          <li class="color-orange" data-style="orange"></li>
          <li class="color-gray" data-style="gray"></li>
          <li class="color-turquoise" data-style="turquoise"></li>
        </ul>
      </div>
    </div>
    <!-- END BEGIN STYLE CUSTOMIZER --> 

    <!-- BEGIN TOP BAR -->
    <div class="pre-header">
        <div class="container">
            <div class="row">
                <!-- BEGIN TOP BAR LEFT PART -->
                <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                        <li><i class="fa fa-phone"></i><span>028 88888888</span></li>
                        
                    </ul>
                </div>
                <!-- END TOP BAR LEFT PART -->
                <!-- BEGIN TOP BAR MENU -->
                <div class="col-md-6 col-sm-6 additional-nav">
                    <ul class="list-unstyled list-inline pull-right">
                      <c:if test="${sessionScope.userID!=null }">      
                        <li><a href="${pageContext.request.contextPath}/file/publicItem">我要发布</a></li>
                        
                        <li><a href="${pageContext.request.contextPath}/myinterest">我要关注的商品</a></li>
                        <li><a href="${pageContext.request.contextPath}/myitem">已发布的商品</a></li>
                        <li>${sessionScope.userID}</li>
                        <li><a href="${pageContext.request.contextPath}/logoff">退出登录</a></li>
                      </c:if>  
                      <c:if test="${sessionScope.userID==null }">
                      	<li><a href="${pageContext.request.contextPath}/FWlogin">登陆</a></li>
                      </c:if>
                        
                    </ul>
                </div>
                <!-- END TOP BAR MENU -->
            </div>
        </div>        
    </div>
    <!-- END TOP BAR -->

    <!-- BEGIN HEADER -->
    <div class="header">
      <div class="container">
       
      </div>
    </div>
    <!-- Header END -->