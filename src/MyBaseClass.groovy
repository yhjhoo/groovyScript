abstract class MyBaseClass extends Script {
    def sh(script) {
        def result = ['bash', '-c', script].execute().text
        println result
    }

    def commandLine(script) {
        def result = ['bash', '-c', script].execute().text
        println result
    }
}