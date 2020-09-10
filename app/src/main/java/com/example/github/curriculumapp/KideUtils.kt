package com.example.github.curriculumapp

import com.example.github.curriculumapp.ui.entity.Experience
import com.example.github.curriculumapp.ui.entity.UserInfor
import java.util.*
import kotlin.collections.ArrayList

/**
 *   Created by zhangziyi on 9/9/20 22:16
 */
object KideUtils {

    fun CreateUser(): UserInfor {
        val languages = arrayListOf<String>("java","javascript","TypeScrip")
        val web = arrayListOf<String>("HTML","CSS","JSP","Thymeleaf","AJAX","jQuery","Node.js")
        val webService = arrayListOf<String>("RESTful","JSON")
        val webserver = arrayListOf<String>("Tomcat")
        val frameworks = arrayListOf<String>("Angular","Spring","Bootstrap")
        val databases = arrayListOf<String>("MySQL","MongoDB")
        val tools = arrayListOf<String>("IntelliJ IDEA","Visual Studio Code","Git","Jenkins")
        val platforms = arrayListOf<String>("Windows","Linux")
        val map:Map<String, ArrayList<String>> =
            mapOf("language" to languages,
                "web" to web, "webService" to webService,"webserver" to webserver,
                "frameworks" to frameworks, "database" to databases,"tools" to tools,
                "platforms" to platforms)

        val task = arrayListOf<String>(
            "Contributed in full project lifecycle, from design to deployment of microservices to EC2 instances using Spring-Boot",
            "Data persistence into MySQL and MongoDB using hibernate and using Spring-Batch to run batch operations for re-try transactions",
            "Continuously Build, test, deployment, release, and manage the configuration of all production systems using CI/CD tools like Jenkins.",
            "Created RESTful APIs/services in the backend while following SOLID, 12-Factor, OOP and OOD principles.",
            "Developed RESTful APIs synchronously and asynchronously (publishing and subscribing to Kafka events) while also using Java8 features like the streams API"
        )

        val exp1 = Experience(
            UUID.randomUUID().toString(),"OUTBOX HUB UGANDA, Kampala, Ugand","Jan 2016- April 2019",
            "Software Develope",task,"Java, JavaScript, React MySQL, HTML, CSS, Git, Tomcat, Maven, Bootstrap, MongoDB, Spring, Spring-Boot, REST, Hibernate, Eureka, AWS, Jenkins, Kafka, AWS.")
        val task2 = arrayListOf<String>(
            "Implemented daily routines for O&M for network to ensure alarms were captured and resolved.",
            "Facilitated system upgrades according to road maps and business requirements.",
            "Spearheaded network capacity planning and scalability."
        )

        val exp2 =  Experience(
            UUID.randomUUID().toString(),"VODAFONE UGANDA, Kampala, Uganda ","Jan 2014- Dec 2015",
            "Senior Software Engineer",task,"HTML, CSS, Git, JavaScript, Bootstrap, Git, Bash Scripting, NetAct, Cacti, Traffica, IP-Plan, Wireshark, Putty, Spring-Boot, Spring, Hibernate.")

        val list = arrayListOf<Experience>(exp1,exp2)
        var Lee = UserInfor(
            2,"Wagobera Kedi","Sunnyvale, California",
            "650.695.3640","wagoberakedi@gmail.com","https://www.linkedin.com/in/wagobera-kedi/",
            "Motivated Full Stack Java Developer with 5+ years of IT experience streamlining development of enterprise applications in Agile " +
                    "/ Scrum development environment. Problem solver who troubleshoots and debugs to optimize code quality and maximize application performance. " +
                    "Skilled in backend design and system architecture while implementing Java, JavaScript, React, HTML, Ajax, REST, and MVC technologies.", map,
            "Completed on-campus studies and currently taking distance education courses to complete a Master’s Degree in Computer Science (Available for full-time, W-2 employment).",list
        )
//        DatabaseUtils.userInforCacheDao.cacheUserInfor()
        return Lee
    }
}