package mwe;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.With;

@Value
@EqualsAndHashCode
@Builder
@With
public class Auth implements Serializable {

  private static final long serialVersionUID = -1511082836956413928L;

  @EqualsAndHashCode.Include
  @Id
  private int id;

}
