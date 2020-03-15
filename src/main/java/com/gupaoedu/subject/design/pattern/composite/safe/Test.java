package com.gupaoedu.subject.design.pattern.composite.safe;

public class Test {

    public static void main(String[] args) {

        File wps = new File("Wps.exe");
        Folder jin = new Folder("金山软件", 3);
        jin.add(wps);

        File word = new File("Word.exe");
        File ppt = new File("PowerPoint");
        File excel = new File("Excel.exe");
        Folder office = new Folder("办公软件",2);
        office.add(word);
        office.add(ppt);
        office.add(excel);
        office.add(jin);


        File qq = new File("QQ.exe");
        File weChat = new File("微信.exe");
        Folder root = new Folder("主目录",1);
        root.add(qq);
        root.add(weChat);
        root.add(office);

        root.show();
        root.list();
    }


}
