package keywordDriven;
import org.testng.annotations.Test;

public class Execution {
	

@Test    
	public static void main(String[] args) throws Exception
	{
	

			String path = "C:\\FSO\\SanityTesting\\SNTY-0005.xlsx";
			Excelutility.setexcel(path, 0);
			int rows = Excelutility.getRowCount(0);		

		for(int i=0; i<rows; i++)
		{
			String objectType = Excelutility.getdata(i, 3);
			String objectName = Excelutility.getdata(i, 4);
			String keyword = Excelutility.getdata(i, 5);
			String data = Excelutility.getdata(i, 6);
	
			
         if(keyword.equals("OPENBROWSER"))
        {
				
        	Actionkeywords.OPENBROWSER();
        	
        }
			else if(keyword.equals("NAVIGATEURL"))
			{
				Actionkeywords.NAVIGATEURL(data);
				
			}
         
			else if(keyword.equals("CHECKURL"))
			{
				Actionkeywords.CHECKURL(data);
			}
         
			else if(keyword.equals("WAIT"))
			{
				Actionkeywords.WAIT(data);
			}
         
			else if(keyword.equals("ENTERTEXT"))
			{
				
				Actionkeywords.ENTERTEXT(objectType, objectName, data);
			}
			else if(keyword.equals("CLICKBUTTON"))
			{
				Actionkeywords.CLICKBUTTON(objectType, objectName);
			}
			else if(keyword.equals("CloseBrowser")) 
			{
				Actionkeywords.CloseBrowser();
			}
			else if(keyword.equals("UPLOADFILE"))
			{				
				Actionkeywords.UPLOADFILE(objectType, objectName, data);
			}
			else if(keyword.equals("SELECTDROPDOWN"))
			{				
				Actionkeywords.SELECTDROPDOWN(objectType, objectName, data);
			}
			else if(keyword.equals("EnterWhitelistedCN"))
			{
				Actionkeywords.EnterWhitelistedCN(objectType, objectName);
			}
			else if(keyword.equals("RandomDate"))
			{
				Actionkeywords.RandomDate(objectType, objectName);
			}
		    
			else if(keyword.equals("OPENNEWTAB"))
		{
				Actionkeywords.OPENNEWTAB(data);
			
		}
			else if(keyword.equals("COPY"))
			{
				Actionkeywords.COPY(objectType, objectName);
			}
			else if(keyword.equals("PASTE"))
			{
				Actionkeywords.PASTE(objectType, objectName);
			}
			else if(keyword.equals("WaitLogger"))
			{
				Actionkeywords.WaitLogger(objectType, objectName);
			}
			else if(keyword.equals("IDLE"))
			{
				Actionkeywords.IDLE(data);
			}
         
		}

	}
}
