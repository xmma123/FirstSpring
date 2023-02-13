/*     */ package com.nuage.model;
/*     */ 
/*     */ import com.fasterxml.jackson.annotation.JsonProperty;
/*     */ import io.swagger.annotations.ApiModelProperty;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NuageResponse
/*     */ {
/*     */   @JsonProperty("code")
/*     */   private Integer code;
/*     */   @JsonProperty("message")
/*  19 */   private String message = "success";
/*     */   
/*     */   @JsonProperty("value")
/*  22 */   private Object value = null;
/*     */ 
/*     */   
/*     */   public com.nuage.model.NuageResponse code(Integer code) {
/*  26 */     this.code = code;
/*  27 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("返回码int类型 大于等于0")
/*     */   public Integer getCode() {
/*  38 */     return this.code;
/*     */   }
/*     */   
/*     */   public void setCode(Integer code) {
/*  42 */     this.code = code;
/*     */   }
/*     */   
/*     */   public com.nuage.model.NuageResponse message(String message) {
/*  46 */     this.message = message;
/*  47 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("返回回消息")
/*     */   public String getMessage() {
/*  58 */     return this.message;
/*     */   }
/*     */   
/*     */   public void setMessage(String message) {
/*  62 */     this.message = message;
/*     */   }
/*     */   
/*     */   public com.nuage.model.NuageResponse value(Object value) {
/*  66 */     this.value = value;
/*  67 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ApiModelProperty("返回前台的值")
/*     */   public Object getValue() {
/*  78 */     return this.value;
/*     */   }
/*     */   
/*     */   public void setValue(Object value) {
/*  82 */     this.value = value;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  88 */     if (this == o) {
/*  89 */       return true;
/*     */     }
/*  91 */     if (o == null || getClass() != o.getClass()) {
/*  92 */       return false;
/*     */     }
/*  94 */     com.nuage.model.NuageResponse nuageResponse = (com.nuage.model.NuageResponse)o;
/*  95 */     return (Objects.equals(this.code, nuageResponse.code) && 
/*  96 */       Objects.equals(this.message, nuageResponse.message) && 
/*  97 */       Objects.equals(this.value, nuageResponse.value));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 102 */     return Objects.hash(new Object[] { this.code, this.message, this.value });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 107 */     StringBuilder sb = new StringBuilder();
/* 108 */     sb.append("class NuageResponse {\n");
/*     */     
/* 110 */     sb.append("    code: ").append(toIndentedString(this.code)).append("\n");
/* 111 */     sb.append("    message: ").append(toIndentedString(this.message)).append("\n");
/* 112 */     sb.append("    value: ").append(toIndentedString(this.value)).append("\n");
/* 113 */     sb.append("}");
/* 114 */     return sb.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String toIndentedString(Object o) {
/* 122 */     if (o == null) {
/* 123 */       return "null";
/*     */     }
/* 125 */     return o.toString().replace("\n", "\n    ");
/*     */   }
/*     */ }


/* Location:              C:\Users\xiaominm\Documents\server-2.1.0.jar!\BOOT-INF\classes\com\nsb\swaggergen\model\NuageResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */