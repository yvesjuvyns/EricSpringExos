module house.com {
    open module spring{
    requires spring.core;
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires java.annotation;
    //requires org.aspectj.weaver;
}
}