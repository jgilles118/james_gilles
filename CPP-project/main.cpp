#include<iostream>
#include"dice.h"
using namespace std;

//To avoid warnings or errors while typing the code, create the dice.h file first
//Program that will use the 'dice.h' class
int main()
{
        //Declaring the dice used.
        dice die_1;
        dice die_2;

        cout <<"Initial value of Die 1: " << die_1.getToss()<<endl;
        cout <<"Initial value of Die 2: " << die_2.getToss()<<endl<<endl;

        //Rolling the dice
        cout <<"Rolling Die 1: " << die_1.roll()<<endl;
        cout <<"Rolling Die 2: " << die_2.roll()<<endl;

        //Adding the reults.
        cout <<"Calculating first roll: " << die_1.getToss() + die_2.getToss()<<endl<<endl;
        if ((die_1.getToss() + die_2.getToss() == 2) || (die_1.getToss() + die_2.getToss() == 3) || (die_1.getToss() + die_2.getToss() == 12))
        {
                cout <<"Snake Eyes...You lose!!!!"<<endl<<endl;
                getchar();
        }
		
		if (die_1.getToss() + die_2.getToss() == 7)
        {
                cout <<"Winner, winner!!!!"<<endl<<endl;
        }
        
        //Second dice toss.
        
        cout <<endl<<"Rolling Die 1: " << die_1.roll()<<endl;
        cout <<"Rolling Die 2: " << die_2.roll()<<endl;

        cout <<"Calculating second roll: " << die_1.getToss() + die_2.getToss()<<endl;
        if (die_1.getToss() + die_2.getToss() == 2)
        {
                cout <<"Snake Eyes...You lose!!!!"<<endl<<endl;
        }
        
        if (die_1.getToss() + die_2.getToss() == 7)
        {
                cout <<"Winner, winner!!!!"<<endl<<endl;
        }


}//close main.
