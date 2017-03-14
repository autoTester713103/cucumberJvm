package com.cucumber.commons.helpers;


import cucumber.runtime.java.picocontainer.PicoFactory;

public class PicoDependencyInjector extends PicoFactory {

    public PicoDependencyInjector() {
        addClass(SharedDriver.class);
    }
}
