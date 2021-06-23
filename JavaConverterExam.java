package com.ncu.main;
import java.util.*;
import java.io.*;
import java.lang.*;

import com.ncu.validators.*;
import com.ncu.processors.*;


class JavaConverter {
    public static void main(String [] args) {
		
		String c,csvfilename,jsonfilename;
		boolean b;
		
		System.out.println("CSV FILE");
		csvfilename = "<Absolute path of csvs folder>" + getFileName();
		NameValidator csvObject = new NameValidator();
		b = csvObject.nameValidator(csvfilename,"csv");
		if(b==true)
			System.out.println("CSV File Name is OK..");
		
		System.out.println("JSON FILE");
		jsonfilename = "<Absolute path of jsons folder>" + getFileName();
		b = csvObject.nameValidator(jsonfilename, "json");
		if(b == true)
			System.out.println("JSON File Name is OK..");
		
		csvprocessor processorObj = new csvprocessor();
		b = processorObj.processCSV(csvfilename, jsonfilename);
		if(b = true)	
			System.out.println("...Converted...");
  }

   static String getFileName(){
		String filename = null;
		try{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter File Name : ");
			filename = in.nextLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return filename;
    }
}