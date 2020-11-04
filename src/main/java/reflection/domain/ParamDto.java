package reflection.domain;

import lombok.Data;
import lombok.ToString;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/11/04
 */
@Data
@ToString
public class ParamDto {

    private String cellPhoneNumber;

    private String userName;

    public ParamDto(String cellPhoneNumber, String userName) {
        this.cellPhoneNumber = cellPhoneNumber;
        this.userName = userName;
    }
}
