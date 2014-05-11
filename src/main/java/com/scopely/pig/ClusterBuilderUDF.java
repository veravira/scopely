package com.scopely.pig;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;

public class ClusterBuilderUDF extends EvalFunc<String>{
	TupleFactory mTupleFactory = TupleFactory.getInstance();
	String filename = "likes.csv";
	private HashMap<String, List<String>> myMap = new HashMap<String, List<String>>();
	public String exec(Tuple tuple) throws IOException {
        // expect price
        if (tuple == null || tuple.size()<1) {
        	System.out.println("ClusterBuilderUDF: requires one input parameter.");        	
        }
        try {
            String first = (String)tuple.get(0);  
            myMap = buildMapFromData();
            String brucket = generateUIDByTitle(first, myMap); 
            return brucket;
        }
        catch (Exception e) {
            throw new IOException("Builder: caught exception processing input.", e);
        }
    }
    		
	private HashMap<String, List<String>> buildMapFromData()
	{
		// from all the data build map of UID as key and
		// values as list of like titles
		return myMap;
	}
    private String generateUIDByTitle(String title, Map<String, List<String>> dataMap) {
    	String uid = null;
    	
    	return uid;
    }

}

