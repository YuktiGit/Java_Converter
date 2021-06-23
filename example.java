class example {
 public static void writeDataLineByLine(String filePath) {   
    File file = new File(filePath); 
    try { 
        FileWriter outputfile = new FileWriter(file); 
        CSVWriter writer = new CSVWriter(outputfile); 
        
        String[] header = { "Section Name", "Menu Name", "Channel ID", "User id" }; 
        writer.writeNext(header); 
        
        String[] data1 = { "Marketing", "Joe Smith", "3711", "kcraig" }; 
        writer.writeNext(data1); 
        String[] data2 = { "Overseas", "Jason Jones", "2553", "vcraig" }; 
        writer.writeNext(data2); 
        String[] data3 = { "Accounts", "Rick Jones", "7477", "jcraig" }; 
        writer.writeNext(data3); 
        String[] data4 = { "Marketing", "Jessica Rogers", "3486", "rcraig" }; 
        writer.writeNext(data4); 
        String[] data5 = { "Accounts", "Zachery Smith", "2574", "zcraig" }; 
        writer.writeNext(data5); 
       
        writer.close(); 
    } catch (IOException e) { 
        e.printStackTrace(); 
    } 
  }
}  