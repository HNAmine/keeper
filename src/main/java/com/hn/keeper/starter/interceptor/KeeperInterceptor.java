package com.hn.keeper.starter.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hn.keeper.starter.service.KeeperService;
import com.hn.keeper.starter.util.KeeperUtil;

@Component
public class KeeperInterceptor extends HandlerInterceptorAdapter {

	@Value("${spring.keeper.root.header}")
	private String keeperHeader;

	@Autowired
	private KeeperService keeperService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		keeperService.setCurrentTransformer(request.getHeader(this.keeperHeader));

		KeeperUtil.decode(request.getHeader(this.keeperHeader));
		return true;
	}

}