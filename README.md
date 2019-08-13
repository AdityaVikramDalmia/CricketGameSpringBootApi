# CricketGameSpringBootApi
Api connected to mySQL to retrieve current game data


MatchResultApiSpringBoot
This project runs over a program in java which is set to running and which is located here

Steps to run project
start this project in Spring Tool Suite or any other spring supported IDE
Create a db named sys or change the application.properties file according to your port number & dbname
Start the java program downloaded from above
Make a call to the localhost:/scorecard/currscore, You can see the last updated match details

Classes Used
@Entity

MatchResult.java in com.cricketmatch.result.Model
@Repository

MatchRespository.java in com.cricketmatch.result.repository
@RestController

MatchResource.java in com.cricketmatch.result.resource
@SpringBootApplication

CricketResultsApplication.java in the root package
