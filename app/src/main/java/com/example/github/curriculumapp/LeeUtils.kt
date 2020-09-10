package com.example.github.curriculumapp

import com.example.github.curriculumapp.ui.entity.Experience
import com.example.github.curriculumapp.ui.entity.UserInfor
import java.util.*
import kotlin.collections.ArrayList

/**
 *   Created by zhangziyi on 9/9/20 22:16
 */
object LeeUtils {

    fun CreateUser(): UserInfor {
        val languages = arrayListOf<String>("java","javascript","KOTLIN")
        val web = arrayListOf<String>("HTML","CSS","JSP","Thymeleaf","AJAX","jQuery","Node.js")
        val webService = arrayListOf<String>("RESTful","JSON")
        val webserver = arrayListOf<String>("Tomcat")
        val frameworks = arrayListOf<String>("OKHTTP","Retrofit","RxJAVA")
        val databases = arrayListOf<String>("MySQL","MongoDB")
        val tools = arrayListOf<String>("IntelliJ IDEA","Visual Studio Code","Git","Jenkins","Gradle")
        val platforms = arrayListOf<String>("Windows","Linux")
        val map:Map<String, ArrayList<String>> =
            mapOf("language" to languages,
                "web" to web, "webService" to webService,"webserver" to webserver,
                "frameworks" to frameworks, "database" to databases,"tools" to tools,
                "platforms" to platforms)

        val task = arrayListOf<String>("\uF0B7Responsible for rapid application development. Ensure online on time.",
            "\uF0B7Participate in project discussions and provide professional technical support.",
            "\uF0B7Responsible for technical exchanges in business cooperation with other companies.",
        "\uF0B7Maintain a fast iterative development that is updated weekly. Make sure that new releases are released every week.",
        "\uF0B7Control the overall error rate. Responsible for statistical error rate, propose optimization plan  and execute.",
        "\uF0B7Reasonably arrange the work of the team members.")

        val exp1 = Experience(
            UUID.randomUUID().toString(),"HUAYUN ONLINE, Beijing, China","2017.4.30-2018.5.1",
            "Android Developer",task,"java,kotlin,OkHttp, Retrofit, RxJava, Picasso, Android Framework, SQL,MVVM")
        val task2 = arrayListOf<String>(
            "\uF0B7Produced clean, efficient Java code according to feature specifications.",
            "\uF0B7Tested and deployed programs and systems.",
            "\uF0B7Conducted troubleshooting, debugging, and upgrading of existing software.",
            "\uF0B7Successfully integrated software components and third-party programs.",
            "\uF0B7Completed independent module to be called by REST API."
        )

        val exp2 =  Experience(
            UUID.randomUUID().toString(),"PEOPLE'S DAILY, Beijing, China ","2014.6.30-2017.4.30",
            "Senior Software Engineer",task,"Java, OkHttp, Retrofit, RxJava, Fresco, Android Framework, SQL")

        val list = arrayListOf<Experience>(exp1,exp2)
        var Lee = UserInfor(
            2,"LEE ZHANG","4403 amador road \uF0B7 Fremont, California 94536",
            "641-451-3540","lizhangsoftwaer@gmail.com","https://www.linkedin.com/in/li-zhang-186064174",
            "Android developer ,mobile development\n" +
                    "Qualified software engineer with 5+ years of hands-on experience in the design and development of complex software solutions for commercial use. Organized and analytical, with a history of writing clean, readable code for Java and Android applications, contributing modular functionality which follows industry standards. Implemented several successful software solutions through their entire software development life cycle using modern technologies such as RxJava, and kotlin.",
            map,"Completed on-campus studies and currently taking distance education courses to complete a Master's Degree in Computer Science (Available for full-time, W-2 employment).",
            list
        )
//        DatabaseUtils.userInforCacheDao.cacheUserInfor()
        return Lee
    }
}