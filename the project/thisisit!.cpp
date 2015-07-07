#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
float hco3;
float pH;
float Paco2;
float Na,Cl,measuredalbumin,calculatedaniongap,adjustedaniongap;

void aniongap()
{
	calculatedaniongap = Na - (Cl + hco3);
	if((calculatedaniongap>8)&&(calculatedaniongap<16))
	{
		cout<<"Normal Anion Gap";
	}
	else if (calculatedaniongap>16)
	{
		cout<<"Elevated Anion Gap";
	}

	if((measuredalbumin>14)&&(measuredalbumin<16))
	{
		adjustedaniongap= calculatedaniongap + 2.5 * (4.5-measuredalbumin);
        
	}

}
void getvalues()
{  
cout<<"Enter the value of pH:"<<endl;
cin>>pH;
cout<<"Enter the value of hco3:"<<endl;
cin>>hco3;
cout<<"Enter the value of CO2:"<<endl;
cin>>Paco2;
cout<<"Enter the value of Na:"<<endl;
cin>>Na;
cout<<"Enter the value of Cl:"<<endl;
cin>>Cl;
cout<<"Enter the value of measuredalbumin:"<<endl;
cin>>measuredalbumin;
}

void wintergreen_28_3(float hco3,float Paco2)                 //(28.3) for primary met acidosis
{   float expected_Paco2; 
	expected_Paco2 = ((1.5*hco3)+8);
	if(Paco2<(expected_Paco2 - 2))                            // Expected PaCO2 = (1.5 × HCO3) + (8 ± 2)                 
	cout<<"with superimposed respiratory alkalosis"<<endl;
	else if((Paco2>(expected_Paco2 + 2))&&(Paco2<45))
    cout<<"Insufficient respiratory compensation";
    else if(Paco2>45)
    cout<<"with superimposed respiratory acidosis"<<endl;  
    else
    cout<<"Sufficient Respiratory Compensation";
}

void wintergreen_28_4(float hco3,float Paco2)               //(28.4)  for primary met alkolosis
{   float expected_Paco2; 
	expected_Paco2 = ((0.7*hco3)+21);
	if(Paco2<(expected_Paco2 - 2))
	cout<<"with superimposed respiratory alkalosis"<<endl;       //Expected PaCO2 = (0.7 × HCO3) + (21 ± 2)    
	else if(Paco2>(expected_Paco2 + 2))
    cout<<"with superimposed respiratory acidosis"<<endl;   
    else
    cout<<"with fully compensated"<<endl;
}


void wintergreen_28_5(float pH,float Paco2)   !!!!         //(28.5)  for acute resp acidosis
{   float lower_limit_expected_pH, upper_limit_expected_pH; 
	lower_limit_expected_pH = (7.40 - (0.008*(Paco2-40)));
	upper_limit_expected_pH = (7.40 - (0.003*(Paco2-40)));
		if(pH<lower_limit_expected_pH)                                 //Expected pH = 7.40 − [0.008 × (PaCO2 − 40)]
	    cout<<"Superimposed metabolic acidosis and no renal compenstaion"<<endl;        
	else if((pH>=lower_limit_expected_pH)&&(pH<upper_limit_expected_pH))
		cout<<"Insufficient Renal compenstaion";
	else if(pH=upper_limit_expected_pH)
		cout<<"Sufficient Renal compensation";
    else if(pH>upper_limit_expected_pH)   
        cout<<"Superimposed metabolic alkalosis"<<endl;  
    
}
     

void wintergreen_28_6(float pH,float Paco2)                //(28.6) for acute resp alkalosis       
{   float lower_limit_expected_pH , upper_limit_expected_pH; 
	upper_limit_expected_pH= (7.40 + (0.008*(40-Paco2)));
	lower_limit_expected_pH= (7.40 - (0.008*(40-Paco2)));
		if(pH<lower_limit_expected_pH)
	     cout<<"Superimposed metabolic acidoosis and no renal compenstaion"<<endl;         //Expected pH = 7.40 + [0.008 × (40 − PaCO2)]           
	else if((pH>=lower_limit_expected_pH)&&(pH<upper_limit_expected_pH))
         cout<<"Insufficient Renal Compensation"<<endl;
    else if(pH=upper_limit_expected_pH)
    	 cout<<"Sufficient Renal compenstaion";
    else if(pH>upper_limit_expected_pH)
    	 cout<<"Respiratory alkolosis";
}

/*void wintergreen_28_7(float pH ,float Paco2)                       
{   float expected_pH; 
	expected_pH = (7.40 - (0.008*(40-Paco2)));     //(28.7) for chronic resp acidosis  
	if(pH<expected_pH)                            
	cout<<"superimposed metabolic acidoosis"<<endl;   //Expected pH = 7.40 − [0.003 × (PaCO2 − 40)]                  
	else if(pH>expected_pH)
    cout<<"superimposed metabolic alkolosis"<<endl;
    else
    cout<<"fully compensated";
}*/

/*void wintergreen_28_8(float pH,float Paco2)                //(28.8) for chronic resp alkalosis       
{   float expected_pH; 
	expected_pH = (7.40 - (0.008*(40-Paco2)));
	if(pH<expected_pH)
	cout<<"superimposed metabolic acidoosis"<<endl;          //Expected pH = 7.40 + [0.003 × (40 − PaCO2)]            
	else if(pH>expected_pH)
    cout<<"superimposed metabolic alkolosis"<<endl;
    else
    cout<<"fully compensated";
}*/
           
/*void natureofacidosis(float hco3,float Paco2)
{
if(hco3<12&&Paco2>45)
{
cout<<"mixed acidosis"<<endl;
}
else if(hco3<12)
{
cout<<"metabolic acidosis"<<endl;
wintergreen_28_3(hco3,Paco2);
}
else if(Paco2>45)
{
cout<<"respiratory acidosis"<<endl;
wintergreen_28_5(Paco2,pH);
wintergreen_28_7(Paco2,pH);
}
else 
clarityneeded_acidic();
}
void natureofalkalosis(float hco3,float Paco2)
{
if(hco3>24&&Paco2<35)
{
cout<<"mixed alkolosis"<<endl;
}
else if(hco3>24)
{
cout<<"metabolic alkolosis"<<endl;
wintergreen_28_4(hco3,Paco2);
}
else if(Paco2<35)
{
cout<<"respiratory alkolosis"<<endl;
wintergreen_28_6(pH,Paco2);
wintergreen_28_8(pH,Paco2);
}
}
void natureofpH(float pH)
{
if(pH<7.35)
{
  cout<<"acidosis"<<endl;
  natureofacidosis(hco3,Paco2);
}
else if(pH>7.45)
{
  cout<<"alkalosis"<<endl;
  natureofalkalosis(hco3,Paco2);
}
else
{
cout<<"pH is neutral"<<endl;
}
}*/
 checkpostrouter(pH,Paco2) 
{
	    if((pH>7.35)&&(pH<7.45))
		{
			if(Paco2<35)
			{
			cout<<"mixed casse of respiratory alkalosis ";
		    wintergreen_28_6(pH,Paco2); 
		    }
			else if(Paco2>45)
			{
				cout<<"mixed case of respiratory acidosis ";
			    wintergreen_28_5(pH,Paco2);   
			// aniongap();         ??   		
 		    }
 		}
 		else if((Paco2>35)&&(Paco2<45))
 		{   
 			if(pH<7.35)
 			cout<<"combined metabolic acidosis and respiratory alkalosis";
 		    wintergreen_28_3(hco3,Paco2);
 		    //  aniongap();        ??
 		    else if(pH>7.45)
 		    cout<<"combined metabolic alkalosis and respiratory acidosis";
 		    wintergreen_28_4(hco3,Paco2);     

 		}
		else if ((pH<7.35)&&(Paco2<35))
		{
		cout<<"primary metabolic acidosis";
 		wintergreen_28_3(hco3,Paco2);
		//aniongap function call
		aniongap();
		}
		else if ((pH<7.35)&&(Paco2>45))
		{
		cout<<"primary respiratory acidosis";
		wintergreen_28_5(pH,Paco2);	
		//aniongap function call
		aniongap();
		}	
		else if((pH>7.45)&&(Paco2<35))
        {
        cout<<"primary respiratory alkalosis";
        wintergreen_28_6(pH,Paco2);
        } 
        else if ((ph>7.45)&&(Paco2>45))
        {
        cout<<"primary metabolic alkalosis";
        wintergreen_28_4(hco3,Paco2);
        }
        else	
        cout<<"No logical acid base abnormality found";

}
int main()
{

 getvalues();
 checkpostrouter(pH);

_getch(); 
}


