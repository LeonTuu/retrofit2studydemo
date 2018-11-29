package com.mieasy.retrofit2studydemo.module;

import dagger.Module;
import dagger.Provides;
@Module
public class ShangjiaAModule {

    @Provides
    public Baozi provideBaozi() {
        return new Baozi("豆沙包");
    }
    @Provides
    public Noodle provideNoodle() {
        return new Noodle();
    }
}
