//*****享元模式总结*****//
享元模式：
定义：运用共享技术有效地支持大量细粒度对象的复用。
动机：
面向对象技术可以很好地解决一些灵活性或可扩展性问题,但在很多情况下需要在系统中增加类和对象的个数。当对象数量太多时，将导致运行代价过高，带来性能下降等问题。享元模式正是为解决这一类问题而诞生的。享元模式通过共享技术实现相同或相似对象的重用。
优点：
系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
享元模式是一个考虑系统性能的设计模式，通过使用享元模式可以节约内存空间,提高系统的性能。
大大减少了对象的创建，降低了程序内存的占用，提高效率。
缺点：
提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改变而改变,
适用场景：
系统中有大量对象时
这些对象消耗大量内存时。
这些对象的状态大部分可以外部化时
系统中存在大量相似对象
需要缓冲池的场景;