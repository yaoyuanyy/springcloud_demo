package com.yy.filter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ParamFilter extends ZuulFilter {

	private Logger log = LoggerFactory.getLogger(ParamFilter.class);
	
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		String token = ctx.getRequest().getParameter("accessToken");
		if(StringUtils.isEmpty(token)){
			log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
		}
		
		log.info("access token ok");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
