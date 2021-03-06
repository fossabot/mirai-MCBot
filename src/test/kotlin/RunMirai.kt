package layou233.mcbot.test

import layou233.mcbot.PluginMain
import net.mamoe.mirai.alsoLogin
import net.mamoe.mirai.console.MiraiConsole
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.enable
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.load
import net.mamoe.mirai.console.terminal.MiraiConsoleTerminalLoader

suspend fun main() {
    MiraiConsoleTerminalLoader.startAsDaemon()

    PluginMain.load()
    PluginMain.enable()
/*    val bot = MiraiConsole.addBot(233, "") {
        fileBasedDeviceInfo()
    }.alsoLogin()
*/

    MiraiConsole.job.join()
}