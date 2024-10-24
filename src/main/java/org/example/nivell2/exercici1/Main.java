package org.example.nivell2.exercici1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ObjectToSerialize objectToSerialize = new ObjectToSerialize("Objeto para serializar");
        ObjectMapper mapper = new ObjectMapper();

        try {
            String directoryPath = objectToSerialize
                    .getClass()
                    .getAnnotation(CustomAnnotations.class)
                    .directory();

            String filePath = directoryPath + "/serializedObject.json";

            mapper.writeValue(new File(filePath), objectToSerialize);

        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage() + "\nERROR al serializar la data");
        } catch (IOException e) {
            System.out.println(e.getMessage() + "\n ERROR inesperado");
        }
    }
}
