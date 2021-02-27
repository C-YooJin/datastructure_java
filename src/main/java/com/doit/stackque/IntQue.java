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

    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num ++;

        if(rear == max)     // 만약 rear과 max값이 같은 경우 rear을 que[0]의 위치로 옮겨줌
            rear = 0;

        return x;
    }

    // 큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front ++];
        num--;

        if(front==max)
            front = 0;

        return x;
    }

}
