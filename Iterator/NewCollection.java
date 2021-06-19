package com.company;

public class NewCollection implements MyCollection {
    private Object[] obj={"dog","pig","cat","monkey"};
    @Override
    public MyIterator createIterator() {
        return (MyIterator) new NewIterator();
    }
    private class NewIterator implements MyIterator{
        private int currentIndex=0;
        public void first(){
            currentIndex=0;
        }
        public void next(){
            if(currentIndex<obj.length){
                currentIndex++;
            }
        }
        public boolean isLast(){
            return currentIndex==obj.length;
        }
        public Object currentItem(){
            return obj[currentIndex];
        }
    }
}
