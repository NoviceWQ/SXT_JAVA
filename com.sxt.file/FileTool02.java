package File��;

import java.io.File;
public class DiGuiDemo2 {

	public static void main(String[] args) {
		// ����File����
		File dir = new File("F:\\N4X\\123");
		printDir(dir);
	}
	
	public static void printDir(File dir) {
		// ��ȡ���ļ���Ŀ¼
		File[] files = dir.listFiles();
		for(File file:files) {
			//�����ļ�ʱ,��ӡ����·��.
			if(file.isFile()) {
				System.out.println("�ļ���:  "+file.getAbsolutePath());
			//����Ŀ¼ʱ,�������ô�ӡĿ¼�ķ���,�γɵݹ����.
			}else {
				System.out.println("Ŀ¼��:  "+file.getAbsolutePath());
				printDir(file);
			}
		}
	}

}
