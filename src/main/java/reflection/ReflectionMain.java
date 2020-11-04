package reflection;

import reflection.domain.ParamDto;
import reflection.domain.RequestParamDto;
import java.lang.reflect.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/04
 */
public class ReflectionMain {

    public static void main(String[] args) {

        final ParamDto paramDto = new ParamDto("01011112222", "zzaisang");
        System.out.println(paramDto.toString());

        try {

            final Class<ParamDto> paramDtoClass = ParamDto.class;


            final RequestParamDto requestParamDto = new RequestParamDto();

            final Class<? extends RequestParamDto> aClass = requestParamDto.getClass();

            for (Field field : aClass.getFields()) {

                final String name = field.getName();

                System.out.println(name);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
