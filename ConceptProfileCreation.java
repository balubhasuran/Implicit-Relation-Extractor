import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class ConceptProfileCreation {

public static void main(String[] args)
{
    
	
  
   String filePath = "F:\\Sentnece finder\\2.txt";
   String filePath1 = "F:\\Sentnece finder\\1.txt";
    
	
    BufferedReader br,br1; 
	String line = "";
	String line1 = "";
	String split= "";
	
	
	int count=0;
	  
	 

    try {    br = new BufferedReader(new FileReader(filePath));
			
		
		

   try {      while((line = br.readLine()) != null)        {            
					
					br1 = new BufferedReader(new FileReader(filePath1));
					Collection<String> gene = new ArrayList<String>();
					Collection<String> mesh = new ArrayList<String>();

					while((line1 = br1.readLine()) != null)        {            
				
			     
				 String [] result =line1.split(" ",2);
				 String cooccur=result[0].trim();
				
							
			    			
				 if(cooccur.equals(line))
				 {
					//System.out.println(line1);
					if(line1.contains("<gene>"))
					gene.add(result[1]);
					if(line1.contains("<mesh>"))
					mesh.add(result[1]);
				 }
						
						
																}	
											for(String foo: gene)
											{
												for(String foos: mesh)
												{
												 System.out.println(line+"\t"+foo+"\t"+foos);
												}
											}
		br1.close();     										
																
   }								
   
					 br.close();
					
					
										       
   
	}	   catch (IOException e) {       // TODO Auto-generated catch block       e.printStackTrace();
								}
		
   
    
    } catch (FileNotFoundException e) {   // TODO Auto-generated catch block   e.printStackTrace();
									  }

}
}
