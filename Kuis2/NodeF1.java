package Kuis2;

public class NodeF1 {
    DriverF1 dataDriver;
    NodeF1 prev, next;
    
    public NodeF1(NodeF1 prev, DriverF1 dataDriver, NodeF1 next) {
        this.prev = prev;
        this.dataDriver = dataDriver;
        this.next = next;
    }
}
