package com.wxhao.util.xml;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try {
			
			
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			//创建新的doc对象
			Document doc= builder.newDocument();
			
			Element root=doc.createElement("Languages");
			root.setAttribute("cat", "it");
			//创建节点
			Element lan1=doc.createElement("lan");
			//创建节点属性和值
			lan1.setAttribute("id", "1");
			//创建节点
			Element name1=doc.createElement("name");
			//设置节点值
			name1.setTextContent("Java");
			Element ide1=doc.createElement("ide");
			ide1.setTextContent("Eclipse");
			//添加至上级节点
			lan1.appendChild(name1);
			lan1.appendChild(ide1);
			
			root.appendChild(lan1);
			doc.appendChild(root);
			
			//转换类
			TransformerFactory transformerFactory =TransformerFactory.newInstance();
			Transformer transformer=transformerFactory.newTransformer();
			StringWriter writer=new StringWriter();
			
			
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			//输出XML
			System.out.println(writer.toString());
			
			//输入成文件
			transformer.transform(new DOMSource(doc), new StreamResult(new File("newXML.xml")));
			
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}

	}

}
