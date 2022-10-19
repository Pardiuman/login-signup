# login-signup

This is basically a web application which allows a user to sign up and login into website and after login it shows the contact page and
when the user sign up for the page it just collect the data nad put it into the database
## Tech Stack

**Spring:** Spring mvc

**ORM:** Hibernate

**Database:** Mysql

## Roadmap

- Create the Maven project

- Add maven dependencies like-mvc,jdbc connector,hibernate,orm etc.

- Create jsp pages

- Create a [controller class](firstapp/src/main/java/com/first/Firstapp.java)

- Add @RequestMapping to functions for map the urls

- Configure [project-servlet](firstapp/src/main/webapp/WEB-INF/firstapp-servlet.xml) file

- now make a [User.java class](firstapp/src/main/java/com.first/User.java)

- make [UserDao class](firstapp/src/main/java/com/first/UserDao.java)

- make [UserService class](firstapp/src/main/java/com/first/UserService.java)

## working of every Module

So making of this project contains three different pages of frontend - made with html and tailwind.css these are the front pages with th respective links of the pages. this is our First page Signup page this is our second page login page and our contactus page contact page you can visit the page source code by clicking the links above. After creating the JSP pages we have to map our pages with urls means what specific url shows which page. For doing this we create a class with @Controller which makes it a controller class which controls the whole program named Firstapp.java in this file we map all the urls with the help of @RequestMapping method this method accepts two parameters **first is ** path="/xyz and second is method="RequestMethod.Post . So doing these upper steps map our all the urls and perform a particular function for example if a user signup then all his details get into the particular method adn perform the tasks

and after doing all these we have to configure the servlet-projectname.xml file here we create the bean with view resolver and in property tag we have to tell them where the pages are and what type files are they for example-> suffix - .jsp view resolver helps us to view the mapped pages you can see the configuration file [firstapp-servlet](firstapp/src/main/webapp/WEB-INF/firstapp-servlet.xml) and after that we have to createa class named User in which we make the variable which are exactly same as the name of jsp page form attributes names so later on we can bind these with the help of the modelAttribute and model.

In the **ModelAttribute** we can bind all the data that came from jsp from to the class user variables.

and now we create UserDao class in which we make HibernateTemplate and make a function to savce the user

and then we create class UserService where we make a function createUser for creating the user for this we have to use the UserDao object and we use @Autowired so we have not manually make any beans and injectimng it Spring will do it automatically for us. and dont forget to make this class @Service


And finally we have to make beans for jdbc driver and Hibernatetemplate and we are done
hurray:)))))
