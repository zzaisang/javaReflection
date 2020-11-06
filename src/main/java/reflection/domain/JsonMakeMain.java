package reflection.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/06
 */
@RequiredArgsConstructor
public class JsonMakeMain {


    public static void main(String[] args) throws JsonProcessingException {

        final ParamDto paramDto = new ParamDto("01000000000", "zzaisang");

        final ObjectMapper objectMapper = new ObjectMapper();
        final String string = objectMapper.writeValueAsString(paramDto);
        System.out.println(string);

        final HashMap<String,Object> hashMap = objectMapper.convertValue(paramDto, HashMap.class);

        System.out.println(hashMap);


    }

}
