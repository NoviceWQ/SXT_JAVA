package com.sxt.file;
import java.io.File;
import java.io.IOException;

/*
 * �ļ�״̬
 * 1. ������: exists
 * 2. ����
 *    �ļ�: isFile
 *    �ļ���: isDirectory
 *    
 * ������Ϣ��
 * createNewFile() : �½��ļ�
 * delete() : ɾ���ļ�
 * 
 */
public class FileTool {
	public static void main(String[] args) throws IOException {
		File file = new File("F:/File/a.txt");
		
		System.out.println("��ȡ�ļ�����: "+file.getName());
		System.out.println("��ȡ�ļ����·��: "+file.getPath());
		System.out.println("��ȡ�ļ�����·��: "+file.getAbsolutePath());
		
		// �ж��ļ�״̬
		if(null == file || !file.exists()) {
			System.out.println("�ļ������ڵĲ���");
			file.createNewFile();
		}else {
			if(file.isFile()) {
				System.out.println("�ļ��Ĳ���");
				file.delete();
			}else {
				System.out.println("�ļ��еĲ���");
			}
		}
	}

}
