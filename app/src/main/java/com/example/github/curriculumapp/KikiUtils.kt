package com.example.github.curriculumapp

import com.example.github.curriculumapp.ui.entity.DatabaseUtils
import com.example.github.curriculumapp.ui.entity.Experience
import com.example.github.curriculumapp.ui.entity.UserInfor
import java.util.*
import kotlin.collections.ArrayList

/**
 *   Created by zhangziyi on 9/9/20 16:32
 */
object KikiUtils {

    fun CreateUser():UserInfor{
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

        val task = arrayListOf<String>("Created a REST microservice for Freight Service that manages dynamic generated errors",
        "Performed unit tests and helped with integration with existing microservices",
            "Learned and completed Oneops training program, the Walmart’s cloud management and application lifecycle management platform")

        val exp1 = Experience(UUID.randomUUID().toString(),"Walmart., Bentonville, Arkansas, USA","12/2019 – Present",
        "Junior Backend Developer",task,"Java, Spring, SpringBoot, JPA, Jackson, Jetty, MySQL, Intellij, Git, Windows")
        val task2 = arrayListOf<String>("Conducted front-end and back-end programming.",
            "Developed user management, product, shopping cart, shipping address, payment and order modules.",
            "Participated in iterative development of 3.5-5.6 version of website.",
            "Paas experience with integration services OAUTH,OAUTH2.")

        val exp2 =  Experience(UUID.randomUUID().toString(),"NET SHANGHAI GUOMAI COMMUNICATION TECHNOLOGY CO. LTD., Shanghai, China","2017, 2017-2018",
        "Software Development Internr",task,"Java, JavaScript, HTML, CSS, Spring MVC, Spring, Mybatis, Guava, Jackson, Joda, React, Webpack, jQuery, Tomcat, MySQL, Intellij, Git, Windows, Linux")

        val list = arrayListOf<Experience>(exp1,exp2)
        var kiki = UserInfor(
            2,"kiki summer","3302 N. Dixieland Rd ∙ Rogers, Arkansas 72756",
            "786-625-2557","zengshuang.dl@gmail.com","https://www.linkedin.com/in/shuang-zeng/",
            "Dynamic software engineer with extensive experience playing key role in development of enterprise-level software." +
                    " Hands-on experience using technologies and tools including Java, " +
                    "JavaScript, Bootstrap, Angular, Node.js, and Spring Boot." +
                    " Personable team player with talent for collaborating with diverse cross-functional teams.",
             map,"Completed on-campus studies and currently taking distance education courses to complete a Master's Degree in Computer Science (Available for full-time, W-2 employment).",
            list
        )
//        DatabaseUtils.userInforCacheDao.cacheUserInfor()
        return kiki
    }
}