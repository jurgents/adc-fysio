package nl.jts.fysioadc.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(staticName = "objectFactory")
public class LocatieMetPraktijk {

    @NonNull private String woonplaats;
    @NonNull private String link;

}
