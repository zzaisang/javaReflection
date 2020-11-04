package reflection.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/04
 */
@Data
public class RequestParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key8;

    public RequestParamDto() {
        this.key1 = "key1";
        this.key2 = "key2";
        this.key3 = "key3";
        this.key4 = "key4";
        this.key5 = "key5";
        this.key6 = "key6";
        this.key7 = "key7";
        this.key8 = "key8";
    }
}
