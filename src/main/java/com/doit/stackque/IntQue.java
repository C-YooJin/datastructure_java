package com.doit.stackque;

public class IntQue {
    private int max;
    private int front;
    private int rear;
    private int[] que;
    private int num;        // 실제 큐에 들어간 데이터 갯수

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public void IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        }catch (OutOfMemoryError e) {
            max = 0;
        }
    }

}
