package com.codegym.task.task33.task3309;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/*
Comments inside XML

*/
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws JAXBException {
        StringWriter writer = new StringWriter();
        String result = null;
        //Create JAXB Context
        JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());

        //Create Marshaller
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        //Required formatting??
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Write XML to StringWriter
        jaxbMarshaller.marshal(obj, writer);

        //Verify XML Content
        String xmlContent = writer.toString();
        if (xmlContent.indexOf(tagName) > -1)
            result = xmlContent.replace("<" + tagName + ">", "<!--" + comment + "-->\n" + "<" + tagName + ">");
        else
            result = xmlContent;
        return result;
    }

    public static void main(String[] args) throws JAXBException {

    }
}