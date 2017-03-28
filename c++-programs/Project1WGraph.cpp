/**
 *@author Brian Goodwin
 *@date 10-1-15
 *@brief This program uses eulers method of numerical approximation
 * to compute the values of y at a certain point t.
 * @note the original problem: (1+t^2)dy/dt=-2t(y+y^2); y(0)=1
 * @note the solution to the problem: y=1/2(t^2 +1)
**/
#include <iostream>
#include <cmath>
#include <cstdio>
#include <fstream>
using namespace std;

int main(int argc, char *argv[])
{
  const int MAX_STEPS_20=21; //# of steps
  const int MAX_STEPS_40=41; //# of steps
  const int MAX_STEPS_80=81; //# of steps
  
  float t[MAX_STEPS_20]; //t when h=.1
  float t2[MAX_STEPS_40]; //t when h=.05
  float t3[MAX_STEPS_80]; //t when h=.025
  
  double* f=new double[MAX_STEPS_20]; //f when h=.1
  double* f2=new double[MAX_STEPS_40]; //f when h=.05
  double* f3=new double[MAX_STEPS_80]; //f when h=.025
  
  double* y=new double[MAX_STEPS_20]; //y when h=.1
  double* y2=new double[MAX_STEPS_40]; //y when h=.05
  double* y3=new double[MAX_STEPS_80]; //y when h=.025
  
  float yExact[MAX_STEPS_20]; //y exact when h=.01
  float yExact2[MAX_STEPS_40]; //y exact when h=.05
  float yExact3[MAX_STEPS_80]; //y exact when h=.025
  
  double h[3]={.1,.05,.025}; //hold h values
  
  double* yErr=new double[MAX_STEPS_20]; //y error when h=.1
  double* yErr2=new double[MAX_STEPS_40]; //y error when h=.05
  double* yErr3=new double[MAX_STEPS_80]; //y error when h=.025
  
  double count[3]; //counter
  
  y[0]=1; //initial condition when h=.1
  y2[0]=1; //initial condition when h=.05
  y3[0]=1; //initial condition when h=.025
  
  t[0]=0; //initial condition when h=.1
  t2[0]=0; //initial condition when h=.05
  t3[0]=0; //initial condition when h=.025
  
  int i; //used in for loops
  
  for(i=0; i<3; i++)
  {
	count[i]=0; //initialize count variables
  }
  
  freopen("Solutions.txt","w+",stdout); //prints all output to text file
  ofstream solT;
  solT.open("SolDataT.dat"); //for graph
  ofstream solT2;
  solT2.open("SolDataT2.dat"); //for graph
  ofstream solT3;
  solT3.open("SolDataT3.dat"); //for graph
  ofstream solExact;
  solExact.open("SolExact.dat");
  cout<<"\tBrian Goodwin"<<endl;
  cout<<"\tProject1"<<endl;
  cout<<endl;
  
  cout<<"\t\tThe original problem: (1+t^2)dy/dt=-2t(y+y^2); y(0)=1"<<endl;
  cout<<"\t\tThe solution to the problem: y=1/2(t^2 +1)"<<endl;
  cout<<endl;
  cout<<"\t\tTHIS TABLE COMPUTES THE VALUES WHEN H=.1"<<endl;
  cout<<"\t\t________________________________________"<<endl;
  cout<<"\t\tT\t\tY\t\t\tYexact\t\tYerror%"<<endl;
  cout<<"\t\t----------------------------------------" <<endl;
  for(i =0; i<MAX_STEPS_20; i++) //when 20 steps
  {
	t[i]=count[0]; //set t values
	count[0]+=.1;
	f[i] =((-2*(t[i])*(y[i]+ pow(y[i],2)))/(1+ pow(t[i],2))); //compute f
	y[i+1] = (y[i]+f[i]*h[0]); //compute y
	
	yExact[i]= 1/((2*(pow(t[i],2)))+1); //compute y exact
	solT<<t[i]<<"  ";
	solT<<y[i]<<endl;
	solExact<<t[i]<<"  ";
	solExact<<yExact[i]<<endl;
	
	yErr[i] = abs(((yExact[i] - y[i])/yExact[i]))*100; //compue y error
	
	if(t[i]==0 ||t[i]==.5 ||t[i]==1 ||t[i]==1.5 ||t[i]==2) //print at certain t values
	{
	  printf("\t\t%.1f",t[i]);
	  
	  printf("\t\t%.4f",y[i]);
	 
	  printf("\t\t%.4f",yExact[i]);
	  
	  printf("\t\t%.2f%%",yErr[i]);
	  
	  cout<<endl;
	}
	
  }
  cout<<endl;
  cout<<endl;
  
  cout<<"\t\tTHIS TABLE COMPUTES THE VALUES WHEN H=.05"<<endl;
  cout<<"\t\t________________________________________"<<endl;
  cout<<"\t\tT\t\tY\t\t\tYexact\t\tYerror%"<<endl;
  cout<<"\t\t----------------------------------------" <<endl;
  for (i=0; i<MAX_STEPS_40; i++) //when 40 steps
  {
	t2[i]=count[1]; //set t values
	count[1]+=.05;
	f2[i] =((-2*(t2[i])*(y2[i]+ pow(y2[i],2)))/(1+ pow(t2[i],2))); //compute f
	y2[i+1] = (y2[i]+(f2[i]*h[1])); //compue y
	
	solT2<<t2[i]<<"  ";
	solT2<<y2[i]<<endl;
	
	yExact2[i]= 1/((2*(pow(t2[i],2)))+1); //compute y exact
	
	yErr2[i] = abs(((yExact2[i] - y2[i])/yExact2[i]))*100; //compute y error
	   
	if(t2[i]==0 ||t2[i]==.5 ||t2[i]==1 ||t2[i]==1.5 ||t2[i]==2) //print certain t values
	{
	  printf("\t\t%.1f",t2[i]);
	  printf("\t\t%.4f",y2[i]);
	  printf("\t\t%.4f",yExact2[i]);
	  printf("\t\t%.2f%%",yErr2[i]);
	  cout<<endl;
	}
	
	
  }
	
  cout<<endl;
  cout<<endl;
  cout<<"\t\tTHIS TABLE COMPUTES THE VALUES WHEN H=.025"<<endl;
  cout<<"\t\t________________________________________"<<endl;
  cout<<"\t\tT\t\tY\t\t\tYexact\t\tYerror%"<<endl;
  cout<<"\t\t----------------------------------------" <<endl;
  for (i=0; i<MAX_STEPS_80; i++) //when 80 steps
  {
	t3[i]=count[2]; //set t values
	count[2]+=.025;
	f3[i] =((-2*(t3[i])*(y3[i]+ pow(y3[i],2)))/(1+ pow(t3[i],2))); //compute f
	y3[i+1] = (y3[i]+(f3[i]*h[2])); //compute y
	
	solT3<<t3[i]<<"  ";
	solT3<<y3[i]<<endl;
	
	yExact3[i]= 1/((2*(pow(t3[i],2)))+1); //compute y exact
	
	yErr3[i] = abs(((yExact3[i] - y3[i])/yExact3[i]))*100; //compute y error
	   
	if(t3[i]==0 ||t3[i]==.5 ||t3[i]==1 ||t3[i]==1.5 ||t3[i]==2) //print for certain t values
	{
	  printf("\t\t%.1f",t3[i]);
	  printf("\t\t%.4f",y3[i]);
	  printf("\t\t%.4f",yExact3[i]);
	  printf("\t\t%.2f%%",yErr3[i]);
	  cout<<endl;
	}
  }
   
}