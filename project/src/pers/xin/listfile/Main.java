package pers.xin.listfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static String separator = "    ";

	private static List<File> fileList = new ArrayList<File>();

	public static void main(String[] args) throws IOException {
		//1、
		checkDir();
		//2、
		String filePath = "C:\\Users\\BG387379\\Desktop\\";//filePath windows下分割符号为双反斜杠“\\”
		print(filePath);
		//3、
		List<File> fileList = getFileList(filePath);
		fileList.forEach(System.out::println);
	}

	//1、检查C盘根目录有无文件夹a，如果没有创建，有删除。
	public static void checkDir() throws IOException {
		checkDir("C:\\a");
	}

	public static void checkDir(String filePath) throws IOException {
		File file = new File(filePath);
		if (file.isDirectory()) {
			file.delete();
			String newFilePath = file.getAbsolutePath() + "\\test.txt";
			File newFile = new File(newFilePath);
			newFile.createNewFile();
			return;
		}
		file.mkdir();
	}

	//2、输出文件夹下的所有文件
	public static void print(String filePath) {
		File file = new File(filePath);
		if ((!file.isDirectory()) && (!file.isFile())) {
			System.out.println("请给定一个正确文件名。");
			return;
		}
		print(new File(filePath), 0);
	}

	private static void print(File file, int level) {
		String prefix = "";
		for (int i = 0; i < level; i++) {
			prefix += separator;
		}
		System.out.println(prefix + file.getPath());
		if (file.isDirectory()) {
			File[] childFiles = file.listFiles();
			for (File childFile : childFiles) {
				print(childFile, level + 1);
			}
		}
	}

	//3、将文件夹下的所有文件保存到一个ArrayList中
	public static List<File> getFileList(String filePath) {
		File file = new File(filePath);
		if ((!file.isDirectory()) && (!file.isFile())) {
			System.out.println("请给定一个正确文件名。");
			return null;
		}
		return getFileList(new File(filePath));
	}

	private static List<File> getFileList(File file) {
		fileList.add(file);
		if (file.isDirectory()) {
			File[] childFiles = file.listFiles();
			for (File childFile : childFiles) {
				getFileList(childFile);
			}
		}
		return fileList;
	}
}
