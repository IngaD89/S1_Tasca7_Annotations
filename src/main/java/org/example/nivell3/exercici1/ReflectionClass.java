package org.example.nivell3.exercici1;

@ReflectionAnnotations
public class ReflectionClass {
    private String title;

    public ReflectionClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ReflectionClass{" +
                "title='" + title + '\'' +
                '}';
    }
}
