# WeatherApp
Language used: Python3\
OS: Manjaro 20.0.3\
By: James Gilles
## Instructions
1) Tkinter should come by default with Python3.
Test from terminal by typing: **python -m tkinter**\
A simple window should appear. If you receive a "Tk not configured" error, Tk may need to be installed.
Although I am using Manjaro, here is a list of commands used to install Tkinter for other distros.\
**pacman**: `sudo pacman -S tk`\
**apt**: `sudo apt install python3-tk`\
**dnf**: `sudo dnf install python3-tkinter`\
**yum**: `yum install tkinter tk-devel`
``` bash
$ sudo pacman -S tk
$ sudo apt install python3-tk
$ sudo dnf install python3-tkinter
$ yum install tkinter tk-devel
```
CentOS is going to be discontinued in 2021, therefore, I did not include the `dnf` cli install.

---
You may need to install 2 more libraries: \
2) First install PIP by typing from command line: **sudo pacman -S python-pip**
``` bash
$ sudo pacman -S python-pip
```
* Requests - API handler
* Pillow - The python imaging library
	* Run these install commands in the terminal
	``` bash
	$ pip install reqeusts
	$ sudo pacman -S python-imaging
	```
4) Sign-up to: https://openweathermap.org/api it's FREE!!
	* Copy the FREE api key and continue.

## Python Documentation and instructional video
### Fonts has to properly incorporated within the .py script\
More help with Tkinter and Python can be found at the link below\
https://www.tutorialspoint.com/python

For the instructional video that was followed for this project\
Visit YouTuber: [Keith Galli](https://www.youtube.com/watch?v=D8-snVfekto)\
Practice always make perfect!
