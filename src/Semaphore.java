class Semaphore {
    protected int avail = 0 ;
    protected Semaphore() { avail = 0 ; }
    public Semaphore(int num) { avail = num; }
    public synchronized void acquire() {
        avail-- ;
        if (avail < 0)
        try {
            wait();
        }
        catch( InterruptedException e ) {
            e.printStackTrace();
        }
    }
    public synchronized void release() {
        avail++;
        if (avail >= 0)
            notify();
    }
}
