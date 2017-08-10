package com.myapplicationdev.android.p12_mydatabook;

import java.io.Serializable;

/**
 * Created by 15017117 on 10/8/2017.
 */

public class Bio implements Serializable{
    private String content;

    public Bio() {
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {

        return content;
    }

    public void setContent(String content) {
        this.content = content;


    }

}

