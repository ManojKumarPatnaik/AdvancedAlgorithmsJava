package com.globalsoftwaresupport;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFS {

	// contains the URLs such as (www.bbc.com or www.facebook.com)
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;
	
	public BFS() {
		this.queue = new LinkedList<>();
		this.discoveredWebsiteList = new ArrayList<>();
	}
	
	// root is the starting URL (www.bbc.com) for the algorithm
	public void discoverWeb(String root) {
		
		this.queue.add(root);
		this.discoveredWebsiteList.add(root);
		
		while(!queue.isEmpty()) {
			
			String v = this.queue.remove();
			String rawHtml = readURL(v);
			
			// we want to find valid URLS (https:// ...)
			String regexp = "https://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHtml);
			
			while(matcher.find()) {
				String w = matcher.group();
				
				if(!discoveredWebsiteList.contains(w)) {
					discoveredWebsiteList.add(w);
					System.out.println("Website found: " + w);
					queue.add(w);
				}
			}
		}
	}

	// read the HTML content of a given website (v)
	// and we return with a String format
	private String readURL(String v) {
		
		StringBuilder rawHtml = new StringBuilder("");
		
		try {
			URL url = new URL(v);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = "";
			
			while((line=reader.readLine())!=null) {
				rawHtml.append(line);
			}
			
			reader.close();
		} catch(Exception e) {
			System.out.println("Problem while crawling the website...");
		}
		
		return rawHtml.toString();
	}
 }
