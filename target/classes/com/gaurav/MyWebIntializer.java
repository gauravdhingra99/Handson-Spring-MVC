package com.gaurav;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("I m in cing class");
		return new Class[] {ProjectConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("I m in mapping");
		return new String[] {"/"};
	}

}
