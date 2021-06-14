package com.company;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Random random=new Random();
        PieceFactory pieceFactory= new PieceFactory();
        for(int i=0;i<19;i++)
            for(int j=0;j<19;j++)
            {
                Apiece p;
                if(random.nextInt()%2==0)
                    p=pieceFactory.GetPiece("白棋");
                else
                    p=pieceFactory.GetPiece("黑棋");
                p.Play(random.nextInt(19),random.nextInt(19));
            }
        System.out.println("总共棋子对象个数是"+pieceFactory.GetPieceCount());
    }
}
