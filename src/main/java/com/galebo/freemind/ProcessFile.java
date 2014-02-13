package com.galebo.freemind;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringEscapeUtils;

public class ProcessFile {
	public static void main(String[] args) throws IOException {
		process("/WORK/git/nginx-study/nginx_main.mm");
		process("/WORK/git/nginx-study/nginx_main1.mm");
		System.out.println("exe ok");
	}

	private static void process(String fileName) throws IOException {
		File file = new File(fileName);
		List<String> lines = FileUtils.readLines(file);
		List<String> out_lines = new ArrayList<String>();
		for (Iterator<String> iterator = lines.iterator(); iterator.hasNext();) {
			String string =  iterator.next();
			out_lines.add(StringEscapeUtils.unescapeHtml(string.replaceAll("FOLDED=\"true\" ", "")));
		}
		FileUtils.writeLines(new File("./"+file.getName()+".txt"),out_lines);
	}
}
