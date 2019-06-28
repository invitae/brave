package brave.kafka.streams;

import java.util.Collections;
import java.util.Map;

public class SpanInfo {
  public final String spanName;
  public final Map<Long, String> annotations;
  public final Map<String, String> tags;

  public SpanInfo(String spanName, Map<Long, String> annotations, Map<String, String> tags) {
    this.spanName = spanName;
    this.annotations = annotations;
    this.tags = tags;
  }

  public SpanInfo(String spanName) {
    this.spanName = spanName;
    this.annotations = Collections.emptyMap();
    this.tags = Collections.emptyMap();
  }
}
