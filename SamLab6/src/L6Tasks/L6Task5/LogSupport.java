package L6Tasks.L6Task5;

interface LogSupport {
    default void log(String msg, Object obj){
        System.out.println("Class: " + obj.getClass().getName());
        System.out.println("Message: " + msg);
        System.out.println();
    }
    void log();
}
