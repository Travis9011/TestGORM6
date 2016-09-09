class BootStrap {

    def grailsApplication

    def init = { servletContext ->

        grailsApplication.config.objTest.providers.each{
            System.out.println("KEY: " + it.key)
        }
    }
    def destroy = {
    }
}
