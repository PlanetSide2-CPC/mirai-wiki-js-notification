package site.ps2cpc

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object WikiJsNotification : KotlinPlugin(
        JvmPluginDescription(
                id = "site.ps2cpc.wiki",
                name = "Wiki Js Notification",
                version = "0.1.0",
        ) {
            author("Ecss 11")
            info("""WIKI.JS QQ 通知机器人""")
        }
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}