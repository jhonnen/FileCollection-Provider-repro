val demoTask by tasks.registering {
    val files = project.files(provider { "someFile.txt" })

    println("config phase:")
    files.forEach { println(it) }
    doLast {
        println("execution phase:")
        files.forEach { println(it) }
    }
}
