package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("HEDbEa3G84gAV8BnxSoEv3ySR8gIssvASeGCseoF")
                .clientKey("BtptbPogASMg7K7zZnbwyuzKTTG7x69BlcbJxckh")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
