package com.christinchick.homeWork10.configuration;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:auth.properties"
})
public interface LoginAndPassword extends Config {

    @Key("browser")
    @DefaultValue("OPERA")
    Browser getBrowser();

    @Key("username")
    String username();

    @Key("password")
    String password();
}
