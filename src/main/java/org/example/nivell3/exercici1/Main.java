package org.example.nivell3.exercici1;

//TODO investigar mas sobre Anotaciones personalizados y Reflect
public class Main {
    public static void main(String[] args) {
        try{
            Class<? extends ReflectionClass> reflectionClazz = ReflectionClass.class;
            if(reflectionClazz.isAnnotationPresent(ReflectionAnnotations.class)){
                ReflectionAnnotations annotations = reflectionClazz
                        .getAnnotation(ReflectionAnnotations.class);

                System.out.println("El path de directorio es " + annotations);
            }
        }catch (Exception e){
            System.out.println("ERROR: Customized annotations not found");
        }
    }
}
