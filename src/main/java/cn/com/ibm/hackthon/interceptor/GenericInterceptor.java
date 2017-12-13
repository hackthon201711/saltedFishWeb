package cn.com.ibm.hackthon.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.com.ibm.hackthon.util.Constant;

/**
 * 拦截器
 * @author lizhiwei
 *
 */
public class GenericInterceptor implements HandlerInterceptor {
	
	private Logger logger = LoggerFactory.getLogger(GenericInterceptor.class);
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		logger.info("after completion...");
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse respo, Object arg2, ModelAndView mav)
			throws Exception {
		logger.info("postHandle...");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse resp, Object arg2) throws Exception {
		logger.info("preHandle...");
		if(request.getSession().getAttribute(Constant.USERID_IN_SESSION)==null) {
			logger.info("user need to login...");
			logger.info(request.getContextPath());
			resp.sendRedirect(request.getContextPath()+"/FWlogin");
			return false;
		}
		return true;
	}

}
