package com.company;

public abstract class Apiece {
    protected String inKind;
    public Apiece(String inKind){
        this.inKind=inKind;
    }
    public abstract void Play(int x,int y);
}
