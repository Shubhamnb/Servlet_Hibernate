package com.practice.json;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridge.LinkedListComDataPro.CompanyStock;

public class ObjectMapperJSON {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			
			/*
			 * MyPojo pojo = mapper.readValue(new File("simpleJson.json"), MyPojo.class);
			 * System.out.println(pojo.getName());
			 * 
			 * 
			 * 
			 * Car car = mapper.readValue(new File("CarJson.json"), Car.class);
			 * System.out.println(car.getId());
			 * 
			 * 
			 * 
			 * 
			 * Car car1 = new Car(23, "Draco");
			 *  mapper.writeValue(new File("CarJson.json"),car1);
			 */
			JsonNode rootNode = mapper.readTree(new File("companyStock.json"));
            JsonNode inventry = rootNode.get("StockDetails");
            CompanyStock[] com = mapper.readValue(inventry, CompanyStock[].class);
            
			ArrayList list = new ArrayList();
            Iterator<JsonNode> it = inventry.iterator();
            
            while(it.hasNext()) {
            	list.add(it.next());
            }
            System.out.println(list);
             for (JsonNode jsonNode : inventry) {
				System.out.println(jsonNode);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
