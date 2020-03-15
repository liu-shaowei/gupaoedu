package com.gupaoedu.subject.design.pattern.delegate;

public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("海报图", new Leader());
        boss.command("买手机", new Leader());
    }
}
