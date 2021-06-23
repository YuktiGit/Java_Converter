import java.io.*;
import org.json.simple.*;


class jsonArray{
    JSONArray jsonArry = new JSONArray();		
	FileWriter fw = new FileWriter(jsonFileName);	
	BufferedWriter bw = new BufferedWriter(fw);		
	while ((line = br.readLine()) != null) {
		JSONObject jObj = new JSONObject();		
		String[] dataLine = line.split(",");
		for(i=0;i<dataLine.length;i++){
			jObj.put(keyNames[i],dataLine[i]);		
		}
		jsonArry.add(jObj);						
	}
	bw.write(jsonArry.toJSONString());				
	bw.flush();
	return (true);									
 }
