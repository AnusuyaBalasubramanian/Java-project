package org.file;

import java.io.File;

public class Data1 {
	public static void main(String[] args) {
		
		File f = new File("C:\\");
		//list()....return only floder name
		String[] list = f.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		File[] listFiles = f.listFiles();
		for (int i = 0; i < listFiles.length; i++) {
			System.out.println(listFiles[i]);
		}
		
	}

}
