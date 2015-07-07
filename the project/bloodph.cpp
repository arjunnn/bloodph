#include <iostream.h>

int main(int argc, char *argv[])
{
	float ph; 
	cout<<"Hello, doc! here i am to help you find your patient's blood pH \n";
	cout<<" enter the value of pH found from the blood test! (just to croos check if ia m working fine !:P)";
	cin>>ph;
	if((ph>=7.36)&&(ph<=7.44))
	{
		cout<<"the patients ph is neutral";
	}
	else if(ph<7.36)
	{
		cout<<"DOC!, the patients blood is too acidic!";
	}
	else if(ph>7.44)
	{
		cout<<"DOC!, the patients blood is too alkaline"!
	}
		return 0;
}
