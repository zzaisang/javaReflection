package reflection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import reflection.domain.ObjectValueDto;
import reflection.domain.ParamDto;
import reflection.domain.RequestParamDto;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/04
 */
public class ReflectionMain {

    public static void main(String[] args) {

        final List<ObjectValueDto> objectValueDtoList = paramSet();
        try {

            final Class<RequestParamDto> requestParamDtoClass = RequestParamDto.class;
            for (Field field : requestParamDtoClass.getDeclaredFields()) {
                field.setAccessible(true);
                final String fieldName = field.getName();
                for (Annotation annotation : field.getAnnotations()) {

                    if (annotation.annotationType() == JsonProperty.class){

                    }
                }
            }


            //createNewObject(requestParamDtoClass,objectMapperDtoList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Object createNewObject(Class<RequestParamDto> requestParamDtoClass, List<ObjectValueDto> objectValueDtoList) {

        final String paramKey = "key";
        final int i = 1;

        for (ObjectValueDto objectValueDto : objectValueDtoList) {

            final String key = objectValueDto.getKey();
            final String value = objectValueDto.getValue();

            for (Field field : requestParamDtoClass.getDeclaredFields()) {




            }


        }


        return null;
    }


    public static List<ObjectValueDto> paramSet(){
        final ParamDto paramDto = new ParamDto("01011112222", "zzaisang");

        final List<ObjectValueDto> objectValueDtoList = Arrays.asList(paramDto.getClass().getDeclaredFields())
                .stream()
                .map(v -> {
                    v.setAccessible(true);
                    try {
                        return new ObjectValueDto(v.getName(), v.get(paramDto).toString());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    return new ObjectValueDto();
                }).collect(Collectors.toList());
        objectValueDtoList.removeIf(v -> v.getKey() == null || v.getValue() == null);

        return objectValueDtoList;
    }

}
