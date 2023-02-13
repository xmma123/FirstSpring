/*     */ package com.nuage.FirstSpring;
/*     */ 

/*     */ import com.google.common.cache.Cache;
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import java.io.IOException;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import javax.annotation.Resource;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.commons.lang3.StringUtils;
          import org.apache.tomcat.websocket.AuthenticationException;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Value;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.method.HandlerMethod;
/*     */ import org.springframework.web.servlet.ModelAndView;
/*     */ import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/*     */ 
/*     */
/*     */ 
/*     */ 
/*     */ 
          @Component
/*     */ public class NuageInterceptor  extends HandlerInterceptorAdapter
/*     */ {
/*  37 */   
/*     */   
            private final static Logger log = LoggerFactory.getLogger(NuageInterceptor.class);
            
            @Override
/*     */   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

/*     */     

/*     */     
              String jwtToken = request.getHeader("X-Auth-Token");

/* 153 */     if (StringUtils.isEmpty(jwtToken)) {

                 response.sendError(401, "X-Auth-Token");
                 return false;
/*     */     }
/*     */   

/* 104 */     return true;
/*     */   }
 
/*     */ }
/*     */   



/* Location:              C:\Users\xiaominm\Documents\server-2.1.0.jar!\BOOT-INF\classes\com\nsb\nuagevnsportal\server\config\interceptor\NuageInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */