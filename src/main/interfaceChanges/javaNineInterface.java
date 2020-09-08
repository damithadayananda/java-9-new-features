package main.interfaceChanges;

public interface javaNineInterface {
    String JAVA_VERSION = "9";
    default void logVersion(String msg){
        log(msg);
    }
    default void logAuthor(String msg){
        log(msg);
    }
    private void log(String msg){
        System.out.println(msg);
    }
}
