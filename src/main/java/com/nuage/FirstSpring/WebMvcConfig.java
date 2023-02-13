/*    */ package com.nuage.FirstSpring;
/*    */ 
/*    */ import com.fasterxml.jackson.databind.JsonSerializer;
/*    */ import com.fasterxml.jackson.databind.Module;
/*    */ import com.fasterxml.jackson.databind.ObjectMapper;
/*    */ import com.fasterxml.jackson.databind.module.SimpleModule;
/*    */ import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import org.springframework.http.converter.HttpMessageConverter;
/*    */ import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
/*    */ import org.springframework.web.servlet.HandlerInterceptor;
/*    */ import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
/*    */ import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
/*    */ import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Configuration
/*    */ public class WebMvcConfig
/*    */   implements WebMvcConfigurer
/*    */ {

/*    */   @Autowired
            private NuageInterceptor interceptor;
/*    */ 
/*    */ 
/*    */ 
/*    */   @Override
/*    */   public void addInterceptors(InterceptorRegistry registry) {
/* 35 */     
/* 36 */     registry.addInterceptor(interceptor)
									.addPathPatterns("/users/**");

/*    */   }

/*    */ }


/* Location:              C:\Users\xiaominm\Documents\server-2.1.0.jar!\BOOT-INF\classes\com\nsb\nuagevnsportal\server\config\interceptor\WebMvcConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */