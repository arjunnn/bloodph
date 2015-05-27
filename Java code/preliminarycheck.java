public class preliminarycheck extends wintergreen
{
	wintergreen wg = new wintergreen();
	public  void checkpostrouter(Double pH,Double Paco2,Double hco3)
	{
		if((pH>7.35)&&(pH<7.45))
		{
			if(Paco2<35)
			{
			System.out.println("mixed casse of respiratory alkalosis ");
		    wg.wintergreen_28_6(pH,Paco2); 
		    }
			else if(Paco2>45)
			{
				System.out.println("mixed case of respiratory acidosis ");
			wg.wintergreen_28_5(pH,Paco2);   
			// aniongap();         ??   		
 		    }
 		}
 		else if((Paco2>35)&&(Paco2<45))
 		{   
 			if(pH<7.35)
 			{
 				System.out.println("combined metabolic acidosis and respiratory alkalosis");
 		   		wg.wintergreen_28_3(hco3,Paco2);
 		    	//  aniongap();        ??
 		    }
 		    else if(pH>7.45)
 		    {
 		    	System.out.println("combined metabolic alkalosis and respiratory acidosis");
 		    	wg.wintergreen_28_4(hco3,Paco2);     
 		    }		
 		}
		else if ((pH<7.35)&&(Paco2<35))
		{
		System.out.println("primary metabolic acidosis");
 			wg.wintergreen_28_3(hco3,Paco2);
			//aniongap();
		}
		else if ((pH<7.35)&&(Paco2>45))
		{
		System.out.println("primary respiratory acidosis");
			wg.wintergreen_28_5(pH,Paco2);	
			//aniongap();
		}	
		else if((pH>7.45)&&(Paco2<35))
        {
        System.out.println("primary respiratory alkalosis");
        	wg.wintergreen_28_6(pH,Paco2);
        } 
        else if ((pH>7.45)&&(Paco2>45))
        {
        System.out.println("primary metabolic alkalosis");
        	wg.wintergreen_28_4(hco3,Paco2);
        }
        else	
        System.out.println("No logical acid base abnormality found");
	}
}	
