package jabza.com.allaboutkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
	scanBasePackages = ["com.thanabodee2661", "jabza.com"]
)
class AllAboutKotlinApplication

fun main(args: Array<String>) {
	runApplication<AllAboutKotlinApplication>(*args)
}
