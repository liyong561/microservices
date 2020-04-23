package com.example.zoo.enventLoop;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * create by yongli on 2020-03-30 21:59
 */

public class StudentImpl implements Student {

    private boolean canWirte;
    private boolean canRead;

    @Override
    public void doBeforeWrite() {

    }

    @Override
    public void doBeforeRead() {

    }

    @Override
    public void write(OutputStream os) {

    }

    @Override
    public boolean canWrite() {
        return false;
    }

    @Override
    public void read(InputStream is) {

    }

    @Override
    public boolean canRead() {
        return false;
    }
}
