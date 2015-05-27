public class wintergreen
{ 	
	public void wintergreen_28_3(Double hco3,Double Paco2)                 //(28.3) for primary met acidosis
	{   Double expected_Paco2; 
		expected_Paco2 = ((1.5*hco3) + 8);
		if(Paco2<(expected_Paco2 - 2))                            // Expected PaCO2 = (1.5 × HCO3) + (8 ± 2)                 
		System.out.println("with superimposed respiratory alkalosis");
		else if((Paco2>(expected_Paco2 + 2))&&(Paco2<45))
    	System.out.println("Insufficient respiratory compensation");
    	else if(Paco2>45)
    	System.out.println("with superimposed respiratory acidosis");   
    	else
    	System.out.println("Sufficient Respiratory Compensation");
	}

	public void wintergreen_28_4(Double hco3,Double Paco2)               //(28.4)  for primary met alkolosis
	{   Double expected_Paco2;
		expected_Paco2 = ((0.7*hco3) + 21);
		if(Paco2<(expected_Paco2 - 2))
		System.out.println("with superimposed respiratory alkalosis");       //Expected PaCO2 = (0.7 × HCO3) + (21 ± 2)    
		else if(Paco2>(expected_Paco2 + 2))
	    System.out.println("with superimposed respiratory acidosis");   
	    else
	    System.out.println("with fully compensated");
	}


	public void wintergreen_28_5(Double pH,Double Paco2)            //(28.5)  for acute resp acidosis
	{   Double lower_limit_expected_pH, upper_limit_expected_pH; 
		lower_limit_expected_pH = (7.40 - (0.008*(Paco2-40)));
		upper_limit_expected_pH = (7.40 - (0.003*(Paco2-40)));
			if(pH<lower_limit_expected_pH)                                 //Expected pH = 7.40 − [0.008 × (PaCO2 − 40)]
		    System.out.println("Superimposed metabolic acidosis and no renal compenstaion");        
		else if((pH>=lower_limit_expected_pH)&&(pH<upper_limit_expected_pH))
			System.out.println("Insufficient Renal compenstaion");
		else if(pH==upper_limit_expected_pH)
			System.out.println("Sufficient Renal compensation");
	    else if(pH>upper_limit_expected_pH)   
	        System.out.println("Superimposed metabolic alkalosis");  
	    
	}
	     

	public void wintergreen_28_6(Double pH,Double Paco2)                //(28.6) for acute resp alkalosis       
	{   Double lower_limit_expected_pH , upper_limit_expected_pH; 
		upper_limit_expected_pH= (7.40 + (0.008*(40-Paco2)));
		lower_limit_expected_pH= (7.40 - (0.008*(40-Paco2)));
			if(pH<lower_limit_expected_pH)
		     System.out.println("Superimposed metabolic acidoosis and no renal compenstaion");//Expected pH = 7.40 + [0.008 × (40 − PaCO2)]           
		else if((pH>=lower_limit_expected_pH)&&(pH<upper_limit_expected_pH))
	         System.out.println("Insufficient Renal Compensation");
	    else if(pH==upper_limit_expected_pH)
	    	 System.out.println("Sufficient Renal compenstaion");
	    else if(pH>upper_limit_expected_pH)
	    	 System.out.println("Respiratory alkolosis");
	}

	/*void wintergreen_28_7(Double pH ,Double Paco2)                       
	{   Double expected_pH; 
		expected_pH = (7.40 - (0.008*(40-Paco2)));     //(28.7) for chronic resp acidosis  
		if(pH<expected_pH)                            
		System.out.println("superimposed metabolic acidoosis");   //Expected pH = 7.40 − [0.003 × (PaCO2 − 40)]                  
		else if(pH>expected_pH)
	    System.out.println("superimposed metabolic alkolosis");
	    else
	    System.out.println("fully compensated");
	}*/

	/*void wintergreen_28_8(Double pH,Double Paco2)                //(28.8) for chronic resp alkalosis       
	{   Double expected_pH; 
		expected_pH = (7.40 - (0.008*(40-Paco2)));
		if(pH<expected_pH)
		System.out.println("superimposed metabolic acidosis");          //Expected pH = 7.40 + [0.003 × (40 − PaCO2)]            
		else if(pH>expected_pH)
	    System.out.println("superimposed metabolic alkolosis");
	    else
	    System.out.println("fully compensated");
	}*/
	
}