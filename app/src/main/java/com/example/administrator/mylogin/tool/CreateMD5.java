package com.example.administrator.mylogin.tool;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 这个类是md5加密的工具类
 * Created by Administrator on 2017/3/28 0028.
 */

public class CreateMD5 {
     private static String strMd5;

     //静态方法，便于作为工具类
     public static String getMd5(String plainText) {
     try {
         MessageDigest md = MessageDigest.getInstance("MD5");
         md.update(plainText.getBytes());
         byte b[] = md.digest();
         int i;
         StringBuffer buf = new StringBuffer("");
         for (int offset = 0; offset < b.length; offset++) {
         i = b[offset];
         if (i < 0)
                 i += 256;
         if (i < 16)
                 buf.append("0");
         buf.append(Integer.toHexString(i));
   }
       //32位加密
         strMd5 =  buf.toString();
         return strMd5;
       // 16位的加密
       //return buf.toString().substring(8, 24);
   } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
         return null;
     }
   }
   public static void main(String[] args) {
       /*strMd5 = "hello";
       for (int num = 0;num<2;num++){
           strMd5 = CreateMD5.getMd5(strMd5);
       }
           //测试
           System.out.println(strMd5);
       }*/
       System.out.println(CreateMD5.getMd5("hello"));
   }
}
