package reflection.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/04
 */
@Data
public class RequestParamDto {

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key1;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key2;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key3;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key4;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key5;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key6;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key7;

    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String key8;

    public RequestParamDto() {
        this.key1 = key1;
        this.key2 = key2;
        this.key3 = key3;
        this.key4 = key4;
        this.key5 = key5;
        this.key6 = key6;
        this.key7 = key7;
        this.key8 = key8;
    }
}
