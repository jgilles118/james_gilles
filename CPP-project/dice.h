#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;

//Default constructor
class dice{
        
        public:
                //Function to set the value rolled by a die to 1.
                dice();

                //Function to roll a die using a random number generator.
                int roll();

                //Function to return the value on the top face of the die.
                int getToss();

        private:
               int toss;
};                

//Defining the members of the functions.
dice::dice()
{
   //Initializing the Toss variable with the value of 1
   toss = 1;
   //Random number generator srand() and time() to return a value quickly
   srand(time(0));
}

int dice::roll()
{
   toss = rand() % 6 + 1;
   return toss;
}

int dice::getToss()
{
   return toss;
}

