package com.nuage.model;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ import io.swagger.annotations.ApiModelProperty;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ErrorInfo
/*    */ {
/*    */   @JsonProperty("code")
/*    */   private String code;
/*    */   
/*    */   public com.nuage.model.ErrorInfo code(String code) {
/* 20 */     this.code = code;
/* 21 */     return this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ApiModelProperty("")
/*    */   public String getCode() {
/* 32 */     return this.code;
/*    */   }
/*    */   
/*    */   public void setCode(String code) {
/* 36 */     this.code = code;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 42 */     if (this == o) {
/* 43 */       return true;
/*    */     }
/* 45 */     if (o == null || getClass() != o.getClass()) {
/* 46 */       return false;
/*    */     }
/* 48 */     com.nuage.model.ErrorInfo errorInfo = (com.nuage.model.ErrorInfo)o;
/* 49 */     return Objects.equals(this.code, errorInfo.code);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 54 */     return Objects.hash(new Object[] { this.code });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 59 */     StringBuilder sb = new StringBuilder();
/* 60 */     sb.append("class ErrorInfo {\n");
/*    */     
/* 62 */     sb.append("    code: ").append(toIndentedString(this.code)).append("\n");
/* 63 */     sb.append("}");
/* 64 */     return sb.toString();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private String toIndentedString(Object o) {
/* 72 */     if (o == null) {
/* 73 */       return "null";
/*    */     }
/* 75 */     return o.toString().replace("\n", "\n    ");
/*    */   }
/*    */ }


/* Location:              C:\Users\xiaominm\Documents\server-2.1.0.jar!\BOOT-INF\classes\com\nsb\swaggergen\model\ErrorInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */