package com.spring.site.config;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.SessionTrackingMode;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityBootstrap extends
		AbstractSecurityWebApplicationInitializer {

	/*@Override
	protected Set<SessionTrackingMode> getSessionTrackingModes() {
		return EnumSet.of(SessionTrackingMode.COOKIE);
	}*/

	@Override
	protected boolean enableHttpSessionEventPublisher() {
		System.out.println("Executing security bootstrap.");
		return true;
	}
	
}
