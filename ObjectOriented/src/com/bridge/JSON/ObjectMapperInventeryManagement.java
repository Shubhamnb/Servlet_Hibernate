package com.bridge.JSON;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectMapperInventeryManagement {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			JsonNode rootNode = mapper.readTree(new File("JsonFile.json"));
            JsonNode inventry = rootNode.get("rice");
            Meals[] meals = mapper.readValue(inventry, Meals[].class);
          
			System.out.println("================Rice====================");
            System.out.println();
			for (JsonNode jsonNode : inventry) {
        	   System.out.println("         "+jsonNode);
            }
			System.out.println();
			System.out.println("================Pulses====================");
			System.out.println();
			rootNode = mapper.readTree(new File("JsonFile.json"));
			inventry = rootNode.get("pulses");
			for (JsonNode jsonNode : inventry) {
	        	   System.out.println("         "+jsonNode);
	         }
			
			System.out.println();
			System.out.println("================Wheat====================");
			System.out.println();
			rootNode = mapper.readTree(new File("JsonFile.json"));
			inventry = rootNode.get("wheats");
			for (JsonNode jsonNode : inventry) {
	        	   System.out.println("         "+jsonNode);
	         }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}