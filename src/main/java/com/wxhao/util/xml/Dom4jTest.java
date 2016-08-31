package com.wxhao.util.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

public class Dom4jTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String xmlString="<root><aaa>wxhao</aaa></root>";
		try {
			
			
			//org.dom4j.Document
			Document document= DocumentHelper.parseText(xmlString);
			//dos/index.html 查看说明
			System.out.println(document.asXML());
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
