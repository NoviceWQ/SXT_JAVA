package com.sxt.file;

import java.io.File;
public class FileTool02 {

	public static void main(String[] args) {
		// 创建File对象
		File dir = new File("F:/N4X/123");
		printDir(dir);
	}
	
	public static void printDir(File dir) {
		// 获取子文件和目录
		File[] files = dir.listFiles();
		for(File file:files) {
			//当是文件时,打印绝对路径.
			if(file.isFile()) {
				System.out.println("文件名:  "+file.getAbsolutePath());
			//当是目录时,继续调用打印目录的方法,形成递归调用.
			}else {
				System.out.println("目录名:  "+file.getAbsolutePath());
				printDir(file);
			}
		}
	}

}
