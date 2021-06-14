package com.company;

public class OrderCommand implements Command {
    private Operator receiver;
    private Order order;
    //一个执行者，一个执行目标
    public OrderCommand(Operator receiver,Order order){
        this.receiver=receiver;
        this.order=order;
    }
    @Override
    public void execute() {
        System.out.println(order.getId()+"号顾客的成品");
        receiver.MarkFruit(order);
    }
}
