package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        //创建订单
        Order order1= new Order();
        order1.setId("1");
        order1.setFruitmap("橙子",1);
        order1.setFruitmap("苹果",2);
        order1.setFruitmap("梨子",3);
        Order order2= new Order();
        order2.setId("2");
        order2.setFruitmap("香蕉",1);
        order2.setFruitmap("葡萄",2);
        order2.setFruitmap("西瓜",3);
        //创建操作者
        Operator op=new Operator();
        //将多个订单封装成命令对象
        OrderCommand cmd1=new OrderCommand(op,order1);
        OrderCommand cmd2=new OrderCommand(op,order2);
        //创建调用者并加命令
        WaiterInvoker waiterInvoker=new WaiterInvoker();
        waiterInvoker.setCommand(cmd1);
        waiterInvoker.setCommand(cmd2);
        //执行命令
        waiterInvoker.OrderUp();
    }
}
