package az.neotech.commons.audit;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailedAudit {
    protected String createdBy;
    protected String modifiedBy;
    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;
}
