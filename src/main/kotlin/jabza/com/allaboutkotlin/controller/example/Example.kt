package jabza.com.allaboutkotlin.controller.example

import com.thanabodee2661.kotlincommon.exception.InvalidException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Example {

    @GetMapping("/example")
    fun getExampleData(): String {
        throw InvalidException("test")
        return "Hello"
    }
}