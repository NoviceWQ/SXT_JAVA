package com.sxt.file;
import java.io.File;
import java.io.IOException;

/*
 * 文件状态
 * 1. 不存在: exists
 * 2. 存在
 *    文件: isFile
 *    文件夹: isDirectory
 *    
 * 其它信息：
 * createNewFile() : 新建文件
 * delete() : 删除文件
 * 
 */
public class FileTool {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/File/a.txt");
		
		System.out.println("获取文件名称: "+file.getName());
		System.out.println("获取文件相对路径: "+file.getPath());
		System.out.println("获取文件绝对路径: "+file.getAbsolutePath());
		
		// 判断文件状态
		if(null == file || !file.exists()) {
			System.out.println("文件不存在的操作");
			file.createNewFile();
		}else {
			if(file.isFile()) {
				System.out.println("文件的操作");
				file.delete();
			}else {
				System.out.println("文件夹的操作");
			}
		}
	}

}
