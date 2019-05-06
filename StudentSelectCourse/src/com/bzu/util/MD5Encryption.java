package com.bzu.util;

import java.security.*;

//使用MD5加密算法，对用户名、密码进行加密
public class MD5Encryption {
public final String MD5(String s) {
    try {
         byte[] btInput = s.getBytes();
         MessageDigest mdInst = MessageDigest.getInstance("MD5");
         mdInst.update(btInput);
         byte[] md = mdInst.digest();
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < md.length; i++) {
          int val = ((int) md[i]) & 0xff;
          if (val < 16)
           sb.append("0");
          sb.append(Integer.toHexString(val));
         }
         return sb.toString();
      }catch (Exception e) {
    	  return s;            //加密失败返回源字符串
      }
	}

}
