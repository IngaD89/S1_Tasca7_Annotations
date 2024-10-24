package org.example.nivell2.exercici1;

@CustomAnnotations
public class ObjectToSerialize {
    private String title;

    public ObjectToSerialize(){}
    public ObjectToSerialize(String title) {
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
        return "ObjectToSerialize{" +
                "title='" + title + '\'' +
                '}';
    }
}
