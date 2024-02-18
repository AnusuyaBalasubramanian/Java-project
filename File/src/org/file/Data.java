package org.file;

import java.io.File;
import java.io.IOException;

public class Data {
	public static void main(String[] args) throws IOException {
		//existing path.......C:\\java
		File f = new File("C:\\java\\Batch1\\c\\html\\testing\\anu.txt");
	boolean canWrite = f.canWrite();// check whether we can write into file
	System.out.println(canWrite);
	boolean canRead = f.canRead();// check whether we can read a file or folder
	System.out.println(canRead);
	boolean canExecute = f.canExecute();//check whether we can execute a file or folder
	System.out.println(canExecute);

}}
