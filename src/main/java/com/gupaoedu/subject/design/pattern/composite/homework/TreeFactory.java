package com.gupaoedu.subject.design.pattern.composite.homework;

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

public class TreeFactory {

    private Integer DEFAULT_LEVEL = 1;

    public TreeBranch buildTree(){
        try {
            Document doc = getDocument();
            XPath xPath = getXpath();
            TreeBranch tree = new TreeBranch("root", DEFAULT_LEVEL);
            buildTreeBranch(tree, doc, xPath, "/root", DEFAULT_LEVEL+1);
            return tree;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("创建Tree失败！");
        }
    }

    private void buildTreeBranch(TreeBranch tree, Document doc, XPath xPath, String path, Integer level) throws XPathExpressionException {
        NodeList childNodes = (NodeList) xPath.evaluate(path + "/*", doc, XPathConstants.NODESET);
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            String childPath = buildPath(path, node.getNodeName());
            NodeList grandson = (NodeList) xPath.evaluate(childPath+"["+(i+1)+"]" + "/*", doc, XPathConstants.NODESET);
            if(grandson == null){
                TreeLeaf leaf = new TreeLeaf(node.getNodeName());
                tree.add(leaf);
            }else{
                TreeBranch branch = new TreeBranch(node.getNodeName(), level);
                tree.add(branch);
                buildTreeBranch(branch, doc,xPath, childPath+"["+(i+1)+"]", level+1);
            }
        }
    }

    private String buildPath(String path, String nodeName) {
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append("/");
        sb.append(nodeName);
        return sb.toString();

    }

    private Document getDocument() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        String url = TreeFactory.class.getResource("/tree.xml").getPath();
        return db.parse(new FileInputStream(new File(url)));
    }

    private XPath getXpath() {
        XPathFactory factory = XPathFactory.newInstance();
        return factory.newXPath();
    }

}
