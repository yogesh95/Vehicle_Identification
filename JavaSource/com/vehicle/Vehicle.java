package com.vehicle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Vehicle {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		boolean flag = true;

		do {
			Scanner scan = new Scanner(System.in);

			System.out
					.println("Please Enter How many Vehicle Details Do you Want? :");
			int val = scan.nextInt();
			List<String> vehicleNameList = new ArrayList<String>();
			List vehicleDetailsList = new ArrayList();
			switch (val) {
			case 1:
				System.out.println("Please Eneter Vehicle Name yuou want");
				String vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println(vehicleNameList);
				vehicleDetailsList = getVehicleDetail(vehicleNameList);
				break;

			case 2:
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println(vehicleNameList);
				vehicleDetailsList = getVehicleDetail(vehicleNameList);
				break;

			case 3:
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println(vehicleNameList);
				vehicleDetailsList = getVehicleDetail(vehicleNameList);
				break;

			case 4:
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println(vehicleNameList);
				vehicleDetailsList = getVehicleDetail(vehicleNameList);
				break;
			case 5:
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println("Please Eneter Vehicle Name you want");
				vehicleName = scan.next();
				vehicleNameList.add(vehicleName);
				System.out.println(vehicleNameList);
				vehicleDetailsList = getVehicleDetail(vehicleNameList);
				break;
			default:
				System.out.println("Wrong Information Entered");
			}
			/*
			 * String enter = scan.next();
			 * 
			 * if ("Y".equalsIgnoreCase(enter)) { flag = true; } else {
			 */
			flag = false;
			// }

			System.out.println(flag);
		} while (flag);
		System.out.println("OUT OF THE LOOP");

		try {
			String filepath = "vehicleDetails/vehicleDetails.xml";
			File file = new File(filepath);
			if (file.exists()) {
				DocumentBuilderFactory docFactory = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(filepath);

				NodeList list = doc.getElementsByTagName("vehicle");

				System.out.println("Number of Total Vehicle Details Available "
						+ list.getLength());
			}
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException sae) {
			sae.printStackTrace();
		}

	}

	public static List getVehicleDetail(List<String> vehicleNameList) {
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer header = new StringBuffer();
		StringBuffer header1 = new StringBuffer();
		String data = null;
		header1.append("<vehicles>");
		List<String> vehicleDeatils = null;
		List<List> vehicleDetailsList = new ArrayList<List>();
		for (int i = 0; i < vehicleNameList.size(); i++) {
			vehicleDeatils = new ArrayList<String>();
			if ("bigwheel".equalsIgnoreCase(vehicleNameList.get(i))) {
				stringBuffer = new StringBuffer();
				header = new StringBuffer();
				// vehicleDeatils = new ArrayList<String>();
				stringBuffer
						.append("<vehicle>")
						.append("<id>")
						.append(vehicleNameList.get(i))
						.append("</id>")
						.append("<frame>")
						.append("<material>")
						.append("Plastic")
						.append("</material>")
						.append("</frame>")
						.append(
								"<wheels>"
										+ "<wheel>"
										+ "<position>Front</position><material>plastic</material></wheel>"
										+ "<wheel><position>rear Left</position><material>plastic</material></wheel><wheel><position>rear right</position><material>plastic</material></wheel></wheels><powertrain><human /></powertrain></vehicle>");
				data = header.append(stringBuffer).toString();
				vehicleDeatils.add(data);
			}

			if ("Bicycle".equalsIgnoreCase(vehicleNameList.get(i))) {
				stringBuffer = new StringBuffer();
				header = new StringBuffer();
				// vehicleDeatils = new ArrayList<String>();
				stringBuffer
						.append("<vehicle>")
						.append("<id>")
						.append(vehicleNameList.get(i))
						.append("</id>")
						.append("<frame>")
						.append("<material>")
						.append("metal")
						.append("</material>")
						.append("</frame>")
						.append(
								"<wheels><wheel><position>Front</position><material>metal</material></wheel><wheel><position>rear</position><material>metal</material></wheel></wheels><powertrain><human /></powertrain></vehicle>");
				data = header.append(stringBuffer).toString();
				vehicleDeatils.add(data);
			}

			if ("Motorcycle".equalsIgnoreCase(vehicleNameList.get(i))) {
				stringBuffer = new StringBuffer();
				header = new StringBuffer();
				// vehicleDeatils = new ArrayList<String>();
				stringBuffer
						.append("<vehicle>")
						.append("<id>")
						.append(vehicleNameList.get(i))
						.append("</id>")
						.append("<frame>")
						.append("<material>")
						.append("metal")
						.append("</material>")
						.append("</frame>")
						.append(
								"<wheels><wheel><position>Front</position><material>metal</material></wheel><wheel><position>rear</position><material>metal</material></wheel></wheels><powertrain><InternalCombustion/></powertrain></vehicle>");
				data = header.append(stringBuffer).toString();
				vehicleDeatils.add(data);

			}
			if ("HangGlider".equalsIgnoreCase(vehicleNameList.get(i))) {
				stringBuffer = new StringBuffer();
				header = new StringBuffer();
				// vehicleDeatils = new ArrayList<String>();
				stringBuffer
						.append("<vehicle>")
						.append("<id>")
						.append(vehicleNameList.get(i))
						.append("</id>")
						.append("<frame>")
						.append("<material>")
						.append("plastic")
						.append("</material>")
						.append("</frame>")
						.append(
								"<wheels></wheels><powertrain><Bernoulli/></powertrain></vehicle>");
				data = header.append(stringBuffer).toString();
				vehicleDeatils.add(data);
			}
			if ("Car".equalsIgnoreCase(vehicleNameList.get(i))) {
				stringBuffer = new StringBuffer();
				header = new StringBuffer();

				stringBuffer
						.append("<vehicle>")
						.append("<id>")
						.append(vehicleNameList.get(i))
						.append("</id>")
						.append("<frame>")
						.append("<material>")
						.append("metal")
						.append("</material>")
						.append("</frame>")
						.append(
								"<wheels>"
										+ "<wheel><position>front right</position><material>metal</material></wheel>"
										+ "<wheel><position>Front Left</position><material>metal</material></wheel>"
										+ "<wheel><position>rear right</position><material>metal</material></wheel>"
										+ "<wheel><position>rear left</position><material>metal</material></wheel>"
										+ "</wheels>"
										+ "<powertrain><human /></powertrain>"
										+ "</vehicle>");
				data = header.append(stringBuffer).toString();
				vehicleDeatils.add(data);
			}

			vehicleDetailsList.add(vehicleDeatils);
		}
		StringBuffer dataString = new StringBuffer();
		String dataDetails;

		for (int x = 0; x < vehicleDetailsList.size(); x++) {

			dataString = dataString.append(vehicleDetailsList.get(x));
		}
		String fileHeader = "<vehicles>";
		String fileFooter = "</vehicles>";
		String file = new String();
		dataDetails = dataString.substring(1, dataString.length() - 1);
		dataDetails = dataDetails.replaceAll("\\[", "");
		dataDetails = dataDetails.replaceAll("\\]", "");
		file = file.concat(fileHeader).concat(dataDetails).concat(fileFooter);
		String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n";
		xmlContent = xmlContent.concat(file);

		System.out.println(xmlContent);
		/*
		 * System.out.println("dataDetails :" + dataDetails); try { File
		 * fileCreate = new File("D:/vehicleDetails.xml"); FileWriter fileWriter
		 * = new FileWriter(fileCreate); fileWriter.write(xmlContent);
		 * fileWriter.write(file); fileWriter.flush(); fileWriter.close(); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */

		Document doc = convertStringToDocument(xmlContent);
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(
				"vehicleDetails/vehicleDetails.xml"));
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace();
		}

		return vehicleDetailsList;
	}

	private static Document convertStringToDocument(String xmlStr) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(
					xmlStr)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
