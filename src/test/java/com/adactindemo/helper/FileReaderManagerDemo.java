package com.adactindemo.helper;

import java.io.IOException;

public class FileReaderManagerDemo {
	
	public FileReaderManagerDemo() {
		}
	
	public static FileReaderManagerDemo getInstance() {
		FileReaderManagerDemo fr = new FileReaderManagerDemo();
		return fr;

	}
	
	public ConfigurationReaderDemo getCrInstance() throws IOException {
		ConfigurationReaderDemo cr = new ConfigurationReaderDemo();
		return cr;

	}

}
