package com.advance.exceptions;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationException {

	public static void main(String[] args) {
		createFile("outputFile.txt");
	}
	private static void createFile(String filename) {
		PrintWriter outputFile=null;
		try {
			outputFile=new PrintWriter(new FileWriter(filename));
		}catch(IOException exception) {
			System.err.println("an IOException" +exception.getMessage());
		}finally {
			if(outputFile!=null) {
				outputFile.close();
				System.out.println("printWriter is closed ");
			}else {
				System.out.println("printWriter is not open");
			}
		}
		

	}

}
