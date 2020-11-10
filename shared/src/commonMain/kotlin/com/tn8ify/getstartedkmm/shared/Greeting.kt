package com.tn8ify.getstartedkmm.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    var count : Int = 0
    fun increment() {
        count += 1
    }
}
