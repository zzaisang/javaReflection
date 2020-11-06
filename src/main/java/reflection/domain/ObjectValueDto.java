package reflection.domain;

import lombok.Data;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/05
 */
@Data
public class ObjectValueDto {

    private String key;

    private String value;

    public ObjectValueDto(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public ObjectValueDto(){}

}
