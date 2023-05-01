#!/usr/bin/python3

#This script was created from YouTuber mentioned in the README
#-------------------------------------------------------------

import tkinter as tk
from PIL import ImageTk,Image
import requests
from API-key import key1

#Assigning Tk() function to window
window = tk.Tk()

#Click action
# api.openweathermap.org/data/2.5/forecast?q={city name},{state code},{country code}&appid={your api key}
def search_weather(city):
    try:
        weather_key = key1
        url = 'https://api.openweathermap.org/data/2.5/weather'
        parameter = {'APPID':weather_key, 'q':city, 'units':'imperial'}
        response = requests.get(url, params=parameter)
        results = response.json()
        name = 'City: ' + results['name']
        skys = 'Skys: ' + results['weather'][0]['description']
        temp = 'Currently: ' + str(results['main']['temp'])
        accTemp = 'Feels like: ' + str(results['main']['feels_like'])
        humd = 'Humidity: ' + str(results['main']['humidity'])
        final = name + '\n' + skys + '\n' + temp + '\n' + accTemp + '\n' + humd
    except:
        final = 'No temperature in The Land of Make Believe!'

    #To display in the app
    label['text'] = final

#The widget title
window.title("Weather App")

#The widget size
winsize = tk.Canvas(window, height=400, width=800)
winsize.pack()

#Inserting the image
bg_image = ImageTk.PhotoImage(Image.open('Images/linuxLandScape3.jpg'))
bg_label = tk.Label(window, image=bg_image)
bg_label.place(relheight=1,relwidth=1)

#Frames and  colors
frame1 = tk.Frame(window, bg='#80c1ff', bd=6)
frame1.place(relx=0.5, rely=0.1,relheight=0.1, relwidth=0.75, anchor='n')

frame2 = tk.Frame(window, bg='#80c1fa', bd=6)
frame2.place(rely=0.25,relx=0.5, relheight=0.6,relwidth=0.75, anchor='n') 

#The search button
search = tk.Button(frame1, text="Peek out your window!", font=30, command=lambda: search_weather(userin.get()))
search.place(relx=0.7, relheight=1, relwidth=0.3) 

#Label
label = tk.Label(frame2)
label.place(relheight=1,relwidth=1)

#Input box
userin = tk.Entry(frame1, font=30)
userin.place(relheight=1, relwidth=0.65)

window.mainloop()
