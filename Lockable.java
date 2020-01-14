public interface Lockable {
    void setKey(int oldKey , int key);
    boolean locked();
    void lock(int key);
    void unlock(int key);
}
