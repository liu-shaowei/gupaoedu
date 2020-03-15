package com.gupaoedu.subject.design.pattern.composite.xpath;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;

public class XpathXmlDemo {
    private static Document doc;
    private static XPath xPath;

    public static void main(String[] args) throws Exception {
//        init();
//        getRootELe();
//        getChildEle();
        System.out.println(XpathXmlDemo.class.getName());
    }

    private static void getChildEle() throws XPathExpressionException {
        NodeList nodeList = (NodeList) xPath.evaluate("/rss/*",doc,XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println(node.getNodeName()+"-------------"+node.getNodeValue());
        }
    }

    private static void getRootELe() throws XPathExpressionException {
        Node node = (Node) xPath.evaluate("/rss",doc, XPathConstants.NODE);
        System.out.println(node.getNodeName()+"-------------"+node.getNodeValue());
    }

    private static void init() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        String xmlPath = XpathXmlDemo.class.getResource("/xpath.xml").getPath();
        doc = db.parse(new FileInputStream(new File(xmlPath)));

        XPathFactory factory = XPathFactory.newInstance();
        xPath = factory.newXPath();
    }


}
