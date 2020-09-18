package org.springframework.demo.aop;

import org.aspectj.lang.JoinPoint;

public class LogAspect {
	public void before(JoinPoint joinPoint) throws Throwable {
	}

	public void afterReturn(JoinPoint joinPoint,Object result) throws Throwable {
	}

	public void after(JoinPoint joinPoint) throws Throwable {
	}

	public void afterThrow(JoinPoint joinPoint,Exception exception) throws Throwable {
	}
}
