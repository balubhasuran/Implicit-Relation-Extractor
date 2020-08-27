import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class MeshABCD {

public static void main(String[] args)
{
    
	
    String filePath = "F:\\out1.txt";
	
	
    BufferedReader br;
	String line = "";
    String split= "";
		
	
	

	 ArrayList<String> list = new ArrayList<String>();
	

    try {    
			 br = new BufferedReader(new FileReader(filePath));
			  
		
		

   try {      
		while((line = br.readLine()) != null)        {        
												list.add(line);
													  }
		int len=list.size();
 for(int i=0;i<len;i++)
								{
								int a=0,b=0,c=0,d=0;
	   
	
								
								String val=list.get(i);
								String []foo= val.split(" ",2);
							for(int j=0;j<len;j++)
								{
								String vals=list.get(j);
								String []foos= vals.split(" ",2);
								int flagmesh=0;
								int flaggene=0;
							if(foo[0].equals(foos[0]))
							flagmesh=1;
							if(foo[1].equals(foos[1]))
							
							flaggene=1;
							
							
		
							
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
else
{
d++;
}
		
   }		
						
						System.out.println(foo[0]+"\t"+foo[1]+"\t"+a+"\t"+b+"\t"+c+"\t"+d);
				
			}     			
																		
												
			br.close();		

												       
		
   } catch (IOException e) {       // TODO Auto-Generated catch block       e.printStackTrace();
								}
		
  	
    
    } catch (FileNotFoundException e) {   // TODO Auto-Generated catch block   e.printStackTrace();
									  }

}
}