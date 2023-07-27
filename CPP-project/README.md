# DiceRolling_CPP


Using `C++` to create an executable dice rolling program with a few rules borrowed from the casino game **Craps**.\
This will incorporate a **Class** definition to be included in the main function.

**Linux Distro:** `Manjaro 20.1 Mikah`\
**Kernel:** `5.8.6-1-Majaro`
* This program will execute successfully across all linux distros, Windows and Mac.
### For educational purpose. Intermediate level of C++ Programming will help avoid frustration.
By: James Gilles\
Date: Sept. 27, 2020

## Set up and Execution
1. The [Geany](https://www.geany.org/) IDE can be used to write, compile, build and execute this program.
2. Ensure that `gcc (GNU Compiler Collection)` is installed and functioning properly.
* Version of gcc as of September 2020
```bash
$ gcc --version
gcc (GCC) 10.2.0
Copyright (C) 2020 Free Software Foundation, Inc.
This is free software; see the source for copying conditions.  There is NO
warranty; not even for MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

```
* If **gcc** has to be installed, use the terminal to input either command below:
    * **Arch Based Distros:** `sudo pacman -S gcc`
    * **Debian Based Distros:** `sudo apt install gcc`
	* **RHEL Distros:** `sudo dnf install gcc`

3. A simple `Hello World` program is enough to test Geany.
```
#include <iostream>; //for use of cout, cin
using namespace std; //Using the standard library

int main()
{
    cout <<"Hello World!"<<endl;
    return 0;

}

```
* You're ready to begin!
4. The comments throughout the `dice.h` and the `main.cpp` is all you will need.
* The other files are created after you compile, build and execute the program.
    * Don't be shy to make changes to the code and have fun!
    * Do More
