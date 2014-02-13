package com.galebo.freemind;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ProcessFile {
	public static void main(String[] args) throws IOException {
		List<String> lines = FileUtils.readLines(new File(""));
		for (Iterator<String> iterator = lines.iterator(); iterator.hasNext();) {
			String string =  iterator.next();
			string.replaceAll("", "");
		}
	}
}
