package com.org.completeSpringapplication.Utility;

import com.org.completeSpringapplication.Interceptor.LonggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer
{
    @Autowired
    LonggingInterceptor longgingInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(longgingInterceptor).
                addPathPatterns("/book/**").
                excludePathPatterns("/getBook/{bookId}");

    }
}
