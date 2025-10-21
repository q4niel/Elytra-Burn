package dev.q4niel

import com.moandjiezana.toml.Toml
import java.io.File

data class ModConfigFile (
    val rocketBoostDamage: Long = 8
)

object ModConfig {
    private var _config: ModConfigFile = ModConfigFile();
    private val _cfgFile_: File = File("config/${ElytraBurn.modID_}.toml");

    fun get(): ModConfigFile = _config;

    fun init() {
        if (!_cfgFile_.exists()) return;
        val toml = Toml().read(_cfgFile_);

        _config = ModConfigFile (
            toml.getLong("rocket_boost_damage", _config.rocketBoostDamage)
        );
    }
}