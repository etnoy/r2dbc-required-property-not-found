package mwe;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.With;

@Value
@EqualsAndHashCode
@Builder
@With
public class User implements Serializable {

  private static final long serialVersionUID = 3097353498257801154L;

  @Id
  private final int id;

  @Transient
  private final Auth auth;

}
