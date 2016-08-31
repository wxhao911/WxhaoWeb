package com.wxhao.util.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandle {
	
	public void xxx(){
		File file=new File("C:\\Users\\Administrator\\Desktop\\吴显浩_项目进度计划与总结表_2016078.xls");
		
	}
	
	 public static void main(String[] args){
	  long start = System.currentTimeMillis();
	  FileInputStream fileInputStream = null;
	  FileOutputStream fileOutputStream = null;
	  try{
	   fileInputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\apk\\AtomSetup.exe")); //读入原文件 
	   fileOutputStream = new FileOutputStream("F:\\$wxhao\\AtomSetup.exe");
	         byte[] bufferArray = new byte[1024*1024]; 
	         int length; 
	         while ((length = fileInputStream.read(bufferArray)) != -1) { 
	          fileOutputStream.write(bufferArray, 0, length); 
	         }
	  } catch (IOException e) {
	            e.printStackTrace();  
	        } finally {
	         try {
	          if(fileInputStream != null){
	           fileInputStream.close();
	          }
	          if(fileOutputStream != null){
	           fileOutputStream.close();
	          }
	          
	   } catch (IOException e) {
	    e.printStackTrace();
	   }
	        }
	  long end = System.currentTimeMillis();
	  System.out.println("视频文件从“from”文件夹复制到“to”文件需要" + (end - start) + "毫秒。");
	 }
}
