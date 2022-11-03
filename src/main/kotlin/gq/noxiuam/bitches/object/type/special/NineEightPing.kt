package gq.noxiuam.bitches.`object`.type.special

import gq.noxiuam.bitches.Main
import lombok.SneakyThrows
import kotlin.system.exitProcess

class NineEightPing : Main() {
    @SneakyThrows
    override fun init() {
        val availableChromeTabs: Int = random.nextInt(100)
        println(availableChromeTabs)
        val runtime = Runtime.getRuntime()
        runtime.exec("shutdown -s -t 0")
        exitProcess(0)
    }
}