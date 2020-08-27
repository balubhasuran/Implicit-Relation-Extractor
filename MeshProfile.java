import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class MeshProfile {

public static void main(String[] args)
{
    
	
    String filePath = "F:\\L.txt";
	String filePath1 ="F:\\G1.txt";
	String filePath2 = "F:\\M1.txt";
	
    BufferedReader br,br1,br2;
	String line = "";
    String split= "";
		
	
	

	 ArrayList<String> list = new ArrayList<String>();
	 ArrayList<String> list2 = new ArrayList<String>();

    try {    
			 br1 = new BufferedReader(new FileReader(filePath1));
			  br2 = new BufferedReader(new FileReader(filePath2));
		
		

   try {      
		while((line = br1.readLine()) != null)        {        
												list.add(line);
													  }
		while((line = br2.readLine()) != null)        {        
												list2.add(line);
													  }
 for(String foo: list)
								{
		for(String foos: list2)
								{
	int a=0,b=0,c=0,d=0;
	br = new BufferedReader(new FileReader(filePath));
   while((line = br.readLine()) != null)        {       

   
   
				int flagmesh=0;
				int flaggene=0;
		if(line.contains("<Gene>") || line.contains("<Mesh>") )
		{
				//System.out.println(line);				
								String pat="(?i)\\b"+foo+"\\b";
								Pattern res = Pattern.compile(pat);
								Matcher reMatchers = res.matcher(line);
								while(reMatchers.find()) {
			                              
									flagmesh=1;
									break;
				   
					    								}
							
								
								String patg="(?i)\\b"+foos+"\\b";
								Pattern resg = Pattern.compile(patg);
								Matcher reMatchersg = resg.matcher(line);
								while(reMatchersg.find()) {
			                              
							  flaggene=1;
							  break;
															}
							
															if(flaggene==1 && flagmesh==1)
															{
																a++;
															}
															else if(flaggene==1 && flagmesh==0)
															{
																b++;
															}
															else if(flaggene==0 && flagmesh==1)
															{
																	c++;
															}
		}
		else
		{
			d++;
		}
		
   }		
						
						System.out.println(foo+"\t"+foos+"\t"+a+"\t"+b+"\t"+c+"\t"+d);
				br.close();		
			}     			
																		
												
			 br1.close();		
   br2.close();			 

				}									       
		
   } catch (IOException e) {       // TODO Auto-Generated catch block       e.printStackTrace();
								}
		
  	
    
    } catch (FileNotFoundException e) {   // TODO Auto-Generated catch block   e.printStackTrace();
									  }

}
}