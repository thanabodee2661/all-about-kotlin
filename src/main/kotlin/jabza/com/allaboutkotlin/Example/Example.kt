package jabza.com.allaboutkotlin.Example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Example {

    @GetMapping("/example")
    fun getExampleData(): String {
        return "Hello"
    }
}