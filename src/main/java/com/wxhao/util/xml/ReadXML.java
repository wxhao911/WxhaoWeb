package com.wxhao.util.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			
			DocumentBuilder builder=factory.newDocumentBuilder();
			//读取文件
			Document doc= builder.parse(new File("languages.xml"));
			//获取根节点元素
			Element root=doc.getDocumentElement();
			System.out.println("cat="+root.getAttribute("cat"));
			NodeList list=root.getElementsByTagName("lan");
			for (int i = 0; i < list.getLength(); i++) {
				Element ele=(Element)list.item(i);
				System.out.println("---------------");
				System.out.println("id="+ele.getAttribute("id"));
				
				//获取ele节点下的元素
				NodeList cList =ele.getChildNodes();
				for (int j = 0; j < cList.getLength(); j++) {
					Node c=cList.item(j);
					//去空格
					if(c instanceof Element){
						//获取该元素名称和值
						System.out.println(c.getNodeName()+"="+c.getTextContent());
					}
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
