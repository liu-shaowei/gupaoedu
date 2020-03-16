package com.gupaoedu.subject.design.pattern.template;

public abstract class AbstractCourse {

    public final void createCourse(){
        postPreResource();
        createPPT();
        liveVideo();
        postResource();
        postHomework();
        if(needCheckHomework()){
            checkHomework();
        }
    }

    protected void postPreResource(){
        System.out.println("上传预习资料");
    }

    protected void createPPT() {
        System.out.println("制作PPT");
    }

    protected void liveVideo(){
        System.out.println("直播上课");
    }

    protected void postResource(){
        System.out.println("上传课件");
    }

    protected void postHomework(){
        System.out.println("上传作业");
    }

    protected abstract boolean needCheckHomework();


    protected abstract void checkHomework();


}
