package com.company;

public class OnePiece extends Apiece {
    public OnePiece(String inKind) {
        super(inKind);
    }

    @Override
    public void Play(int x, int y) {
        System.out.println("把"+inKind+"放在("+x+","+y+")的位置");
    }
}
