package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_customer
 */
@Data
public class TCustomer implements Serializable {
    private Integer id;

    private String cname;

    private Integer age;

    private String phone;

    private Byte sex;

    private Date birth;

    private static final long serialVersionUID = 1L;
}