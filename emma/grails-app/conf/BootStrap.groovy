import emma.Tag
import emma.Task

import emma.auth.*


class BootStrap {

    def init = { servletContext ->

       /* def workTag = new Tag(name: "WOrk").save(failOnError: true)
        def homeTag = new Tag(name: "Home").save(failOnError: true)

        def task = new Task(
                summary: "Une tache par defau",
                details: "blablablbalbalbalblablbalbalbalbalb",
                deadline: new Date()

        )

        task.addToTags(workTag)
        task.addToTags(homeTag)
        task.save(failOnError: true)*/


        def role = Role.findByAuthority("ROLE_ADMIN")
        if(!role){
            role = new Role(authority: "ROLE_ADMIN").save()
        }
        def user = User.findByUsername("admin")
        if(!user){
            user = new User(username:"admin", password:"admin").save()
        }
        def userRole = UserRole.findByUserAndRole(user, role)
        if(!userRole){
            new UserRole(user: user,role: role).save()
        }





    }
    def destroy = {
    }
}
