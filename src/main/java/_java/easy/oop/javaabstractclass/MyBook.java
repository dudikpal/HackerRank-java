package _java.easy.oop.javaabstractclass;

class MyBook extends Book{
    
    @Override
    void setTitle(String s) {
    
        super.title = "The title is: " + s;
    
    }
}
