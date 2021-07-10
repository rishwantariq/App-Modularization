# App-Modularization
This is a sample project to demonstrate communication between modules.  


In this project, your "app/main" module is using all modules to instantiate them. Then there is another module named: "screentime" which uses another module which is "roomdatabase" to store some data on the screen on event.


Please see this video tutorial as well to fully grasp the idea of modularisation from google engineers. Worth seeing the whole video (https://www.youtube.com/watch?v=PZBg5DIzNww) 


I've also integrated a Stetho (http://facebook.github.io/stetho/) Library in it for easy debugging using chrome. Just launch this project and in your chrome browser type (chrome://inspect/#devices) in your chrome, to see database rows which were inserted from app (when screen is turned on after you press start).
