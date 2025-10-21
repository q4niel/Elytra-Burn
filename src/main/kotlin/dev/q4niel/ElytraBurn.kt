package dev.q4niel

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ElytraBurn : ModInitializer {
    val modID_: String = "elytra_burn";

    private val _logger_ = LoggerFactory.getLogger(modID_);
    fun print(string: String): Unit = _logger_.info(string);

	override fun onInitialize() {}
}