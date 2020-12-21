package com.demo.lib;


import com.demo.libs.MessageConstant;


public class Ravshan implements Worker {
    private final String process;
    private final String start;
    private final String finish;

    public Ravshan(String process, String start, String finish) {
        this.process = process;
        this.start = start;
        this.finish = finish;
    }


    @Override
    public String start() {
        return start == null ? MessageConstant.BEGIN_RAVSHAN : start;
    }

    @Override
    public String work() {
        return process;
    }

    @Override
    public String finish() {
        return finish == null ? MessageConstant.END_RAVSHAN : finish;
    }
}
