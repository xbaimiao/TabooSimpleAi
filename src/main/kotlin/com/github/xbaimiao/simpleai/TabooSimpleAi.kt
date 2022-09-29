package com.github.xbaimiao.simpleai

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

object TabooSimpleAi : Plugin() {

    override fun onEnable() {
        info("成功运行 TabooSimpleAi!")
        info("本插件为变相使用TabooLib中的AI接口")
    }
}